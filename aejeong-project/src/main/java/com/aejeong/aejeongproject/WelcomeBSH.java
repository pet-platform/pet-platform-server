package com.aejeong.aejeongproject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeBSH {
    @GetMapping({"/bsh"})
    public String getWelcomeMessage(){return "welcome";
    }
}
