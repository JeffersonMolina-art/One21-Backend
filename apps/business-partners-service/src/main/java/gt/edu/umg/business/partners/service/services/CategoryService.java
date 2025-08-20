package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.CategoryDto;
import gt.edu.umg.business.partners.service.entities.Category;
import gt.edu.umg.business.partners.service.repositories.CategoryRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends GenericServiceImpl<CategoryDto, Category, Integer> {

    private CategoryRepository categoryRepository;
    private GenericMapper mapper;

    public CategoryService(CategoryRepository categoryRepository, GenericMapper mapper) {
        super(categoryRepository, mapper, CategoryDto.class, Category.class);
        this.categoryRepository = categoryRepository;
        this.mapper = mapper;
    }
}
