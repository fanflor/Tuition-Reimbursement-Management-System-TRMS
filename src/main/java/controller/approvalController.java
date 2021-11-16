package controller;

import com.google.gson.Gson;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import models.approve;
import models.login;
import models.request;
import services.approvalService;

import java.util.ArrayList;
import java.util.List;

public class approvalController {

    approvalService oner;
    Gson gson= new Gson();

    public approvalController(approvalService oner){this.oner=oner;}

    public Handler addApprove=(context) -> {
        approve a = gson.fromJson(context.body(), approve.class);
        a = oner.addApprove(a);
        populateResult(context, a);


    };

    public Handler getAllApprove= (context) -> {
        List<approve> approveListList= oner.getAllApprove();
        if(approveListList != null) {
            context.result(gson.toJson(approveListList));
        } else {
            context.result("[]");
        }
    };
    public Handler getApproveById = context -> {
        int id = Integer.parseInt(context.pathParam("id"));
        approve a = oner.getApproveById(id);
        populateResult(context, a);
    };
    public Handler updateApprove=(context)->{
        int id = Integer.parseInt(context.pathParam("id"));
        approve one= gson.fromJson(context.body(),approve.class);
        one.setRequestFK(id);
        one= oner.updateApprove(one);
        populateResult(context,one);
    };

//    public Handler deleteApprove=(context)->{
//        int id = Integer.parseInt(context.pathParam("id"));
//        approve one= oner.deleteApprove(id);
//        populateResult(context,one);
//    };

    private void populateResult(Context context, approve a) {

        if(a != null) {
            context.result(gson.toJson(a));
        } else {
            context.result("{}");
        }

    }

    public Handler RequestApporve=(context)->
    {
        int requestId= Integer.parseInt(context.pathParam("id"));
        int rank=Integer.parseInt(context.pathParam("id2"));
        System.out.println(requestId+" "+rank);
        approve temp= new approve();
        temp.setRequestFK(requestId);
        temp=oner.getApproveById(requestId);
//        oner.getApproveById(temp.getRequestFK(
        if (rank==2)
        {
            temp.setDirectS(true);
        }
        if (rank==3)
        {
            temp.setDepartmentH(true);
        }
        if(rank==4)
        {
            temp.setBenCO(true);
        }
       System.out.println(temp.toString());


        List<approve> approveList= new ArrayList<approve>();
                approveList=oner.getAllApprove();
//        List <request> requestList= oner.getAllA

        System.out.println("before look "+(requestId));

        for(approve c: approveList)
        {   System.out.println(c+"before look2 "+(temp));
//            approveList
                 System.out.println  (oner.getApproveById(c.getRequestFK()));
            {
                   System.out.println(c+"before look#3 "+(temp));
                   System.out.println(oner.getApproveById((requestId)));

                    oner.updateApprove(temp);

            }
        }

        {
//            for(approve c: approveList)
//            {   System.out.println(c+"before look2 "+(temp));
////            approveList
//                System.out.println  (oner.getApproveById(requestId));
//                if(oner.getApproveById(c.getRequestFK())!=c)
//                {       oner.getAllApprove();
//                    oner.deleteApprove(requestId);
//                    oner.getAllApprove();
//                    System.out.println(c+"before look#3 "+(temp));
//                    System.out.println(oner.getApproveById((requestId)));
//
//                    oner.addApprove(temp);
//
//                }
        }

//        for (approve B:approveList)
//        {
//            if(approveList.contains(temp))//emptylisy
//            {
//                System.out.println("this is update");
//                oner.updateApprove(temp);
//            }
//            if(approveList.size()!=0)//populated
//            {
////                oner.deleteApprove(oner.getApproveById(requestId));
//                System.out.println("trying to add");
////                oner.updateApprove(temp);
//                oner.addApprove(temp);
//
//            }
//            if(approveList.size()==0)
//            {
//                System.out.println(("theo"));
//                 oner.addApprove(temp);
//            }
//        }
        System.out.println("end of for ");

    };

}
