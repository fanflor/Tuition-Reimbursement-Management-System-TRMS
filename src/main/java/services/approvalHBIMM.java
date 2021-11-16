package services;

import Repository.approvalRepo;
import models.approve;

import java.util.List;

public class approvalHBIMM implements approvalService{
    approvalRepo ar;

    public approvalHBIMM(approvalRepo one){this.ar=one;}

    @Override
    public approve addApprove(approve one) {
        return ar.addApprove(one);
    }

    @Override
    public List<approve> getAllApprove() {
        return ar.getAllApprove();
    }

    @Override
    public approve getApproveById(int id) {
        return ar.getApproveById(id);
    }

    @Override
    public approve updateApprove(approve change) {
        return ar.updateApprove(change);
    }

//    @Override
//    public approve deleteApprove(int id) {
//        return ar.deleteApprove(id);
//    }
}
