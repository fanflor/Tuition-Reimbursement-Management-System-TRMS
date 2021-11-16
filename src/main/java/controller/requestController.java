package controller;

import com.google.gson.Gson;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import models.login;
import models.request;
import org.hibernate.HibernateException;
import services.requestSerivice;
import java.util.List;

public class requestController {

    requestSerivice oner;
    Gson gson = new Gson();
    public requestController(requestSerivice oner)
    {
        this.oner=oner;
    }

    public Handler addRequest=(context) -> {
        request a = gson.fromJson(context.body(), request.class);
        try {
        a = oner.addRequest(a);
        populateResult(context, a);
        }catch(HibernateException a1)
        {
            a1.printStackTrace();
        }
    };

    public Handler getAllRequest= (context) -> {
        List<request> requestList= oner.getAllRequest();
        if(requestList != null) {
            context.result(gson.toJson(requestList));
        } else {
            context.result("[]");
        }
    };

    public Handler getRequestById=(context) -> {
        int id = Integer.parseInt(context.pathParam("id"));
        request a = oner.getRequestById(id);
        populateResult(context,a);
    };

    public Handler updateRequest=(context)->{
        int id = Integer.parseInt(context.pathParam("id"));
        request one= gson.fromJson(context.body(),request.class);
        one.setRequestID(id);
        one= oner.updateRequest(one);
        populateResult(context,one);
    };

    public Handler deleteRequest=(context)->{
        int id = Integer.parseInt(context.pathParam("id"));
        request one= oner.deleteRequest(id);
        populateResult(context,one);
    };

    public Handler empaddrequest=context ->  {
        String input= context.pathParam("id");
        int AccID;
        try{
            AccID=Integer.parseInt(input);
        }catch (NumberFormatException a)
        {
            AccID=-1;
        }
        request one = gson.fromJson(context.body(), request.class);
        one = oner.addRequest(one);
//        context.result((one != null) ? gson.toJson(one) : "{add to bank done}");
        if(one!=null) {
            context.result(gson.toJson(one));
            context.status(201);
        }
        else {context.status(404);}


    };

    //helpers
    private void populateResult(Context context, request a) {
        if(a != null) {
            context.result(gson.toJson(a));
        } else {
            context.result("{}");
        }

    }
}
