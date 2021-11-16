//package controller;
//
//import com.google.gson.Gson;
//import io.javalin.http.Context;
//import io.javalin.http.Handler;
//import models.approve;
//import models.request;
//import org.hibernate.HibernateException;
//import services.approvalService;
//import services.requestSerivice;
//
//public class dual {
//
//    dual a;
//    requestSerivice oner;
//    approvalService oner1;
//    Gson gson = new Gson();
//    public dual(requestSerivice oner)
//    {
//        this.oner=oner;
//    }
//    public dual(approvalService oner1){this.oner1=oner1;}
//
//    public Handler tets=(context)->{
//
//        try{
//            approve a = gson.fromJson(context.body(), approve.class);
//            a = oner1.addApprove(a);
//            populateResult(context, a);
//
//        }catch (HibernateException aa)
//        {
//            aa.printStackTrace();
//        }
//        public Handler addApprove=(context) -> {
//
//
//        public Handler addRequest=(context) -> {
//            request a = gson.fromJson(context.body(), request.class);
//            try {
//                a = oner.addRequest(a);
//                populateResult(context, a);
//            }catch(HibernateException a1)
//            {
//                a1.printStackTrace();
//            }
//        };
//
//    }
//
//
//
//
//
//    private void populateResult(Context context, approve a) {
//
//        if(a != null) {
//            context.result(gson.toJson(a));
//        } else {
//            context.result("{}");
//        }
//
//    }
//    private void populateResult1(Context context, request a) {
//
//        if(a != null) {
//            context.result(gson.toJson(a));
//        } else {
//            context.result("{}");
//        }
//
//    }
//
//
//
//
//}
