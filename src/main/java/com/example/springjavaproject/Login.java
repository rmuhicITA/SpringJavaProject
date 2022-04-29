package com.example.springjavaproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {


    /*@GetMapping("/hello")
    public String mainWithParam() {
        return "welcome"; //view
    }*/

    @GetMapping("/hello")
    public String mainWithParam(@RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) {

        model.addAttribute("message", name);

        return "welcome"; //view
    }

    @PostMapping("/login")
    public String callFromForm(@RequestParam(name="username") String username, @RequestParam(name="password") String password) {
        if(username.equals("rmuhic1") && password.equals("password"))
            return "home";
        else
            return "error";
    }
}
