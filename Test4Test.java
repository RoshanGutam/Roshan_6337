package DemoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test4Test {

	@Test
	public void test() 
	{
		Test4 obj5=new Test4();
		assertTrue(6==obj5.div(30, 5));
	}

}
