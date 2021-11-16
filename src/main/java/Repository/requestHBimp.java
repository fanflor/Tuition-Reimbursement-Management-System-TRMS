package Repository;

import models.request;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUTIL;


import java.util.List;

public class requestHBimp implements requestRepo{

    @Override
    public request addRequest(request one) {
        Session session = HibernateUTIL.getSession();
        try {
            session.beginTransaction();
            one.setRequestID((int)session.save(one));
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
    public List<request> getAllRequest() {
        Session session = HibernateUTIL.getSession();
        List<request> papers = null;
        try{
            papers= session.createQuery("From request").list();
        }catch (HibernateException a)
        {
            a.printStackTrace();
        }finally {
            session.close();
        }

        return papers;
    }

    @Override
    public request getRequestById(int id) {
        Session session = HibernateUTIL.getSession();
        request one = null;
        try {

            one= session.get(request.class,id);
        }catch (HibernateException a)
        {
            a.printStackTrace();
        }finally {
            session.close();
        }
        return one;
    }

    @Override
    public request updateRequest(request change) {
        Session session = HibernateUTIL.getSession();
        Transaction tx= null;
        try {
            tx= session.beginTransaction();
            session.update(change);
            tx.commit();
        }catch (HibernateException a)
        {
            a.printStackTrace();
            if(tx !=null) tx.rollback();
            return null;
        }finally {
            session.close();
        }

        return change;
    }

    @Override
    public request deleteRequest(int id) {
        Session session = HibernateUTIL.getSession();
        Transaction tx= null;
        request one = null;
        try {
            tx= session.beginTransaction();
            one = session.get(request.class, id);
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
