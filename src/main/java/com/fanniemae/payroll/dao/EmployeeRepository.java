package com.fanniemae.payroll.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.fanniemae.payroll.model.EmployeeType;

public class EmployeeRepository {

	public ArrayList <EmployeeType> findAll () {
		String fileName = "/data/employees.txt";
		
		FileReader fr;
		
		ArrayList <EmployeeType> list = new ArrayList <>();
		
		try {
			fr = new FileReader (fileName);
			BufferedReader br = new BufferedReader(fr);
			
			String row = "";
			
			br.readLine();
			while ((row = br.readLine())!= null ) {
				
				String [] columns = row.split (",");
				String type = columns [0];
				float hoursWorked = Float.parseFloat(columns [2]);
				float salary = Float.parseFloat(columns [1]);
				
				EmployeeType empType = new EmployeeType(type, salary, hoursWorked);
			
				list.add(empType);
			}
			
			br.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
}
