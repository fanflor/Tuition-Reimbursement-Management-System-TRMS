package services;
import models.login;

import java.util.List;

public interface loginService {

//    public login addLogin(login one);
    public List<login> getAllLogin();
    public login getById(int id);
//    public login updateLogin(login change);
//    public login deleteLogin(int id);
    public login getLoginINFO(String user, String Password) ;
}
