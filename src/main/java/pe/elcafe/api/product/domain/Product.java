package pe.elcafe.api.product.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import pe.elcafe.api.brand.domain.Brand;
import pe.elcafe.api.category.domain.Category;
import pe.elcafe.api.constraints.nullablesize.NullableSize;
import pe.elcafe.api.discount.domain.Discount;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 63)
    @Column(nullable = false, length = 63)
    private String name;

    @NotBlank
    @Size(max = 31)
    @Column(nullable = false, length = 31)
    private String presentation;

    @NullableSize(max = 255)
    @Column(length = 255)
    private String description;

    @NullableSize(max = 31)
    @Column(unique = true, length = 31)
    private String sku;

    @NotNull
    @DecimalMin(value = "0.0")
    @Column(nullable = false)
    private BigDecimal price;

    @NotNull
    @PositiveOrZero
    @Column(nullable = false)
    private Integer stockQty = 0;

    @NullableSize(min=3)
    private String imageUrl;

    @NotNull
    @Column(nullable = false)
    private Boolean active = Boolean.FALSE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(nullable = false)
    private List<Discount> discounts = new ArrayList<>();

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime lastUpdatedDate;
}
