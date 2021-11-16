//package Repository;
//
//import models.department;
//
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import util.HibernateUTIL;
//
//import java.util.List;
//
//public class deparmentHBim implements departmentRepo{
//    @Override
//    public department addDep(department one) {
//        Session session = HibernateUTIL.getSession();
//
//        try {
//            session.beginTransaction();
//            one.setDepartment_id((int)session.save(one));
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
//
//    @Override
//    public List<department> getAllDep() {
//        Session session = HibernateUTIL.getSession();
//        List<department> papers = null;
//        try{
//            papers= session.createQuery("From department").list();
//        }catch (HibernateException a)
//        {
//            a.printStackTrace();
//        }finally {
//            session.close();
//        }
//
//        return papers;
//    }
//
//    @Override
//    public department getDepById(int id) {
//        Session session = HibernateUTIL.getSession();
//        department one = null;
//        try {
//            one= session.get(department.class,id);
//        }catch (HibernateException a)
//        {
//            a.printStackTrace();
//        }finally {
//            session.close();
//        }
//        return one;
//    }
//
//    @Override
//    public department updateDep(department change) {
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
//    public department deleteDep(int id) {
//        Session session = HibernateUTIL.getSession();
//        Transaction tx= null;
//        department one = null;
//        try {
//            tx= session.beginTransaction();
//            one = session.get(department.class, id);
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
//}
