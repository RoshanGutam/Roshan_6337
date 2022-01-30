package DemoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1Test {

	@Test
	public void test() 
	{
		Test1 obj=new Test1();
		assertTrue(40==obj.add(30, 10));
		
	}

}
