package com.ely.SpringStartHere.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/home")
    public String home(Model page, @RequestParam(required = false) String colour, @RequestParam(required = false) String name) {
        page.addAttribute("username", name);
        page.addAttribute("colour", colour);
        return "home.html";
    }
}
