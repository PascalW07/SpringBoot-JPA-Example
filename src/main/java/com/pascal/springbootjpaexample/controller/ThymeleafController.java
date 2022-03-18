package com.pascal.springbootjpaexample.controller;

import com.pascal.springbootjpaexample.service.BookModelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    private final BookModelService bookModelService;

    public ThymeleafController(BookModelService bookModelService) {
        this.bookModelService = bookModelService;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("books", bookModelService.findAll());
        return "index";
    }
}
