import connect.HibernateConfig;
import dao.SessionDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tables.Car;
import tables.Customers;

public class Main {
    public static void main(String[] args) {


        /*//get
        SessionDao.getCustomer(3);

        //create
        Customers c=new Customers();
        c.setFirst_name("Ivan");
        SessionDao.createCustomer(c);*/

        //delete
        Customers c=new Customers();
        c.setCustomer_id(4);
        SessionDao.deleteComplete(c);


        /*SessionFactory sessionFactory=HibernateConfig.getSessionFactory();*/



       /* Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();*/

        /*Customers cust1=new Customers();
        cust1.setFirst_name("Ivan");
        cust1.setLast_name("Vazhnov");
        cust1.setEmail("ppppp");
        cust1.setPhone("123-123");
        cust1.setBuilding("yes");*/

        /*Customers cust2=session.get(Customers.class, 60);
        Car car2=session.get(Car.class,3);

        Car car1=new Car();
        car1.setPlate_number("m080xo96");
        car1.setColor("black");
        car1.setCustomers(cust2);

        session.save(cust2);
        session.save(car1);

        *//*Customers cust2=session.get(Customers.class, 3);*//*



        transaction.commit();
        session.close();*/





    }
}
