package pe.elcafe.api.brand.dto;

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
public class BrandBasicInfoDto {
    private String name;

    private String description;

    private String imageUrl;

    private List<Product> products;
}