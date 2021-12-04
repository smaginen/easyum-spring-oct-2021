package com.easyum.jdbc.callbacks;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.easyum.jdbc.model.Account;

/**
 *
 *
 */
public class AccountRowMapper implements RowMapper<Account>{

	@Override
	public Account mapRow(ResultSet rs, int id) throws SQLException {
		Account account = new Account();
		account.setId(new Long(rs.getInt("id")));
		account.setName(rs.getString("name"));
		account.setBalance(new Long(rs.getInt("balance")));
		return account;
	}

}
