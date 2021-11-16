package services;

import Repository.requestRepo;
import models.request;
import models.user;
import util.Mylogger;

import java.util.List;

public class requestSeriviceHb implements  requestSerivice{
    requestRepo oner;

    public requestSeriviceHb (requestRepo oner) {
        this.oner = oner;
    }


    @Override
    public request addRequest(request one) {
        return oner.addRequest(one);
    }

    @Override
    public List<request> getAllRequest() {
        Mylogger.logger.info("this was called    public List<request> getAllRequest() {\n");return oner.getAllRequest();
    }

    @Override
    public request getRequestById(int id) {
        Mylogger.logger.info("this was called     public request getRequestById(int id) {\n");return oner.getRequestById(id);
    }

    @Override
    public request updateRequest(request change) {
        Mylogger.logger.info("this was called    public request updateRequest(request change) {\n");return oner.updateRequest(change);
    }

    @Override
    public request deleteRequest(int id) {
        Mylogger.logger.info("this was called    public request deleteRequest(int id) {\n");
        return oner.deleteRequest(id);
    }

//    @Override
//    public request addRequestUserID(user acid)
//    {
//     request abe= new request();
//     abe.setEmployeeINFO(acid.getEmployee_id());
//     oner.addRequest(abe);
//    }
}
