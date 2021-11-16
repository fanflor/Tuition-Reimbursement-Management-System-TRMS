package services;

import models.approve;

import java.util.List;

public interface approvalService {
        public approve addApprove(approve one);
        public List<approve> getAllApprove();
        public approve getApproveById(int id);
        public approve updateApprove(approve change);
//        public approve deleteApprove(int id);

}
