package org.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.domain.AppUser;
import org.springframework.jdbc.core.RowMapper;

public class AppUserRowMapper implements RowMapper<AppUser> {

	@Override
	public AppUser mapRow(ResultSet rs, int numRow) throws SQLException {
		AppUser appUser = new AppUser();
		appUser.setUserName(rs.getString(1));
		appUser.setPassword(rs.getString(2));
		appUser.setQuestion(rs.getString(3));
		appUser.setAnswer(rs.getString(4));
		return appUser;
	}

}
