package com.ankit.demo.controller;

import com.ankit.demo.service.PostService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

        private final RestTemplate restTemplate;

    public PostController(PostService postService, RestTemplate restTemplate) {
        this.postService = postService;
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public String findAll(){
        return postService.findAll();
    }

    @GetMapping("/load")
    public String loadPosts(){
        return "load-posts";
    }

    @PostMapping(produces = "application/json")
    public String add(@RequestBody String str){
        System.out.println(str);
        return "Done "  + str;
    }
}
