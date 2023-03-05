package com.example.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {

    @GetMapping(value = "/")
    public String getIndexPage() {

        return "index";
    }
    @GetMapping("/login")
    public ModelAndView getLoginPage() {
        ModelAndView view = new ModelAndView("login");
        view.addObject("PageTitle", "Login");
        return view;
    }
    @GetMapping("/register")
    public ModelAndView getRegisterPage() {
        ModelAndView view = new ModelAndView("register");
        view.addObject("PageTitle", "Register");
        return view;
    }

}
