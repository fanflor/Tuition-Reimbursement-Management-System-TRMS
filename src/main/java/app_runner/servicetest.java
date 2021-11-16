package app_runner;

import Repository.*;
import models.*;
import services.*;
import util.Mylogger;

import java.util.ArrayList;
import java.util.List;

public class servicetest {

    public static void main(String[] args) {

             ///////EMPLOYEE SECTION
        UserRepo one = new UserHBImp();//repo layer
        userService oner= new userSeriviceHb(one);

//        System.out.println(one.getAllUser());
////        System.out.println(oner.getById(1));
////System.out.println(one.getAllUser());
       System.out.println( oner.getAllUser());
//
        Mylogger.logger.info( oner.getUserById(1));
        Mylogger.logger.info("this is where we are at3");


////                  //////loging section
        loginRepo login= new loginHBIMM();
        loginService tester= new loginSeriviceHb(login);
    //ogin workign
        System.out.println(tester.getAllLogin());
        System.out.println((tester.getById(2))+"this is tets by id");
        System.out.println("testt start here");
//         tester.getLoginINFO("test","tes3t");
        System.out.println("this is the login info of user->test"+tester.getLoginINFO("test","te3st"));
        System.out.println(tester.getById(2));
//
//
                    /////event test working //
        eventTypeRepo etr= new eventTypeHBimm();
        eventTypeService ets= new eventTypeHBIMM(etr);
////        eventType one11= new eventType(5,"baseball");
//        eventType one11= new eventType("baseball23");
//
//
//        ets.addEvent(one11);
        System.out.println(ets.getAlleventTypes());
//        System.out.println(ets.getById(2));

//
//
//
//////        request test  workign fix adding a requiest
        requestRepo request = new requestHBimp();
        requestSerivice rs = new requestSeriviceHb(request);
//
//        request oneqq= new request(10,12,"vall","fs",12.0,1,1,60,"fd",32);
//        request oneqq= new request(1,10,10,"ths","sdsa",12.12,1,"ie");
//        rs.addRequest(oneqq);
        Mylogger.logger.info(rs.getAllRequest());
        request one22= new request(4,1,1,"","",20,2,1,"fddfd");
//        rs.addRequest(one22);
        Mylogger.logger.warn(rs.getRequestById(15));

        Mylogger.logger.warn(rs.getAllRequest());
////
//
//        //////////GRADES TEST proble,pass
//////
//        gradesRepo gr= new gradesHBimm();
//        gradesService gs = new gradesHbIMM(gr);
//
//
//        System.out.println(gs.getAllGrades());
//
//
//        //////apprpval test working

//             System.out.println(ls.getAllUser());



        approvalRepo ar= new approcalHBim();
        approvalService as= new approvalHBIMM(ar);
        approve one1= new approve(false,false,false,0);


        System.out.println("this is rs get as.....akkk>"+as.getAllApprove());

        UserRepo lr= new UserHBImp();
        userService ls= new userSeriviceHb(lr);
        List<approve> a12= new ArrayList<>();
        List<approve> a134=as.getAllApprove();
//        grades p= new grades(1,true,true,true,3);
//        user a1b2= new user(1,"ks",3,1,false);
//        request ab=new request(1,2,11,"et","tets",23.00,3, 1,"teh");

        System.out.println("this is one->>"+one1.toString());
        System.out.println("this is rs get aal__>"+rs.getAllRequest());


        for(request b: rs.getAllRequest())
        {
            if ( b.getGrade()<3 )
            {
               System.out.println("thisis is somrting -->"+rs.getRequestById(b.getRequestID()));
               one1.setRequestFK(b.getRequestID());
                System.out.println("thisis is after add -->"+ one1.toString());


//                one1.setRequestFK(b.getRequestID());
                one1.setRequestFK(b.getRequestID());
//                one1.getRequestFK()== b.getRequestID()
               if(one1.getRequestFK()== b.getRequestID())
                {
                    //get all approvals
                    ///if to see if requeskfk !exist/
                    //do add

                    Mylogger.logger.warn("this is one in eq      "+one1.toString());
                    Mylogger.logger.info("this is b.gr in eq--"+b.toString());
                    Mylogger.logger.info("this is as.gr in eq++++++++"+  as.getAllApprove());
                    Mylogger.logger.info( as.getAllApprove().contains(one1.getRequestFK()));

                    System.out.println("this is oen.ggr in eq@@@@@@@"+  one1.getRequestFK());
                    System.out.println("this is B>REGid in eq########"+  b.getRequestID());



//                    if(as.getAllApprove()==null&& as.getAllApprove().contains(one1.getRequestFK()))//empty

                    if(as.getAllApprove()==null)
                    {
                        as.addApprove(one1);
                    }
                    if(as.getAllApprove()!=null)//pouplated
                    {
                        System.out.println("inner start here !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//                        if(b.getRequestID()==one1.getRequestFK());
//                        System.out.println(one1.getRequestFK()+"<tetst ate is here >"+b.getRequestID());
//                        one1.setBenCO(true);
//                            as.updateApprove(one1);

                    }


//
//                    one1.setRequestFK(b.getRequestID());
//                    one1.setBenCO(true);
//                    a12.add(one1);

//              System.out.println(b.toString());
                    //System.out.println("thsi is a12---"+a12.toString());//
//                as.addApprove(one1);
//                    one1.toString();
//                    a12.toString();

                }
                System.out.println("not addded ");
            }

        }


        for(user a: ls.getAllUser())
        {
            //pull postion
            //add to list
            //

//            for pupulating teh db one.setRequestFK(b.getRequestID());

//                        as.addApprove(one);

            if(a.getPostion()==2)//dep super
            {
//                System.out.println(lr.getUserById(a.getEmployee_id()));;
            }

            if(a.getPostion()==3)//dep head
            {
//                System.out.println(lr.getUserById(a.getEmployee_id()));;

            }

//            if(a.getCan_corridinate().equals(true))//beco
             if(a.getPostion()==4)
            {
//                System.out.println("this is bc");
//                System.out.println(lr.getUserById(a.getEmployee_id()));
                //get all
                for(request b: rs.getAllRequest())
                {
//                    one1.setBenCO(true);
//                    if (b.getGrade() < 3)
//                    {
//                        approvalRepo aar= new approcalHBim();
//                        approvalService AS= new approvalHBIMM(aar);
//
//                        a12.add(AS.getApproveById(b.getRequestID()));
//                        System.out.println("this is teh a12 add->"+as.getAllApprove());
//
//
//                        approve one1= new approve(false,false,false);
//                        System.out.println(rs.getRequestById(b.getRequestID()));
//////                        one1=as.getApproveById(b.getRequestID());
//////                        one1.setRequestFK(b.getRequestID())    ;
////                        one1.setRequestFK(b.getRequestID());
////                        one1.setBenCO(true);
//
////                        as.addApprove(one);
////                        one1.setBenCO(true);
////                        one1.toString();
////                        System.out.println( one1.isBenCO()+"   "+one1.getRequestFK()+"getbc--b.gr>"+b.getRequestID()+"bgr->"+b.getRequestID());
////                        as.deleteApprove(b.getRequestID());
////                        as.addApprove(one);
////                        as.updateApprove(one1);
//
////
////                        try 3 way handelr to save ie
////                            get all
////                                    set all
////                                            delete by id
////                            addd by ( avoid update );
//                    }

                }
            }
        }


        approvalRepo aar= new approcalHBim();
        approvalService AS= new approvalHBIMM(aar);
//        System.out.println(AS.getAllApprove());
//        approve one= new approve();
//        approve one = new approve();
////        one.setBenCO(false);
////        as.addApprove(one);
////        as.getAllApprove();
//        one=as.getApproveById(30);
//        one.setBenCO(true);
//        as.updateApprove(one);


    }
}
