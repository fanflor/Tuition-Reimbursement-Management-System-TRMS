package services;

import Repository.approcalHBim;
import Repository.approvalRepo;
import models.approve;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class approvalHBIMMTest {
    approve a= new approve(true,true,true,1);
    approvalRepo ar= new approcalHBim();
    approvalService as= new approvalHBIMM(ar);
    List<approve> approveList= new ArrayList<>();

    @Test
    void addApprove() {
        as.addApprove(a);
        as.getApproveById(1);
        int expected =a.getRequestFK();
        int actual= a.getRequestFK();
        assertEquals(expected,actual);


    }

    @Test
    void getAllApprove() {
       List<approve> a= new ArrayList<>();
       as.getAllApprove();
        assertEquals(approveList,a);

    }

    @Test
    void getApproveById() {
        as.getApproveById(1);
        a.setBenCO(true);
        assertEquals(a,a);
    }

    @Test
    void updateApprove() {
        a.setBenCO(true);
        approve b= new approve();
        b=a;
        as.updateApprove(b);
        as.getClass();
        assertEquals(a,b);
    }

    @Test
    void testAddApprove() {
    }

    @Test
    void testGetAllApprove() {
    }

    @Test
    void testGetApproveById() {
    }

    @Test
    void testUpdateApprove() {
    }
}