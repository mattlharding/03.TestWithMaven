import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fanniemae.payroll.dao.CarRepository;

public class CarRepTest { 

	@Test
	public void testSizefor10 () {
	
		CarRepository car = new CarRepository ();
		int size = car.findMaps().size();
				
				assertTrue ("size is : " + size, size == 20);
		
				
		
			
			
			
	}

}
