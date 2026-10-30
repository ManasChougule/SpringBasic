package com.springmvclearn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
	@GetMapping("/hello")
	public String hello() {
        return "index2"; // or /WEB-INF/views/index2.jsp if you never configured view resolver
    }
}
