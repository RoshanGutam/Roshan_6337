package DemoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test3Test {

	@Test
	public void test() {
		
		
		Test3 obj3=new Test3();
		assertTrue(25==obj3.mul(5, 5));
		assertFalse(23==obj3.mul(5, 5));
		
	}

}
