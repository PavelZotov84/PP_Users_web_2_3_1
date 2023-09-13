package ru.zotov.springmvc.service;

import ru.zotov.springmvc.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void createUser(User user);

    void update(int id, User updatedUser);

    void delete(int id);

    User readUser(int id);

}
