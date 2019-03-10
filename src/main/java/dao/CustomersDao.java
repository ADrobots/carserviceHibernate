package dao;

import connect.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tables.Customers;

public class CustomersDao {
    private static HibernateConfig hibernateConfig;

    public static Customers getCustomer(int id) {
        SessionFactory sessionFactory = hibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println(session.get(Customers.class, id));
        Customers res=session.get(Customers.class, id);

        transaction.commit();
        session.close();

        return res;
    }

    public static void createCustomer(Customers c) {
        SessionFactory sessionFactory = hibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(c);

        transaction.commit();
        session.close();
    }

    public static void deleteCustomer(int id) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Customers c1 = session.get(Customers.class, id);
        session.delete(c1);

        transaction.commit();
        session.close();

    }

    public static void updateCustomer(Customers c, int id){
        SessionFactory sessionFactory=hibernateConfig.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Customers cust=(Customers)session.load(Customers.class, id);

        if(c.getFirst_name()!=null)cust.setFirst_name(c.getFirst_name());
        if(c.getLast_name()!=null)cust.setLast_name(c.getLast_name());
        if(c.getBirth_date()!=null)cust.setBirth_date(c.getBirth_date());
        if(c.getAge()!=null)cust.setAge(c.getAge());
        if(c.getGender()!=null)cust.setGender(c.getGender());
        if(c.getPhone()!=null)cust.setPhone(c.getPhone());
        if(c.getEmail()!=null)cust.setEmail(c.getEmail());
        if(c.getCity()!=null)cust.setCity(c.getCity());
        if(c.getStreet()!=null)cust.setStreet(c.getStreet());
        if(c.getBuilding()!=null)cust.setBuilding(c.getBuilding());

        session.save(cust);

        transaction.commit();
        session.close();
    }
}
