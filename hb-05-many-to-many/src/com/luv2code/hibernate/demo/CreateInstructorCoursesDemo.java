package com.luv2code.hibernate.demo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;




public class CreateInstructorCoursesDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			
			session.beginTransaction();
			
			int theID = 1;
			Instructor theInstructor = session.get(Instructor.class, theID);
			
			System.out.println("Instructor " + theInstructor);
			
			System.out.println("Courses " +theInstructor.getCourses());
			
			session.getTransaction().commit();
			System.out.println("Finished");
		}
		
		
		finally{
			session.close();
			factory.close();
		}
		
		
	}

}
