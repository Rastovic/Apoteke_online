package com.luv2code.hibernate.demo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;




public class CreateCoursesDemo {

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
			
			//Course theCourse1 = new Course("Kamatasenje");
			Course theCourse2 = new Course("Jebanje");
		
			//theInstructor.add(theCourse1);
			theInstructor.add(theCourse2);
			
			//session.save(theCourse1);
			session.save(theCourse2);
			
			session.getTransaction().commit();
			System.out.println("Finished");
		}
		
		
		finally{
			session.close();
			factory.close();
		}
		
		
	}

}
