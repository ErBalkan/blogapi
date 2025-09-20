package com.erbalkan.blogapi.business.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.erbalkan.blogapi.business.dtos.category.query.CategoryQuery;
import com.erbalkan.blogapi.entities.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryQuery toDto (Category category);
    Category toEntity (CategoryQuery dto);
}
