package com.fanniemae.payroll.driver;

import java.util.HashMap;

public class DriverMap {
//  : the objective is to discuss the relationship the Map interface and HashMap imp
	
	public static void main(String[] args) {
		HashMap <String, Double> map = new HashMap <>();
		
		map.put("david",  1_000_000d);
		map.put("lucy",  2_000_000d);
		map.put("peter",  3_000_000d);

		System.out.println(map.get("david"));
		System.out.println (map.size());
	}

}
