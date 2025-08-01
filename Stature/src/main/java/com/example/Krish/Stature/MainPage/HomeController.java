package com.example.Krish.Stature.MainPage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.Krish.Stature.MainPage.Model.User;

@Controller
@SessionAttributes("User")
@RequestMapping("Home")
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;
 
    @GetMapping("/")
    public String get(Model model){
        model.addAttribute("message", "this should be green");
        model.addAttribute("user", new User());
        

        return "index.html";
    }
}


