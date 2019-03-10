import connect.HibernateConfig;
import dao.CarDao;
import dao.CustomersDao;
import dao.IssueDao;
import dao.MechanicDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tables.Car;
import tables.Customers;
import tables.Issue;
import tables.Mechanic;

public class Main {
    private  static CustomersDao customersDao;
    private static CarDao carDao;
    private static IssueDao issueDao;
    private static MechanicDao mechanicDao;

    public static void main(String[] args) {


        //create Customer
        /*Customers cust1=new Customers();
        cust1.setFirst_name("Galina");
        cust1.setLast_name("Dmitrienko");
        cust1.setAge(28);
        cust1.setGender('W');
        cust1.setEmail("galina-bugunova@rambler.ru");
        cust1.setPhone("89655402965");
        cust1.setCity("Екатеринбург");
        cust1.setStreet("Старых Большевиков");
        cust1.setBuilding("yes");

        customersDao.createCustomer(cust1);*/

        //create car
       /* Car car1=new Car();
        car1.setCustomers(customersDao.getCustomer(13));
        car1.setModel("renault");
        car1.setVin("33333333333333");
        car1.setPlate_number("t225mo66");
        car1.setColor("white");

        carDao.createCar(car1);*/

        //create issue
        /*Issue issue1=new Issue();
        issue1.setCar(carDao.getCar(9));
        issue1.setMechanic(mechanicDao.getMechanic(1));
        issue1.setPrice(1000);
        issue1.setMan_hour(1);

        issueDao.createIssue(issue1);*/

        //create mechanic
        /*Mechanic mechanic1=new Mechanic();
        mechanic1.setFirst_name("PAvel");
        mechanic1.setLast_name("Viktorovish");
        mechanic1.setEducation("master");
        mechanic1.setExperience(2);

        mechanicDao.createMechanic(mechanic1);*/

        issueDao.deleteIssue(3);




    }
}
