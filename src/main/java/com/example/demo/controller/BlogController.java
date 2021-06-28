package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BlogController {
    @Autowired
    private BlogRepository blogRepository;

    @PostMapping("/addblog")
    public String saveBlog(@RequestBody Blog blog) {
        blogRepository.save(blog);
        return "saved blog";
    }

    @GetMapping("/getblog")
    public List<Blog> getBlog() {
       return blogRepository.findAll();
    }
}
