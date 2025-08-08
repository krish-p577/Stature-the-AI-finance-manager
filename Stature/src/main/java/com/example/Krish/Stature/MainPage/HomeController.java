package com.example.Krish.Stature.MainPage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.Krish.Stature.MainPage.Model.User;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@SessionAttributes("User")
@RequestMapping()
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;
 
    @GetMapping("home")
    public String Home(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("name", "Enter your yearly income here:");
        // model.addAttribute("income", "fake values");
        model.addAttribute("expences", "Enter your monthly expences here, click the plus to add more");
        return "home.html";
    }

    @PostMapping("home")
    public String Home(@ModelAttribute User user, Model model){

        System.out.println("got info" + user.getIncome());
        model.addAttribute("income", "you make " + user.getIncome() + " a year");
        model.addAttribute("expences","You lose " +  user.getExpences() + " a month");       

        return "home.html";
    }
    
    @GetMapping("option")
    public String option(Model model) {
        return new String();
    }
    
}


