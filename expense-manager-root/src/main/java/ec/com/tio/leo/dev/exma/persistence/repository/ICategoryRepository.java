package ec.com.tio.leo.dev.exma.persistence.repository;

import ec.com.tio.leo.dev.exma.enums.TypeCategoryEnum;
import ec.com.tio.leo.dev.exma.persistence.entity.CategoryEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ICategoryRepository extends ListCrudRepository<CategoryEntity, Long> {

    List<CategoryEntity> findByType(TypeCategoryEnum type);
}
