package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/fukuchan")
    public String home() {
        return "index";  // templates/index.html を表示するよ
    }
}
