package ec.com.tio.leo.dev.exma.controller;

import ec.com.tio.leo.dev.exma.enums.TypeCategoryEnum;
import ec.com.tio.leo.dev.exma.persistence.entity.CategoryEntity;
import ec.com.tio.leo.dev.exma.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    @Autowired()
    private ICategoryService categoryService;


    @GetMapping(path = "/findByIncome", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CategoryEntity>> findByIncome() {
        return ResponseEntity.ok(this.categoryService.findByType(TypeCategoryEnum.INCOME));
    }

    @GetMapping(path = "/findByExpense", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CategoryEntity>> findByExpense() {
        return ResponseEntity.ok(this.categoryService.findByType(TypeCategoryEnum.EXPENSE));
    }
}
