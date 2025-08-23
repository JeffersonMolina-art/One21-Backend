package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.CategoryDto;
import gt.edu.umg.business.partners.service.entities.Category;
import gt.edu.umg.business.partners.service.services.CategoryService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("categories")
public class CategoryController extends GenericController<CategoryDto, Category, Integer> {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        super(categoryService);
        this.categoryService = categoryService;
    }
}
