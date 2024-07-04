package pe.elcafe.api.brand.dto;

import pe.elcafe.api.product.domain.Product;

import java.util.List;

public class BrandBasicInfoDto {
    private String name;

    private String description;

    private String imageUrl;

    private Boolean active;

    private List<Product> products;
}
