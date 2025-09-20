package com.erbalkan.blogapi.core.base;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@MappedSuperclass
public abstract class BaseEntity {

    // Fields
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="created_at",nullable=false,updatable=false)
    private LocalDateTime createdAt;

    @Column(name="updated_at",nullable=false)
    private LocalDateTime updatedAt;
    
    // Getters
    public Long getId(){return this.id;}
    public LocalDateTime getCreatedAt(){return this.createdAt;}
    public LocalDateTime getUpdatedAt(){return this.updatedAt;}


        // === JPA Lifecycle Callbacks ===
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }


}
