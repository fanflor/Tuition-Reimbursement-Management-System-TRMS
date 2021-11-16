package Repository;

import models.login;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUTIL;

import java.util.ArrayList;
import java.util.List;

public class loginHBIMM implements loginRepo {

//
//    @Override
//    public login addLogin(login one) {
//
//        Session session =HibernateUTIL.getSession();
//        try {
//            session.beginTransaction();
//            one.setId((int)session.save(one));
//            session.getTransaction().commit();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//            session.getTransaction().rollback();
//            one = null;
//        } finally {
//            session.close();
//        }
//        return one;
//    }

    @Override
    public List<login> getAllLogin() {
//        System.out.println("this is the value of logins->top");

        Session session = HibernateUTIL.getSession();
        List<login> logins = null;
        try{
            logins= session.createQuery("From login").list();
        }catch (HibernateException a)
        {
            a.printStackTrace();
        }finally {
            session.close();
        }
        System.out.println("this is the value of logins->botom"+logins);

        return logins;
    }

    @Override
    public login getById(int id) {
        Session session = HibernateUTIL.getSession();
        login one = null;
        try {
            one= session.get(login.class,id);
        }catch (HibernateException a)
        {
            a.printStackTrace();
        }finally {
            session.close();
        }
        return one;
    }

//    @Override
//    public login updateLogin(login change) {
//        Session session = HibernateUTIL.getSession();
//        Transaction tx= null;
//        try {
//            tx= session.beginTransaction();
//            session.update(change);
//            tx.commit();
//        }catch (HibernateException a)
//        {
//            a.printStackTrace();
//            if(tx !=null) tx.rollback();
//            return null;
//        }finally {
//            session.close();
//        }
//
//        return change;
//    }
//
//    @Override
//    public login deleteLogin(int id) {
//        Session session = HibernateUTIL.getSession();
//        Transaction tx= null;
//        login one = null;
//        try {
//            tx= session.beginTransaction();
//            one = session.get(login.class, id);
//            session.delete(one);
//            tx.commit();
//        }catch (HibernateException a)
//        {
//            a.printStackTrace();
//            if(tx != null) tx.rollback();
//            one = null;
//        }finally {
//            session.close();
//        }
//        return one;
//    }

//    @Override
//    public login getLoginINFO(String s, String b) {
//        Session session = HibernateUTIL.getSession();
//
//        login one = null;
//        login two= null;
//        List<login> logins = null;
//
//        try {
//            one= session.get(login.class,s);
//        }catch (HibernateException a)
//        {
//            a.printStackTrace();
//        }finally {
//            session.close();
//        }
//        return one;

//    }

//    public List<login> getLoginINFO(String one,String two ){
//        Session session = HibernateUTIL.getSession();
//        List<login> logins = null;
//        List<login> checked= new ArrayList<>();
//
//        try{
//            logins= session.createQuery("From login").list();
//            for
//        }catch (HibernateException a)
//        {
//            a.printStackTrace();
//        }finally {
//            session.close();
//        }
//
//        return logins;


//    }



}
