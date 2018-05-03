package org.koushik.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.koushik.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
try{
        user.setUserId(3);
        user.setUserName("AThirdUser");
        //SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
        session.close();
        user = null;
        Session session2 = sessionFactory.openSession();
        session2.beginTransaction();
        //use the session object to get the data
        user = (UserDetails) session2.get(UserDetails.class, 1); //first arg is the class
        //second arg is the KEYS value. In this case, we set the KEY as userId.
        //(UserDetails) is a cast to newUser
        //we are going to grab (search) for 1 in this case
        System.out.println("Added " + user.getUserName() + " to database");
}catch(Exception e) {
	System.out.println("User exists");
    user = null;
    Session session2 = sessionFactory.openSession();
    session2.beginTransaction();
    //use the session object to get the data
    user = (UserDetails) session2.get(UserDetails.class, 3); //first arg is the class
    //second arg is the KEYS value. In this case, we set the KEY as userId.
    //(UserDetails) is a cast to newUser
    //we are going to grab (search) for 3 in this case
    System.out.println("User Name: " + user.getUserName());
}
        
        
	}

}
