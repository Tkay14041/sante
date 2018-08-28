package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MegBeauty1 {
    @GetMapping("/")
    public String megbeauty(){
        return "/beauty/megbeauty";
    }
}
