package profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
    @GetMapping("/")
    public String showMenu() {
        return "main";
    }

    @GetMapping("/user")
    public String user() {
        return ("user");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("admin");
    }
}
