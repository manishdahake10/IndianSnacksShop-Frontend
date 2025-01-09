package com.ts.Controller;

import com.ts.DTO.UserDTO;
import com.ts.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "user";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute UserDTO userDTO) {
        userService.createUser(userDTO);
        return "redirect:/users/";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/users/";
    }
}
