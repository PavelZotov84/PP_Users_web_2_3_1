package ru.zotov.springmvc.dao;

import org.springframework.stereotype.Component;
import ru.zotov.springmvc.models.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDao {
    private List<User> user;
    {
        user = new ArrayList<>();
        user.add(new User(1,"Pavel","Zotov","zotov-p@rambler.ru"));
        user.add(new User(2,"Elena","Zotova","elena@rambler.ru"));
        user.add(new User(3,"Vlad","Zotov","vlad@rambler.ru"));
        user.add(new User(4,"Elisey","Zotov","elisey@rambler.ru"));
        user.add(new User(5,"Benny","Zotov","benny@rambler.ru"));
    }
    public List<User> index(){
        return user;
    }
    public User show(int id){
        return user.stream().filter(user -> user.getId()==id).findAny().orElse(null);
    }
}
