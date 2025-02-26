package com.learning.Hibernate_StudentManagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Student stu = new Student(101,"Gopal",18,"Male","Bengalur","9632587410");
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
		session.save(stu);
		session.getTransaction().commit();
		session.close();
		System.out.println("Record Saved Successfully!!");
    }
}
