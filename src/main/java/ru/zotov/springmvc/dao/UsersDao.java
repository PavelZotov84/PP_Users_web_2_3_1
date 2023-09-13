package ru.zotov.springmvc.dao;

import ru.zotov.springmvc.models.User;

import java.util.List;

public interface UsersDao {

    List<User> listUsers();

    void add(User user);

    void update(int id, User updatedUser);

    User readUser(int id);

    void delete(int id);
}
