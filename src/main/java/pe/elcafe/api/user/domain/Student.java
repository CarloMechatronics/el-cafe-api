package pe.elcafe.api.user.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.purchaseorder.domain.PurchaseOrder;
import pe.elcafe.api.shoppingcart.domain.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student extends UserAccount {
    @NotBlank
    @Size(min = 7, max = 15)
    @Column(unique = true, nullable = false, length = 15)
    private String studentCode;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private ShoppingCart shoppingCart;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<PurchaseOrder> purchaseOrders = new ArrayList<>();

    public Student(String studentCode, String password, String firstName, String middleName, String lastName, String email, String phone) {
        super.setUsername(studentCode);
        super.setPassword(password);
        super.setFirstName(firstName);
        super.setMiddleName(middleName);
        super.setLastName(lastName);
        super.setEmail(email);
        super.setPhone(phone);
        super.setRole(Role.USER);
        this.studentCode = studentCode;
    }
}
