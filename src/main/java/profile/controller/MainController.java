package profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import profile.entity.User;
import profile.repository.UserRepository;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String showMenu() {
        return "main";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/user")
    public String user() {
        return ("user");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("admin");
    }

    @ModelAttribute("user")
    public User getUserObject() {
        return new User();
    }

    @PostMapping("/register")
    public String addUser(@RequestParam(name = "userName") String userName,
                          @Valid User user, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "register";
        } else {
            userRepository.save(user);
            model.addAttribute("userName", userName);
            return "success";
        }
    }
}
