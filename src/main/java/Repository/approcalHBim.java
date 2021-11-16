package Repository;

import models.approve;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUTIL;

import java.util.List;

public class approcalHBim implements approvalRepo{
    @Override
    public approve addApprove(approve one) {

        Session session = HibernateUTIL.getSession();
        try {
            session.beginTransaction();
            one.setRequestFK((int)session.save(one));
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
    public List<approve> getAllApprove() {
        Session session = HibernateUTIL.getSession();
        List<approve> approve = null;
        try{
            approve= session.createQuery("From approve").list();
        }catch (HibernateException a)
        {
            System.out.println("Error here");
            a.printStackTrace();
        }finally {
            session.close();
        }
        return approve;
    }

    @Override
    public approve getApproveById(int id) {
        Session session = HibernateUTIL.getSession();
        approve one = null;
        try {
            one= session.get(approve.class,id);
        }catch (HibernateException a)
        {
            a.printStackTrace();
        }finally {
            session.close();
        }
        return one;
    }

    @Override
    public approve updateApprove(approve change) {
        Session session = HibernateUTIL.getSession();
        Transaction tx= null;
        try {
            tx= session.beginTransaction();
            session.update(change);
            tx.commit();
        }catch (HibernateException a)
        {
            a.printStackTrace();
            if(tx !=null) tx.rollback();;
            return null;
        }finally {
            session.close();
        }

        return change;
    }

    @Override
    public approve deleteApprove(int id) {
        Session session = HibernateUTIL.getSession();
        Transaction tx= null;
        approve one = null;
        try {
            tx= session.beginTransaction();
            one = session.get(approve.class, id);
            session.delete(one);
            tx.commit();
        }catch (HibernateException a)
        {
            a.printStackTrace();
            if(tx != null) tx.rollback();
            one = null;
        }finally {
            session.close();
        }

        return one;
    }
}
