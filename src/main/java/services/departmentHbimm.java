//package services;
//
//import Repository.departmentRepo;
//import models.department;
//
//import java.util.List;
//
//public class departmentHbimm implements departmentService {
//    departmentRepo oner;
//
//    public departmentHbimm(departmentRepo one){
//        this.oner=one;
//    }
//
//    @Override
//    public department addDep(department one) {
//        return oner.addDep(one);
//    }
//
//    @Override
//    public List<department> getAllDep() {
//        return oner.getAllDep();
//    }
//
//    @Override
//    public department getDepById(int id) {
//        return oner.getDepById(id);
//    }
//
//    @Override
//    public department updateDep(department change) {
//        return oner.updateDep(change);
//    }
//
//    @Override
//    public department deleteDep(int id) {
//        return oner.deleteDep(id);
//    }
//}
