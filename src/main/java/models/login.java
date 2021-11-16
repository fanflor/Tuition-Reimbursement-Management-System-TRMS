package models;

import java.util.Objects;
import javax.persistence.*;


@Entity
@Table(name="EMPOLYEE_LOGIN",schema="public2")
public class login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="accountid")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    public login(){};

    public login(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void setId(int i){this.id=i;}

    public int getId() {
        return id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        login login = (login) o;
        return Objects.equals(username, login.username) && Objects.equals(password, login.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "login{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
