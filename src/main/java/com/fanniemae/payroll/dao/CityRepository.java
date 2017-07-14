package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fanniemae.payroll.model.City;

public class CityRepository extends AbstractSQLDAO 
	implements iQuery <City>{
		
	ArrayList<City> list = new ArrayList<>();
	
	@Override
	public void results(ResultSet rs) throws SQLException {

		int id = rs.getInt("id");
		String name = rs.getString("name");
		int population = rs.getInt("population");
		
		list.add(new City(id, name, population));

	}

	@Override
	public ArrayList <City> findAll() {
		String sql = "select ID, name, population from city";
		super.process(sql);
	
		return list;
	}

	@Override
	public City findByKey(String key) {
		String sql = "select ID, name, population from city where id = " + key;
		super.process(sql);
		City city = list.get(0);
		return city;
		
		
	}
}
