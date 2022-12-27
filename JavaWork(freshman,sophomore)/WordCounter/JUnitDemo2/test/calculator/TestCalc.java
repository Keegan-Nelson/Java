package calculator;

import org.junit.Test;

//import Calculator.Calc;
import junit.framework.TestCase; 

public class TestCalc extends TestCase {
	private Calc theCalc; 
	private Calc theCalc2;
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		theCalc = new Calc(); 
		theCalc2 = new Calc(); 
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	@Test
	public void testAdd() {
		theCalc.setInput1(34);
		theCalc.setInput2(99);
		theCalc.add(); 
		double out = theCalc.getOutput(); 
		assertTrue(out==133); 
	
	}
	
	@Test 
	public void testObject() { 
		theCalc.setInput1(34);
		theCalc.setInput2(99);
		theCalc.add(); 
		
		theCalc2.setInput1(34); 
		theCalc2.setInput2(99);
		theCalc2.add(); 
		
		assertEquals(theCalc, theCalc2);
		
		
	}
	
	

}
