package org.studyeasy.spring_starter.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.studyeasy.spring_starter.Models.Account;
import org.studyeasy.spring_starter.Models.Post;
import org.studyeasy.spring_starter.services.AccountService;
import org.studyeasy.spring_starter.services.PostService;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private AccountService accountService;

    @Autowired
    private PostService postService;

    @Override
    public void run(String... args) throws Exception {



        Account account01 = new Account();
        Account account02= new Account();

        account01.setEmail("Jndtak01@gmail.com");
        account01.setPassword("password");
        account01.setFirstname("Jnd");

        account02.setEmail("Jndtak02@gmail.com");
        account02.setPassword("password");
        account02.setFirstname("Jndtak");

        accountService.save(account01);
        accountService.save(account02);


    List<Post> posts = postService.getAll();
    if(posts.size() == 0){
        Post post01 = new Post();
        post01.setTitle("post 01");
        post01.setBody("post 01 bodyyy");
        post01.setAccount(account01);
        postService.save(post01);

        Post post02 = new Post();
        post02.setTitle("post 02");
        post02.setBody("post 02 bodyyy");
        post02.setAccount(account02);
        postService.save(post02);

    }    
    }
    
}
