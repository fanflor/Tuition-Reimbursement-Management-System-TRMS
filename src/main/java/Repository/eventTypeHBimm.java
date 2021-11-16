package Repository;

import models.eventType;
import models.login;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUTIL;

import java.util.List;

public class eventTypeHBimm implements eventTypeRepo{

    @Override
    public eventType addEvent(eventType one) {
        Session session =HibernateUTIL.getSession();
        try {
            session.beginTransaction();
            one.setEventType_id((int)session.save(one));
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
    public eventType getById(int id) {
        Session session = HibernateUTIL.getSession();
        eventType one = null;
        try {
            one= session.get(eventType.class,id);
        }catch (HibernateException a)
        {
            a.printStackTrace();
        }finally {
            session.close();
        }
        return one;
    }

    @Override
    public List<eventType> getAlleventTypes() {
        Session session = HibernateUTIL.getSession();
        List<eventType> eventType = null;
        try{
            eventType= session.createQuery("From eventType").list();
        }catch (HibernateException a)
        {
            a.printStackTrace();
        }finally {
            session.close();
        }

        return eventType;

    }
}
