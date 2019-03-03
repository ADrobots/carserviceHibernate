package connect;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import tables.Car;
import tables.Customers;
import tables.Issue;
import tables.Mechanic;

public class HibernateConfig {
    private static final StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
    private static final SessionFactory sessionFactory=new MetadataSources(registry)
            .addAnnotatedClass(Customers.class)
            .addAnnotatedClass(Car.class)
            .addAnnotatedClass(Mechanic.class)
            .addAnnotatedClass(Issue.class)
            .buildMetadata()
            .buildSessionFactory();

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }


}
