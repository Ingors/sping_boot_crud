package ru.sbtn.sping_boot_crud.service;

import ru.sbtn.sping_boot_crud.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(int id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}