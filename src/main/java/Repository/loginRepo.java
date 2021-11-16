package Repository;

import java.util.List;
import models.login;

public interface loginRepo {

//    public login addLogin(login one);
    public List<login> getAllLogin();
    public login getById(int id);
//    public login updateLogin(login change);
//    public login deleteLogin(int id);
//    public login getLoginINFO(String s, String b);
//    public List<login> getLoginINFO(String one,String two );

}
