package ec.com.tio.leo.dev.exma.vo;

import ec.com.tio.leo.dev.exma.enums.TypeCategoryEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryVO {

    private Long idCategory;
    private String name;
    private String color;
    private String icon;
    private TypeCategoryEnum type;
}
