package com.erbalkan.blogapi.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erbalkan.blogapi.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
