package com.fanniemae.payroll.driver;

import java.util.ArrayList;

import com.fanniemae.payroll.dao.CityRepository;
import com.fanniemae.payroll.model.City;
import com.fanniemae.payroll.model.Country;

public class DriverCountryRepository {

	public static void main (String[] args) {
		CountryRepository dao = new CountryRepository ();
		//((ArrayList<Country>) dao.findAll()).forEach(System.out::println);
		 Country country = dao.findByKey("USA");
			System.out.println(country); 
	}
	
	
}
