package com.florist.xx_letter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tweets")
public class TweetController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
