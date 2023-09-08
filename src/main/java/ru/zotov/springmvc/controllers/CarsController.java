package ru.zotov.springmvc.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.zotov.springmvc.dao.UserDao;
import ru.zotov.springmvc.models.User;


import java.util.List;

@Controller
public class CarsController {
    private UserDao userDao;
    @Autowired
    CarsController(UserDao userDao){
        this.userDao= userDao;
    }
    @GetMapping(value = "/cars")
    public String printCarsOfCount(Model model) {
        System.out.println(userDao.index());
        model.addAttribute("user", userDao.index());
        return "users";
    }
}



