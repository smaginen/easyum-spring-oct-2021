package com.easyum.jdbc.callbacks;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

/**
 *
 *
 */
public class AccountReportWriter implements RowCallbackHandler {

	@Override
	public void processRow(ResultSet resultSet) throws SQLException {
		// parse current row from ResultSet and stream to output
	}

}
