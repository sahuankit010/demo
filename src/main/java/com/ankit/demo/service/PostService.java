package com.ankit.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    public String findAll(){
        return "All Posts";
    }
}
