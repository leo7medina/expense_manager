package ec.com.tio.leo.dev.exma.service.impl;

import ec.com.tio.leo.dev.exma.enums.TypeCategoryEnum;
import ec.com.tio.leo.dev.exma.persistence.entity.CategoryEntity;
import ec.com.tio.leo.dev.exma.persistence.repository.ICategoryRepository;
import ec.com.tio.leo.dev.exma.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;


    @Override
    public List<CategoryEntity> findByType(TypeCategoryEnum type) {
        return this.categoryRepository.findByType(type);
    }
}
