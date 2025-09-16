package com.erbalkan.blogapi.entities;

import com.erbalkan.blogapi.core.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="posts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post extends BaseEntity{

    @Column(name="title")
    private String title;
    @Column(name="content")
    private String content;
    @Column(name="author")
    private String author;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
}
