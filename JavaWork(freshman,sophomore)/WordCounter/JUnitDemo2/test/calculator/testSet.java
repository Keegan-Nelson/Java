package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class testSet extends TestCase {
	
	
	@Test 
	public void TestSet() { 
		Set a = new TreeSet(); 
		a.add(7);a.add(9);a.add(3);a.add(11); 
		Set b = new HashSet(); 
		b.add(7);b.add(9);b.add(3);b.add(11); 
		
		assertEquals(a,b); 
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
}
