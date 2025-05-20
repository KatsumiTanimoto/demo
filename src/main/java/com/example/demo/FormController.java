package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class FormController {

    @PostMapping("/submit")
    public String handleForm(
            @RequestParam("name") String name,
            @RequestParam("message") String message,
            Model model) {

        model.addAttribute("name", name);
        model.addAttribute("message", message);
        return "result"; // result.html を表示
    }
}