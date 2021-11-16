package services;

import models.request;

import java.util.List;

public interface requestSerivice {

    public request addRequest(request one);
    public List<request> getAllRequest();
    public request getRequestById(int id);
    public request updateRequest(request change);
    public request deleteRequest(int id);
}
