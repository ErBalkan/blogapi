package com.erbalkan.blogapi.core.base;

import java.time.LocalDateTime;

public abstract class BaseDto {

    // Fields
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructors
    public BaseDto(){}
    // Getters
    public Long getId(){return this.id;}
    public LocalDateTime getCreatedAt(){return this.createdAt;}
    public LocalDateTime getUpdatedAt(){return this.updatedAt;}
    
    // Setters
    public void setId(Long id){this.id=id;}
    public void setUpdatedAt(LocalDateTime updatedAt){this.updatedAt = updatedAt;}
    public void setCreatedAt(LocalDateTime createdAt){this.createdAt = createdAt;}
}
