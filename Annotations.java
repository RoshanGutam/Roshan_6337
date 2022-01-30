package JunitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Annotations 
{
	@BeforeClass
	public static void Before() 
	{
		System.out.println("This is @BeforeClass methode");
	}
	
	@AfterClass
	public static void After()
	{
		System.out.println("This is @AfterClass methode");
	}
	
	@Before
	public void start()
	{
		System.out.println("This is my @Before method");
	}
	@Test
	public void input()
	{
	
		System.out.println("This is my @Test method");
	}
	
	
	@After
	public void outout()
	{
		System.out.println("This is my @After method");
	}
	@Ignore
	public void run() 
	{
		System.out.println("This is @Ignore method ");
	}
	
	
	
		
	
	
}
