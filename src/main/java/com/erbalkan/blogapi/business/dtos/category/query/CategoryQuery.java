package com.erbalkan.blogapi.business.dtos.category.query;


import com.erbalkan.blogapi.core.base.BaseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryQuery extends BaseDto {
    private Long id;
    private String name;
}
