package com.pvobrien.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/") // this is the js app.get("/")
    public String showHome() {
        return "home";
    }

    @GetMapping("/hello")
    public String sayHello(
            Model welcome,
            String person,
            String message
    ) {
        welcome.addAttribute("message", message);
        return "hello";
    }

    @GetMapping("/capitalize/{toCapitalize}")
    public String sayHello(
            Model welcome,
            @PathVariable String toCapitalize)
         {
            System.out.println(toCapitalize);
        welcome.addAttribute("word", toCapitalize.toUpperCase());
        return "capitalize";
    }
}