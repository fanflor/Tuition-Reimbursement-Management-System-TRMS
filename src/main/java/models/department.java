package models;

import javax.persistence.*;

@Entity
@Table(name="department",schema="public2")
public class department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int department_id;
    @Column(name="d_name")
    private String d_name;

    public int getDepartment_id() {
        return department_id;
    }

    public department setDepartment_id(int department_id) {
        this.department_id = department_id;
        return this;
    }

    public String getD_name() {
        return d_name;
    }

    public department setD_name(String d_name) {
        this.d_name = d_name;
        return this;
    }

    @Override
    public String toString() {
        return "department{" +
                "department_id=" + department_id +
                ", d_name='" + d_name + '\'' +
                '}';
    }
}
