package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/beauty")
public class Controller {
    @GetMapping("photo")
    public String photo(){
        return "beauty/photo";
    }
}
