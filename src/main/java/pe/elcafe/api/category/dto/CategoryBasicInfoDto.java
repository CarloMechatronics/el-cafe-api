package pe.elcafe.api.category.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.product.domain.Product;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoryBasicInfoDto {
    private String name;

    private String description;

    private String imageUrl;

    private List<Product> products;
}
