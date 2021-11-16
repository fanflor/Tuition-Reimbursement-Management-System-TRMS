package Repository;

import models.user;
import org.hibernate.Transaction;
import util.HibernateUTIL;
import org.hibernate.HibernateException;
import org.hibernate.Session;


import java.util.List;

public class UserHBImp implements UserRepo {
    @Override
    public user addUser(user one) {

        Session session = HibernateUTIL.getSession();

        try {
            session.beginTransaction();
            one.setEmployee_id((int)session.save(one));
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            one = null;
        } finally {
            session.close();
        }
        return one;

    }

    @Override
    public List<user> getAllUser() {
        Session session = HibernateUTIL.getSession();
        List<user> user1 = null;
        try{
            System.out.println("this is where we are at1");
            user1= session.createQuery("From user").list();
        }catch (HibernateException a)
        {
            a.printStackTrace();
        }finally {
            session.close();
        }
        return user1;
    }


    @Override
    public user getUserById(int id) {
        Session session = HibernateUTIL.getSession();
        user one = null;
        try {
            one= session.get(user.class,id);
        }catch (HibernateException a)
        {
            a.printStackTrace();
        }finally {
            session.close();
        }
        return one;
    }

//    @Override
//    public user updateUser(user change) {
//        Session session = HibernateUTIL.getSession();
//        Transaction tx= null;
//        try {
//            tx= session.beginTransaction();
//            session.update(change);
//            tx.commit();
//        }catch (HibernateException a)
//        {
//            a.printStackTrace();
//            if(tx !=null) tx.rollback();;
//            return null;
//        }finally {
//            session.close();
//        }
//
//        return change;
//    }
//
//    @Override
//    public user deleteUser(int id) {
//        Session session = HibernateUTIL.getSession();
//        Transaction tx= null;
//        user one = null;
//        try {
//            tx= session.beginTransaction();
//            one = session.get(user.class, id);
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
//
//        return one;
//    }
    //crud operations s
}
