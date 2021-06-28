package com.example.demo.controller;

import com.example.demo.model.Like;
import com.example.demo.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class LikeController {
    @Autowired
    private LikeRepository likeRepository;

    @PostMapping("/addlike")
    public String saveLike(@RequestBody Like like) {
        System.out.println(like.getId_user()+"-"+like.getId_blog());
        int length = likeRepository.findByLike(like.getId_user(),like.getId_blog()).size();
        System.out.println(length);
        if (length==0){
            likeRepository.save(like);
            return "Saved like";
        }

        likeRepository.delByLike(like.getId_user(), like.getId_blog());

        return "del like";
    }

//    @GetMapping("/getlike/{id_blog}")
//    public List<Like> getLike() {
//        return likeRepository.findAll();
//    }

    @GetMapping("/getlike")
    public List<Like> getLike() {
        return likeRepository.getIdBlog();
    }

    @DeleteMapping("/deletelike/{id}&&{id_user}&&{id_blog}")
    public String deleteLike(@PathVariable(name = "id") long id) {
        likeRepository.deleteById(id);
        return "delete like";
    }


}
