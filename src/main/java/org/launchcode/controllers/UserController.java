package org.launchcode.controllers;

import ch.qos.logback.core.model.Model;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm(){
        return "user/add";
    }

    public String processAddUserForm(Model model, @ModelAttribute User user, String verify){
       if (verify == user.getPassword()) {
           return "index";
       }

       else{
           return "add";
       }
    }
}
