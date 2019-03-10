package dao;

import connect.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tables.Mechanic;

public class MechanicDao {
    public static Mechanic getMechanic(int id){
        SessionFactory sessionFactory= HibernateConfig.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        System.out.println(session.get(Mechanic.class, id));
        Mechanic res=session.get(Mechanic.class, id);

        transaction.commit();
        session.close();

        return res;
    }

    public static void createMechanic(Mechanic m){
        SessionFactory sessionFactory=HibernateConfig.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        session.save(m);

        transaction.commit();
        session.close();
    }

    public static void deleteMechanic(int id){
        SessionFactory sessionFactory=HibernateConfig.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Mechanic m1=session.get(Mechanic.class, id);
        session.delete(m1);

        transaction.commit();
        session.close();
    }

    public static void updateMechanic(Mechanic m, int id){
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Mechanic mechanic=session.load(Mechanic.class, id);

        if(m.getFirst_name()!=null)mechanic.setFirst_name(m.getFirst_name());
        if(m.getLast_name()!=null)mechanic.setLast_name(m.getLast_name());
        if(m.getExperience()!=null)mechanic.setExperience(m.getExperience());
        if(m.getEmployment_date()!=null)mechanic.setEmployment_date(m.getEmployment_date());
        if(m.getEducation()!=null)mechanic.setEducation(m.getEducation());

        session.save(mechanic);

        transaction.commit();
        session.close();
    }
}
