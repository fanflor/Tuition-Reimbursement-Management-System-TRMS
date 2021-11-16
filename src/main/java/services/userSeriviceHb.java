package services;

import Repository.UserRepo;
import models.user;
import util.Mylogger;

import java.util.List;

public class userSeriviceHb implements userService {
    UserRepo oner;

    public userSeriviceHb(UserRepo one)
    {this.oner=one;}

    @Override
    public user addUser(user one) {
        return oner.addUser(one);
    }

    @Override
    public List<user> getAllUser() {
        Mylogger.logger.info("this is where we are all user");
        return oner.getAllUser();
    }

    @Override
    public user getUserById(int id) {

        Mylogger.logger.info("this is where we are all user by id");
        return oner.getUserById(id);
    }

//    @Override
//    public user updateUser(user change) {
//        return oner.updateUser(change);
//    }
//
//    @Override
//    public user deleteUser(int id) {
//        return oner.deleteUser(id);
//    }
}
