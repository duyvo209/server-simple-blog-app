package com.example.demo.service;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

//    public List<Blog> listBlog() {
//        return blogRepository.findAll();
//    }
}
