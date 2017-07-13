import static org.junit.Assert.*;

import org.junit.Test;

import com.fanniemae.payroll.ManagementEmployee;

public class ManagementEmployeeTest {

	@Test
	public void testHourlyWage() {
		ManagementEmployee m = new ManagementEmployee (52_000, 40); 
		float wage = m.getHourlyWage();
		
		assertTrue (wage == 25);
		
	}
	@Test
	public void testWeeklySalary() {
		ManagementEmployee m = new ManagementEmployee (52_000, 40);
		float weeklySalary = m.getWeeklySalary();
		
		assertTrue (weeklySalary == 1_000);
}

	@Test
	public void testMonthlySalary() {
		ManagementEmployee m = new ManagementEmployee (52_000, 40);
		float monthlySalary = m.getMonthlySalary();
		
		assertTrue (monthlySalary > 4_333);
}

}

