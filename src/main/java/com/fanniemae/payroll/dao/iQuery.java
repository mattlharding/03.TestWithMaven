package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.Map;

public interface iQuery <T>  {
 public ArrayList <T> findAll();
 default public Map <String, Double> findMaps()
 {
	 return null;
 }
	 
	 default public T findByKey (String key){
		 return null;
	 }
	 
 
}
