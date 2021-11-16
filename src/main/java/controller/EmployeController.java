package controller;

import com.google.gson.Gson;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import models.user;
import services.userService;
import java.util.List;

public class EmployeController {

    userService oner;
    Gson gson = new Gson();
    public EmployeController(userService oner)
    {
        this.oner=oner;
    }

    public Handler addUser=(context) -> {
        user a = gson.fromJson(context.body(), user.class);
        a = oner.addUser(a);
        populateResult(context, a);
    };

    public Handler getAllUser= (context) -> {
        List<user> UserList= oner.getAllUser();
        if(UserList != null) {
            context.result(gson.toJson(UserList));
        } else {
            context.result("[]");
        }
    };

    public Handler getUserById=(context) -> {
        int id = Integer.parseInt(context.pathParam("id"));
        user a = oner.getUserById(id);
        populateResult(context,a);
    };

//    public Handler updateUser=(context)->{
//        int id = Integer.parseInt(context.pathParam("id"));
//        user one= gson.fromJson(context.body(),user.class);
//
//       one.setEmployee_id(id);
//       one= oner.updateUser(one);
//       populateResult(context,one);
//
//
//    };
//
//    public Handler deleteUser=(context)->{
//        int id = Integer.parseInt(context.pathParam("id"));
//        user one= oner.deleteUser(id);
//        populateResult(context,one);
//    };


        //helpers
    private void populateResult(Context context, user a) {

        if(a != null) {
            context.result(gson.toJson(a));
        } else {
            context.result("{}");
        }

    }


}
