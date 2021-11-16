package models;

import javax.persistence.*;

@Entity
@Table(name="employee",schema="public2")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int employee_id;

    @Column(name="name")
    private String name;

    @Column(name="department")
    private int department;

    @Column(name="postion")
    private int postion;

    @Column(name="can_corrdinate")
    private Boolean can_corridinate;

    public user(){};
    public user(int employee_id, String name, int department, int postion, Boolean can_corridinate) {
        this.employee_id = employee_id;
        this.name = name;
        this.department = department;
        this.postion = postion;
        this.can_corridinate = can_corridinate;
    }



    public String getName() {
        return name;
    }

    public user setName(String firstName) {
        name = name;
        return this;
    }

    public int getPostion() {
        return postion;
    }

    public user setPostion(int postion) {
        this.postion = postion;
        return this;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public user setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
        return this;
    }

    public int getDepartment() {
        return department;
    }

    public user setDepartment(int department) {
        this.department = department;
        return this;
    }

    public Boolean getCan_corridinate() {
        return can_corridinate;
    }

    public user setCan_corridinate(Boolean can_corridinate) {
        this.can_corridinate = can_corridinate;
        return this;
    }

    @Override
    public String toString() {
        return "user{" +
                "employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", postion=" + postion +
                ", can_corridinate=" + can_corridinate +
                '}';
    }
}
