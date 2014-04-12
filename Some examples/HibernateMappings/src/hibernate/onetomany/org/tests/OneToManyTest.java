package org.tests;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.model.Employee;
import org.model.Mail;

public class OneToManyTest {

	public static void main(String[] args) {

		Mail mail1 = new Mail();
		mail1.setEmail("bbb@gmail.com");
		mail1.setEmailType("Office");

		Mail mail2 = new Mail();
		mail2.setEmail("bbb1@gmail.com");
		mail2.setEmailType("Personal");

		

		Set<Mail> mailSet = new HashSet<Mail>();
		mailSet.add(mail1);
		mailSet.add(mail2);
		

		Employee employee = new Employee();
		employee.setEmployeeName("BBB");
		employee.setMailSet(mailSet);

		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();

		session.save(employee);

		tx.commit();

		session.close();

	}

}
