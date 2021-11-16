package Repository;

import models.grades;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUTIL;

import java.util.List;

public class gradesHBimm implements gradesRepo{

    @Override
    public grades addGrades(grades one) {
        Session session = HibernateUTIL.getSession();

        try {
            session.beginTransaction();
            one.setGradeID((int)session.save(one));
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
    public List<grades> getAllGrades() {
        Session session = HibernateUTIL.getSession();
        List<grades> grades = null;
        try{
            grades= session.createQuery("From grades").list();
        }catch (HibernateException a)
        {
            a.printStackTrace();
        }finally {
            session.close();
        }
        return grades;
    }

    @Override
    public grades getGradesById(int id) {
        Session session = HibernateUTIL.getSession();
        grades one = null;
        try {
            one= session.get(grades.class,id);
        }catch (HibernateException a)
        {
            a.printStackTrace();
        }finally {
            session.close();
        }
        return one;
    }

    @Override
    public grades updateGrades(grades change) {
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
    public grades deleteGrades(int id) {
        Session session = HibernateUTIL.getSession();
        Transaction tx= null;
        grades one = null;
        try {
            tx= session.beginTransaction();
            one = session.get(grades.class, id);
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
