package com.App.Login.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000/home")
public class TestingController {

        @GetMapping("/test")
        public String test (){
            return " Testing Api .......!  ";
        }

}

