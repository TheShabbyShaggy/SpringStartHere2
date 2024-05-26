package com.ely.SpringStartHere.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/home/{color}")
    public String home(Model page, @PathVariable String color) {
        page.addAttribute("username", "Anuj");
        page.addAttribute("colour", color);
        return "home.html";
    }
}
