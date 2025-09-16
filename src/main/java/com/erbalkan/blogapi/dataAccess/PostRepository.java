package com.erbalkan.blogapi.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erbalkan.blogapi.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
