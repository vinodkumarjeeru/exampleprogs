package org.tests;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.domain.AppUser;
import org.service.AppUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"META-INF/beans.xml");

		AppUserService appUserService = (AppUserService) applicationContext
				.getBean("appUserService");

		// AppUser appUser = (AppUser) applicationContext.getBean("appUser");
		// appUser.setUserName("Vinod");
		// appUser.setPassword("QQQQQQ");
		// appUser.setAnswer("TEST");
		// appUser.setQuestion("TESTQQQQ");
		//
		// // appUserService.create(appUser);
		// appUserService.update(appUser);

		// appUserService.delete("aaa");
		System.out.println(appUserService.getAll());

	}

}
