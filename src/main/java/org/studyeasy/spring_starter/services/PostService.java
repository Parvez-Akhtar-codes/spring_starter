package org.studyeasy.spring_starter.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.spring_starter.Models.Post;
import org.studyeasy.spring_starter.repositories.PostRepository;

@Service
public class PostService {
     @Autowired
        private PostRepository postRepository;

        public Optional<Post> getById(Long id){
            return postRepository.findById(id);
        }

        public List<Post> getAll(){
            return postRepository.findAll();
        }

        public void delete(Post post){
             postRepository.delete(post);
        }

        public Post save(Post post){
            if ( post.getId() == 0L){
                post.setCreatedAt(LocalDateTime.now());
            }
            return postRepository.save(post);
        }
    
}
