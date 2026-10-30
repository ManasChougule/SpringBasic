package com.springmvclearn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
//	@GetMapping("/hello")
//	public String hello() {
//        return "index2"; // or /WEB-INF/views/index2.jsp if you never configured view resolver
//    }
	
	
	@RequestMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("message", "Welcome to your deployed Spring MVC App!");
        model.addAttribute("pageTitle", "Home Dashboard");
        return "index"; 
    }

    @RequestMapping("/hello")
    public String showHelloPage(Model model) {
        model.addAttribute("message", "Hello! Glad you navigated over here.");
        model.addAttribute("username", "Guest User"); 
        return "index"; 
    }
    
}
