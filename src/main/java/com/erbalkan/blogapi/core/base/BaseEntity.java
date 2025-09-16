package com.erbalkan.blogapi.core.base;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

    // Fields
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="created_at",updatable=false)
    @JsonFormat(pattern = "dd/MM/yyyy/HH:mm")
    private LocalDateTime createdAt;

    @Column(name="updated_at")
    @JsonFormat(pattern = "dd/MM/yyyy/HH:mm")
    private LocalDateTime updatedAt;
    
    // Setters
    public void setUpdatedAt(LocalDateTime updatedAt){this.updatedAt = updatedAt;}
    public void setCreatedAt(LocalDateTime createdAt){this.createdAt = createdAt;}

    // Getters
    public Long getId(){return this.id;}
    public LocalDateTime getCreatedAt(){return this.createdAt;}
    public LocalDateTime getUpdatedAt(){return this.updatedAt;}
}
