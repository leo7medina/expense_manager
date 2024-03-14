package ec.com.tio.leo.dev.exma.persistence.entity;

import ec.com.tio.leo.dev.exma.commons.EXMAConstants;
import ec.com.tio.leo.dev.exma.enums.TypeCategoryEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "CATEGORY")
public class CategoryEntity extends AbstractAuditableField<UserEntity, Long> {

    @Serial
    private static final long serialVersionUID = -9167164576773958458L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCATEGORY", nullable = false)
    private Long idCategory;

    @Column(name = "NAME", nullable = false, length = 60)
    private String name;

    @Column(name = "COLOR",length = 30)
    private String color;

    @Column(name = "ICON", length = 30)
    private String icon;

    @Column(name = "TYPECATEGORY", nullable = false, length = 30)
    @Enumerated(EnumType.STRING)
    private TypeCategoryEnum type;

    @Override
    public Long getId() {
        return idCategory;
    }
}
