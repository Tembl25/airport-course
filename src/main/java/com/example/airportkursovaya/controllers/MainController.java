package com.example.airportkursovaya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() { return "home"; }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/news")
    public String news() {
        return "news";
    }

    @GetMapping("/flights")
    public String flights() { return "flights"; }

    @GetMapping("/airlines")
    public String airlines() {
        return "airlines";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }
}
