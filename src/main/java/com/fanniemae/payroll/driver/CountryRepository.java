package com.fanniemae.payroll.driver;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.fanniemae.payroll.dao.AbstractSQLDAO;
import com.fanniemae.payroll.dao.iQuery;
import com.fanniemae.payroll.model.City;
import com.fanniemae.payroll.model.Country;



	
	public class CountryRepository extends AbstractSQLDAO 
	implements iQuery <Country>{
		
	ArrayList<Country> list = new ArrayList<>();
	
	@Override
	public void results(ResultSet rs) throws SQLException {

		String code = rs.getString("code");
		String name = rs.getString("name");
		int population = rs.getInt("population");
		
		list.add((Country) new Country(code, name, population));

	}

	@Override
	public ArrayList<Country> findAll() {
		String sql = "select code, name, population from country";
		super.process(sql);
	
		return list;
}

	@Override
	public Country findByKey(String key) {
		String sql = "select code, name, population from country where code = '" + key +"'";
		System.out.println(sql);
		super.process(sql);
		Country country = list.get(0);
		return country;
	
	}
	
}