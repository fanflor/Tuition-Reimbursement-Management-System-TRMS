package services;

import models.user;

import java.util.List;

public interface userService {
    public user addUser(user one);
    public List<user> getAllUser();
    public user getUserById(int id);
//    public user updateUser(user change);
//    public user deleteUser(int id);
}
