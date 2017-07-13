package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.Map;

public interface iQuery <String>  {
 public ArrayList <String> findAll();
 default public Map <String, Double> findMaps()
 {
	 return null;
	 
	 
 }
}
