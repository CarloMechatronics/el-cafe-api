package pe.elcafe.api.discount.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import pe.elcafe.api.constraints.validdiscount.ValidDiscount;
import pe.elcafe.api.product.domain.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ValidDiscount
    @Column(nullable = false)
    private BigDecimal discountPercentage;

    @NotNull
    @FutureOrPresent
    @Column(nullable = false)
    private LocalDate startDate;

    @NotNull
    @Future
    @Column(nullable = false)
    private LocalDate endDate;

    @PositiveOrZero
    private Integer stockQty;

    @NotNull
    @Column(nullable = false)
    private Boolean active = Boolean.TRUE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime lastUpdatedDate;
}
