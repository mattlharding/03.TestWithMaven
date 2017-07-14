package com.fanniemae.payroll.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

public abstract class AbstractSQLDAO {

	private BasicDataSource ds = new BasicDataSource();

	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	{
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("Hexaware!");
		ds.setUrl("jdbc:mysql://localhost:3306/world?useSSL=false");
	}

	public void modify(String sqlstatement) {
		try (Connection con = ds.getConnection();)

		{
			stmt = con.createStatement();
			stmt.executeUpdate(sqlstatement);

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void process(String sqlStatement) {

		try (Connection con = ds.getConnection();) {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlStatement);
			while (rs.next() == true) {
				results(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public abstract void results(ResultSet rs) throws SQLException;
}
