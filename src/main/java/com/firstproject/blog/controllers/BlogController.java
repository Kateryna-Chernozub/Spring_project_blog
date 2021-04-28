package com.firstproject.blog.controllers;

import com.firstproject.blog.models.Post;
import com.firstproject.blog.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class BlogController {

    //@ - для створення змінної що посилається на репозиторій
    //TODO за потреби змінити (required = false)
    @Autowired(required = true)
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blogMain(Model model) {
        //обєкт на основі класу   (масив даних, в якому будуть знаходитись всі значення з таблички )
        Iterable<Post> posts = postRepository.findAll();
        //Пости передаю в модель по імені "posts"
        model.addAttribute("posts", posts);
        return "blog-main";
    }

    @GetMapping("/blog")
    public String blogAdd(Model model) {
        return "blog-add";
    }

}
