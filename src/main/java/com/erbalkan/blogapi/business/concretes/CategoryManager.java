package com.erbalkan.blogapi.business.concretes;



import java.util.List;

import org.springframework.stereotype.Service;

import com.erbalkan.blogapi.business.abstracts.CategoryService;
import com.erbalkan.blogapi.business.dtos.category.command.CategoryCreateCommand;
import com.erbalkan.blogapi.business.dtos.category.command.CategoryDeleteCommand;
import com.erbalkan.blogapi.business.dtos.category.command.CategoryUpdateCommand;
import com.erbalkan.blogapi.business.dtos.category.query.CategoryQuery;
import com.erbalkan.blogapi.core.utilities.result.abstracts.IDataResult;
import com.erbalkan.blogapi.core.utilities.result.abstracts.IResult;
import com.erbalkan.blogapi.core.utilities.result.concretes.error.ErrorResult;
import com.erbalkan.blogapi.core.utilities.result.concretes.success.SuccessDataResult;
import com.erbalkan.blogapi.core.utilities.result.concretes.success.SuccessResult;
import com.erbalkan.blogapi.dataAccess.CategoryRepository;
import com.erbalkan.blogapi.entities.Category;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {

    private final CategoryRepository _categoryRepository;

    @Override
    public IResult add(CategoryCreateCommand dto) {
        Category category = new Category();
        category.setName(dto.getName());
        _categoryRepository.save(category);
        return new SuccessResult("Kategori başarıyla eklendi.");
    }

    @Override
    public IResult update(CategoryUpdateCommand dto) {
        Category category = _categoryRepository.findById(dto.getId()).orElse(null);
        if(category == null){
            return new ErrorResult("Kategori bulunamadı!");
        }
        category.setName(dto.getName());
        _categoryRepository.save(category);
        return new SuccessResult("Kategori başarıyla güncellendi.");
    }

    @Override
    public IResult delete(CategoryDeleteCommand dto) {
        boolean result = _categoryRepository.existsById(dto.getId());
        if(result == false){
            return new ErrorResult("Kategori bulunamadı!");
        }
        _categoryRepository.deleteById(dto.getId());
        return new SuccessResult("Kategori başarıyla silindi.");
    }

    @Override
    public IDataResult<CategoryQuery> getById(Long id) {
        Category category = _categoryRepository.findById(id).get();
        CategoryQuery data = new CategoryQuery();
        data.setId(category.getId());
        data.setName(category.getName());
        return new SuccessDataResult<>(data,"Kategori bulundu.");

    }

    @Override
    public IDataResult<List<CategoryQuery>> getAll() {
        List<Category> result = _categoryRepository.findAll();
        List<CategoryQuery> data = result.stream()
            .map(category -> new CategoryQuery(
                category.getId(),
                category.getName()
            )).toList();
        return new SuccessDataResult<>(data,"Kategoriler listelendi.");
    }

    



}
