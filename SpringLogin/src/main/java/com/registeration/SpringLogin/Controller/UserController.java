package com.registeration.SpringLogin.Controller;


import com.registeration.SpringLogin.Entity.User;
import com.registeration.SpringLogin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public User user()
    {
        return new User();
    }
    @GetMapping
    public String showregistration(){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user")  User theUser )
    {
        userService.save(theUser);
        return "redirect:/registration?success";
    }
}
