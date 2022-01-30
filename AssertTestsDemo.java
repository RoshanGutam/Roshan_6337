package JunitTesting;
import static org.junit.Assert.*;

import org.junit.Test;


public class AssertTestsDemo 
{
	@Test
	public void assert1()
	{
		String x="Hello";
		String y="World";
		String z=null;
		
		assertEquals(x,x);
		assertNotEquals(x,y);
		assertNull(z);
		assertNotSame(x,y);
	}

}
