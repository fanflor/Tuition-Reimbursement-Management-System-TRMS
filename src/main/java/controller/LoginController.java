package controller;

import Repository.loginRepo;
import com.google.gson.Gson;
import io.javalin.http.Handler;
import io.javalin.http.Context;
import models.login;
import org.eclipse.jetty.security.LoginService;
import services.loginSeriviceHb;
import services.loginService;

import java.util.List;

public class LoginController {

//    loginRepo oner;
    loginService oner;
    Gson gson = new Gson();
//    public LoginController(loginRepo oner)
//    {
//        this.oner=oner;
//    }
    public LoginController(loginService oner)
    {
        this.oner=oner;
    }

//    public Handler addLogin=(context) -> {
//        login a = gson.fromJson(context.body(), login.class);
//        a = oner.addLogin(a);
//        populateResult(context, a);
//    };

    public Handler getAllLogin= (context) -> {
        List<login> loginList= oner.getAllLogin();
        if(loginList != null) {
            context.result(gson.toJson(loginList));
        } else {
            context.result("[]");
        }
    };
    public Handler getById = context -> {
        int id = Integer.parseInt(context.pathParam("id"));
        login a = oner.getById(id);
        populateResult(context, a);
    };
//    public Handler updateUser=(context)->{
//        int id = Integer.parseInt(context.pathParam("id"));
//        login one= gson.fromJson(context.body(),login.class);
//        one.setId(id);
//        one= oner.updateLogin(one);
//        populateResult(context,one);
//    };

//    public Handler deleteLogin=(context)->{
//        int id = Integer.parseInt(context.pathParam("id"));
//        login one= oner.deleteLogin(id);
//        populateResult(context,one);
//    };

    public Handler getLoginINFO=(context)-> {
        String usero = context.pathParam("user");
        String password= context.pathParam("password");
        List<login> loginList= oner.getAllLogin();
        //        System.out.println(usero+password);
//        System.out.println("tetsing if it woe ");

        if(loginList != null)
        {        System.out.println(" if statment  woe "+usero+password);

            for(login b:loginList)
            {
                if (b.getUsername().equals(usero) && b.getPassword().equals(password))
                {
                oner.getById(b.getId());
                System.out.println(b.getId());
                context.result(gson.toJson(b));

                }

            }
            context.status(200);
        }
            context.status(205);

    };


    //helpers
    private void populateResult(Context context, login a) {

        if(a != null) {
            context.result(gson.toJson(a));
        } else {
            context.result("{}");
        }

    }

}
