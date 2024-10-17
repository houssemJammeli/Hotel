package com.example.hotel.Controllers;

import com.example.hotel.Models.User;
import com.example.hotel.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    UserService userService ;

    @RequestMapping(value = "/addUser")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("UserForm", user);
        return "new_user";
    }

    @RequestMapping(value= "/save", method= RequestMethod.POST)
    public String saveUser(@ModelAttribute("UserForm") User user){
        userService.ajouter(user);
        return "redirect:/all";
    }
}
