package models;

import javax.persistence.*;

@Entity
@Table(name="approvals",schema="public2")
public class approve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int requestFK;
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int approval_id;
    @Column(name="direct_supervisor")
    private boolean directS;
    @Column(name="department_head")
    private boolean departmentH;
    @Column(name="benefits_coordinator")
    private boolean benCO;
//    @Id
//    @Column(name ="requestFK")



    public approve(){}

    public approve(boolean directS, boolean departmentH, boolean benCO,int requestFK) {
        this.directS = directS;
        this.departmentH = departmentH;
        this.benCO = benCO;
        this.requestFK=requestFK;
    }
//    public approve(boolean directS, boolean departmentH, boolean benCO) {
//        this.directS = directS;
//        this.departmentH = departmentH;
//        this.benCO = benCO;
//    }



//    public int getApproval_id() {
//        return approval_id;
//    }
//
//    public  void setApproval_id(int approval_id) {
//        this.approval_id = approval_id;
//    }

    public boolean isDirectS() {
        return directS;
    }

    public void setDirectS(boolean directS) {
        this.directS = directS;
    }

    public boolean isDepartmentH() {
        return departmentH;
    }

    public void setDepartmentH(boolean departmentH) {
        this.departmentH = departmentH;
    }

    public boolean isBenCO() {
        return benCO;
    }

    public void setBenCO(boolean benCO) {
        this.benCO = benCO;
    }
//
    public int getRequestFK() {
        return requestFK;
    }

    public void setRequestFK(int requestFK) {
        this.requestFK = requestFK;
    }

    @Override
    public String toString() {
        return "approve{" +
                " directS=" + directS +
                ", departmentH=" + departmentH +
                ", benCO=" + benCO +
                ", requestFK=" + requestFK +
                '}';
    }
}
