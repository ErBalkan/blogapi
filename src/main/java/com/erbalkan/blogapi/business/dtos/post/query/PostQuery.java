package com.erbalkan.blogapi.business.dtos.post.query;

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
public class PostQuery extends BaseDto {
    private String title;
    private String content;
    private String author;
    private Long categoryId;
    private String categoryName;
}
