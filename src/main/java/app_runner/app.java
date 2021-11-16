package app_runner;

import Repository.*;
import controller.EmployeController;
import controller.LoginController;
import controller.approvalController;
import controller.requestController;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;
import services.*;
import util.Mylogger;

public class app {

    public static void main(String[] args) {
        servicetest non= new servicetest();
        non.toString();
        //Establish our Javalin Object
        Javalin app = Javalin.create(JavalinConfig::enableCorsForAllOrigins);
        Mylogger.logger.warn("this is a test ");
        //Establish the Route/Endpoints that Javalin will manage.
        establishRoutes(app);
        round(app);

        Mylogger.logger.info("hope this work");

        Mylogger.logger.warn("not working");

        //Run Javalin
        app.start(7000);


    }


    private static void establishRoutes(Javalin app) {
        loginRepo lr=new loginHBIMM();
        loginService ls = new loginSeriviceHb(lr);
        LoginController lc= new LoginController(ls);


//        app.get("/1", lc.getAllLogin);//get all login
        app.get("/some/:id", lc.getById);
        app.get("/user/:user/password/:password", lc.getLoginINFO);//gets the pass+use



        UserRepo ur = new UserHBImp();
        userService us= new userSeriviceHb(ur);
        EmployeController ec= new EmployeController(us);
        app.get("user/", ec.getAllUser);
        app.get("user/:id",ec.getUserById);//user fild input


        //////login sectoin

        ///////employee form section
        requestRepo rr= new requestHBimp();
        requestSerivice rs= new requestSeriviceHb(rr);
        requestController rc= new requestController(rs);
        app.get("/request/",rc.getAllRequest);
        app.post("/request/", rc.addRequest);
        app.get("/request/:id",rc.getRequestById);
        app.patch("/request/:id",rc.updateRequest);

//        app.post("user/:id/request/", rc.addRequest);
//        app.post("user/:id/request", rc.addRequest);

        approvalRepo ar= new approcalHBim();
        approvalService as = new approvalHBIMM(ar);
        approvalController ac= new approvalController(as);
        app.get("/app/", ac.getAllApprove);
        app.patch("/app/:id/rank/:id2", ac.RequestApporve);
        app.get("/app/:id",ac.getApproveById);



    }
    public static void round(Javalin app)
    {
        UserRepo one = new UserHBImp();
        userService oner= new userSeriviceHb(one);


//        app.get("/id",oner.getAllUser());
    }


}