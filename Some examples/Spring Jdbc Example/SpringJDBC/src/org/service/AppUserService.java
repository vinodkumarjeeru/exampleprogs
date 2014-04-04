package org.service;

import java.util.List;

import org.domain.AppUser;
import org.springframework.jdbc.core.JdbcTemplate;

public class AppUserService {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void create(AppUser appUser) {
		jdbcTemplate.update("INSERT INTO APPUSER VALUES(?,?,?,?)",
				appUser.getUserName(), appUser.getPassword(),
				appUser.getQuestion(), appUser.getAnswer());
	}

	public List<AppUser> getAll() {

		List<AppUser> list = jdbcTemplate.query("SELECT * FROM APPUSER",
				new AppUserRowMapper());

		return list;
	}

	public void update(AppUser appUser) {

		jdbcTemplate
				.update("UPDATE APPUSER SET PASSWORD = ?, QUESTION = ?, ANSWER = ? WHERE USERNAME = ?",
						appUser.getPassword(), appUser.getQuestion(),
						appUser.getAnswer(), appUser.getUserName());
	}

	public void delete(String userName) {

		jdbcTemplate.update("DELETE FROM APPUSER WHERE USERNAME = ?", userName);
	}
}
