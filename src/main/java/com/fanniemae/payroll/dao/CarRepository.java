package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CarRepository implements iQuery<String> {
	public ArrayList <String> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map <String,Double> findMaps() {
		 Map <String,Double> list = new HashMap <>();
		list.put("Yaris: " ,10000d);
		list.put("Corolla: " ,15000d);
		list.put("Camry: " ,20000d);
		list.put("Avalon: " ,25000d);
		list.put("HRC: " ,30000d);
		list.put("Tundra: " ,35000d);
		list.put("Prius: " ,40000d);
		list.put("Supra: " ,45000d);
		list.put("TypeR: " ,50000d);
		list.put("Sequoia: " ,55000d);
		
		return list;
		
	}
	
}
