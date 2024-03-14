package ec.com.tio.leo.dev.exma.service;

import ec.com.tio.leo.dev.exma.enums.TypeCategoryEnum;
import ec.com.tio.leo.dev.exma.persistence.entity.CategoryEntity;

import java.util.List;

public interface ICategoryService {

    List<CategoryEntity> findByType(TypeCategoryEnum type);
}
