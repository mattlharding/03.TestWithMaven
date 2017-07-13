import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.fanniemae.payroll.dao.SalesTaxRepository;
import com.fanniemae.payroll.dao.ShoppingRepository;
import com.fanniemae.payroll.dao.iQuery;

public class SalesTaxList {

	@Test
	public void testIfNYExist() {
		
		SalesTaxRepository s = new SalesTaxRepository ();
		ArrayList <String> taxList = s.findAll();
		
		boolean isNewYorkAvailable = false;
		for (String x  : taxList) {
			isNewYorkAvailable = x.contains("NY");
			if (isNewYorkAvailable)
				break;
			System.out.println(x);
			
		}

		assertTrue (isNewYorkAvailable);
 	}
       @Test
       public void testShoppingList () {
 
    	   iQuery s = new ShoppingRepository ();
    	   
    	   ArrayList <String> list = s.findAll();
    	   int size = list.size();
    	   assertTrue (size > 4);
    	    
       }
    
       }
