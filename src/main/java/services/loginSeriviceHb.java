package services;

import Repository.loginRepo;
import models.login;

import java.util.ArrayList;
import java.util.List;

public class loginSeriviceHb implements loginService{
    loginRepo oner;

    public loginSeriviceHb(loginRepo one)
    {
        this.oner= one;
    }

//    public loginSeriviceHb() {
//        oner=null;
//    }

//    @Override
//    public login addLogin(login one) {
//        return oner.addLogin(one);
//    }

    @Override
    public List<login> getAllLogin() {
        return oner.getAllLogin();
    }

    @Override
    public login getById(int id) {
        return oner.getById(id);
    }

//    @Override
//    public login updateLogin(login change) {
//        return oner.updateLogin(change);
//    }
//
//    @Override
//    public login deleteLogin(int id) {
//        return oner.deleteLogin(id);
//    }

    @Override
    public login getLoginINFO(String user, String Password) {
        login b= new login();
//        System.out.println("we got somehign ");
//        System.out.println("we got somehign ->all usere "+oner.getAllLogin());

        List<login> log= oner.getAllLogin();
//        System.out.println("look here");
//        System.out.println(log);

        for(login a: log)
        {
            if(a.getUsername().equals(user) && a.getPassword().equals(Password))
            {
                return  oner.getById( a.getId());
            }
        }
            return b;
    }
}
