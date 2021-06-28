package com.example.demo.controller;

import com.example.demo.model.Comment;
import com.example.demo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @PostMapping("/addcomment")
    public String saveComment(@RequestBody Comment comment){
        commentRepository.save(comment);
        return "save comment";
    }

    @GetMapping("/getcomment")
    public List<Comment> getComment() {
        return commentRepository.findAll();
    }
}
