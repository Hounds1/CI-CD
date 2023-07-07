package me.hounds1.cicd.exam.domain.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String helloPage() {
        return "/hello";
    }
}
