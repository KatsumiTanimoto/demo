package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class FormController {

    @PostMapping("/submit")
    public String handleFormSubmit(@RequestParam("name") String name,
                                   @RequestParam("message") String message,
                                   Model model) {
        // 受け取ったデータをログに表示（確認用）
        System.out.println("入力情報をご確認ください");
        System.out.println("氏名: " + name);
        System.out.println("メッセージ: " + message);


        // 受け取ったデータをビューに渡す
        model.addAttribute("name", name);
        model.addAttribute("message", message);

        // 結果表示用HTMLを返す（例: result.html）
        return "result";
    }
}
