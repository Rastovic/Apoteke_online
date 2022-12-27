package com.luv2code.hibernate.demo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;



public class DeleteInstructorDetailDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
		
			
		
			session.beginTransaction();
			
			
			int theID = 3;
			
			InstructorDetail theInstructorDetail = session.get(InstructorDetail.class, theID);
			
			System.out.println("Loaded " + theInstructorDetail.getInstructor());
			
			
			
			theInstructorDetail.getInstructor().setInstructorDetail(null);
			
			
			session.delete(theInstructorDetail);
			
			
			
			session.getTransaction().commit();
			System.out.println("Finished");
		}
		
		catch  (Exception exc) {
			
			exc.printStackTrace();
		}
		
		finally{
			
			session.close();
			factory.close();
		}
		
		
	}

}
