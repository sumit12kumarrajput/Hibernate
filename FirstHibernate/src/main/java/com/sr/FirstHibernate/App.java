package com.sr.FirstHibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
        Animal animal=new Animal();
        animal.setWeight(50);
        animal.setColor("Brown");
        animal.setName("Lion");
        
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Animal.class);
        
        
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();       
        session.save(animal);
        transaction.commit();
    }
}
