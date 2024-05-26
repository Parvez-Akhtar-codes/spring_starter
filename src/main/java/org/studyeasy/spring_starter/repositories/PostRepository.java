package org.studyeasy.spring_starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.studyeasy.spring_starter.Models.Post;

public interface PostRepository extends JpaRepository<Post ,Long> {


    
} 