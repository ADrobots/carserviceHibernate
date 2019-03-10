package dao;

import connect.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tables.Issue;

public class IssueDao {

    public static void getIssue(int id){
        SessionFactory sessionFactory= HibernateConfig.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        System.out.println(session.get(Issue.class, id));

        transaction.commit();
        session.close();
    }

    public static void createIssue(Issue i){
        SessionFactory sessionFactory=HibernateConfig.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        session.save(i);

        transaction.commit();
        session.close();
    }

    public static void deleteIssue(int id){
        SessionFactory sessionFactory=HibernateConfig.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Issue i1=session.get(Issue.class, id);
        session.delete(i1);

        transaction.commit();
        session.close();
    }

    public static void updateIssue(Issue i, int id){
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Issue issue=session.load(Issue.class, id);
        if(i.getCar().getCar_id()!=null)issue.setCar(i.getCar());
        if(i.getMechanic().getMechanic_id()!=null)issue.setMechanic(i.getMechanic());
        if (i.getDate_open()!=null)issue.setDate_open(i.getDate_open());
        if(i.getDate_close()!=null)issue.setDate_close(i.getDate_close());
        if(i.getMan_hour()!=null)issue.setMan_hour(i.getMan_hour());
        if(i.getDescription()!=null)issue.setDescription(i.getDescription());
        if(i.getPrice()!=null)issue.setPrice(i.getPrice());

        session.save(issue);

        transaction.commit();
        session.close();
    }
}
