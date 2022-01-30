package DemoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2Test {

	@Test
	public void test() {
		Test2 obj2=new Test2();
		assertTrue(20==obj2.sub(30, 10));
	}

}
