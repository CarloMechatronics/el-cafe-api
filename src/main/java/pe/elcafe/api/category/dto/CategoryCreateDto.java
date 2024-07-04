package pe.elcafe.api.category.dto;

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
public class CategoryCreateDto {
    @NotBlank
    @Size(max = 31)
    private String name;

    @NullableSize(max = 255)
    private String description;

    private String imageUrl;

    private Boolean active;
}
