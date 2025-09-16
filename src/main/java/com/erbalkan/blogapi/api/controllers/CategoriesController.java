package com.erbalkan.blogapi.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erbalkan.blogapi.business.abstracts.CategoryService;
import com.erbalkan.blogapi.business.dtos.category.command.CategoryCreateCommand;
import com.erbalkan.blogapi.business.dtos.category.command.CategoryDeleteCommand;
import com.erbalkan.blogapi.business.dtos.category.command.CategoryUpdateCommand;
import com.erbalkan.blogapi.business.dtos.category.query.CategoryQuery;
import com.erbalkan.blogapi.core.utilities.result.abstracts.IDataResult;
import com.erbalkan.blogapi.core.utilities.result.abstracts.IResult;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoriesController {

    private final CategoryService _categoryService;

    @PostMapping(path="/add")
    public IResult add(@RequestBody CategoryCreateCommand dto){
        return _categoryService.add(dto);
    }

    @PutMapping(path="/update")
    public IResult update(@RequestBody CategoryUpdateCommand dto){
        return _categoryService.update(dto);
    }

    @DeleteMapping(path="/delete")
    public IResult delete(@RequestBody CategoryDeleteCommand dto){
        return _categoryService.delete(dto);
    }

    @GetMapping(path="/{id}")
    public IDataResult<CategoryQuery> getById(@PathVariable Long id){
        return _categoryService.getById(id);
    }

    @GetMapping(path="/getall")
    public IDataResult<List<CategoryQuery>> getAll(){
        return _categoryService.getAll();
    }
}

/*
@RequestBody → JSON’dan DTO’ya otomatik mapping sağlar.

@PathVariable → URL parametresini alır (/api/categories/1 gibi).
*/