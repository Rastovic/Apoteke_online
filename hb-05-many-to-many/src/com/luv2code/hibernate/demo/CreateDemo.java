package com.luv2code.hibernate.demo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;



public class CreateDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			//Instructor theInstructor = new Instructor("Lazar","Mrkic","lazarmrkic99@gmail.com");
			
			//InstructorDetail theInstructorDetail = new InstructorDetail("Najjaci","Teretana");
			
			Instructor theInstructor = new Instructor("Nikola","Marusic","nikolamarusic@gmail.com");
			
			InstructorDetail theInstructorDetail = new InstructorDetail("Rukomet","Kriminalac");
			
			theInstructor.setInstructorDetail(theInstructorDetail);
			
			
		
			session.beginTransaction();
			
			System.out.println("Saving instructor " + theInstructor);
			session.save(theInstructor);
			
			
			
			
			
			session.getTransaction().commit();
			System.out.println("Finished");
		}
		
		
		finally{
			
			factory.close();
		}
		
		
	}

}
