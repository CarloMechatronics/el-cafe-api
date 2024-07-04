package pe.elcafe.api.brand.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.constraints.nullablesize.NullableSize;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BrandCreateDto {
    @NotBlank
    @Size(max = 63)
    private String name;

    @NullableSize(max = 255)
    private String description;

    private String imageUrl;

    private Boolean active;
}
