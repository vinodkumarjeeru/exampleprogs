package org.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.model.Address;
import org.model.Student;

public class OneToOneTest {

	public static void main(String[] args) {

		Address address = new Address();
		address.setCity("HYD");
		address.setCountry("INDIA");

		Student student = new Student();
		student.setStudentName("BBB");
		student.setAddress(address);

		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();

		session.save(student);

		tx.commit();

		session.close();

	}

}
