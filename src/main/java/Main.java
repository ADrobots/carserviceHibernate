import connect.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tables.Car;
import tables.Customers;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory=HibernateConfig.getSessionFactory();

        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Customers cust1=new Customers();
        cust1.setFirst_name("Valentin");
        cust1.setLast_name("Lupeev");
        cust1.setEmail("ppppp");
        cust1.setPhone("123-123");
        cust1.setBuilding("yes");

        Car car1=new Car();
        car1.setPlate_number("m080xo96");
        car1.setColor("black");
        car1.setCustomers(new Customers().setCustomer_id(2));

        session.save(cust1);
        session.save(car1);

        /*Customers cust2=session.get(Customers.class, 3);*/



        transaction.commit();
        session.close();





    }
}
