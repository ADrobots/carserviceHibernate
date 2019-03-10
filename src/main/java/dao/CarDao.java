package dao;

import connect.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tables.Car;
import tables.Customers;

public class CarDao {
    public static Car getCar(int id) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println(session.get(Car.class, id));
        Car res=session.get(Car.class, id);


        transaction.commit();
        session.close();
        return res;
    }

    public static void createCar(Car c) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(c);

        transaction.commit();
        session.close();
    }

    public static void deleteCar(int id){
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Car c1 = session.get(Car.class, id);
        session.delete(c1);

        transaction.commit();
        session.close();
    }

    public static void updateCar(Car c, int id){
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Car car=session.load(Car.class, id);
        if(c.getCustomers().getCustomer_id()!=null)car.setCustomers(c.getCustomers());
        if(c.getModel()!=null)car.setModel(c.getModel());
        if (c.getVin()!=null)car.setVin(c.getVin());
        if(c.getPlate_number()!=null)car.setPlate_number(c.getPlate_number());
        if(c.getColor()!=null)car.setColor(c.getColor());

        session.save(car);

        transaction.commit();
        session.close();
    }

}
