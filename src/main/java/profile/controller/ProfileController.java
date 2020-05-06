package profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String profilePage() {
        return "profile";
    }

    @GetMapping("/page2")
    public String showSecondPage() {
        return "main_page2";
    }
}