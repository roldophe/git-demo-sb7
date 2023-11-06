package com.istad.demogit;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/demos")
public class ControllerDemo {
    @PostMapping
    public String getFirstDemo(@RequestBody String keyWord){
        return keyWord;
    }
}
