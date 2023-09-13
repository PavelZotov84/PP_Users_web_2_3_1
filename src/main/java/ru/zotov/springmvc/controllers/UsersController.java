package ru.zotov.springmvc.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.zotov.springmvc.models.User;
import ru.zotov.springmvc.service.UserService;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;


    @GetMapping()
    public String PrintAllUsers(Model model) {
        model.addAttribute("user", userService.getAllUsers());
        return "all-users";
    }

    @GetMapping("/new")
    public String AddNewUser(Model model) {
        model.addAttribute("person", new User());
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") User user) {
        userService.createUser(user);
        return "redirect:/users";
    }


    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("person", userService.readUser(id));
        return "edit";
    }

    @PostMapping("/{id}")
    public String update(@ModelAttribute("person") User user, @PathVariable("id") int id) {
        userService.update(id, user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable("id") int id) {
        //    System.out.println("delete"+id);
        userService.delete(id);
        return "redirect:/users";
    }
}
