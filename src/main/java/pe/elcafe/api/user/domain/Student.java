package pe.elcafe.api.user.domain;

import jakarta.persistence.*;
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
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private ShoppingCart shoppingCart;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<PurchaseOrder> purchaseOrders = new ArrayList<>();

    public Student(String studentCode, String password, String names, String paternalSurname, String maternalSurname, String dni, String email, String phone) {
        super.setUsername(studentCode);
        super.setPassword(password);
        super.setNames(names);
        super.setPaternalSurname(paternalSurname);
        super.setMaternalSurname(maternalSurname);
        this.setDni(dni);
        super.setEmail(email);
        super.setPhone(phone);
        super.setRole(Role.USER);
    }
}
