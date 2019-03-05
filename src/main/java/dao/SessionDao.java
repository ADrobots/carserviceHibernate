package dao;

import connect.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tables.Customers;

public class SessionDao {
    public static void getCustomer(int id){
        SessionFactory sessionFactory=HibernateConfig.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        System.out.println(session.get(Customers.class, id));

        transaction.commit();
        session.close();
    }

    public static void createCustomer(Customers c){
        SessionFactory sessionFactory=HibernateConfig.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        session.save(c);
        System.out.println("Create complete");

        transaction.commit();
        session.close();
    }

    public static void deleteComplete(Customers c){
        SessionFactory sessionFactory=HibernateConfig.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Customers c1=session.get(Customers.class, c.getCustomer_id());
        session.delete(c1);
        System.out.println("Delete complete");

        transaction.commit();
        session.close();
    }
}
