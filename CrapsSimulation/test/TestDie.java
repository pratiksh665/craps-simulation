

//imported libraries aka java classes 
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestDie
{
	//defined the object as an instance variable
	// so that its scope allows usage inside of the
	// individual junit tests cases

	Die dieObject; // instance variable object pointer
	
	
	//Method annotated with `@Before` will execute before 
	//each test method in this class is executed.
	@Before
	public void setup()
	{
		System.out.println("Running Setup; occurs before executing test cases");
		dieObject = new Die();  //object creation
		System.out.println("Ending Setup; occurs before executing test cases");
	}

	
	// Testcase1
	@Test
	public void test1()
	{
		System.out.println("Running Test Case1");
		dieObject = new Die (5);
		int expected = 5;
		int actual = dieObject.getLastRoll();
		// assertEquals(expected,actual) outputs a boolean
		assertEquals(expected, actual);
		System.out.println("Ending Test Case1");
	}
	
	
	// Testcase2
	@Test
	public void test2()
	{
		System.out.println("Running Test Case2");
		int expected = 6;
		dieObject.setLastRoll(6);
		int actual = dieObject.getLastRoll();
		// assertEquals(expected,actual) outputs a boolean
		assertEquals(expected,actual);
		System.out.println("Ending Test Case2");
	}
	
		
	@Test
	public void test3()
	{
		System.out.println("Running Test Case3");
		String expected = "A Die object with roll 8";
		dieObject.setLastRoll(8);
		String actual = dieObject.toString();
		// assertEquals(expected,actual) outputs a boolean
		assertEquals(expected,actual);
		System.out.println("Ending Test Case3");
	}
	
	
	@Test
	public void test4()
	{
		System.out.println("Running Test Case4");
		String expected = "2A Die object with roll 4";
		dieObject.setLastRoll(4);
		String actual = dieObject.toString(2);
		// assertEquals(expected,actual) outputs a boolean
		assertEquals(expected,actual);
		System.out.println("Ending Test Case3");
		
	}
		
    //Method annotated with `@After` will execute once 
	//after all of the test methods are executed in this class.
	@After
	public void teardown ()
	{
		System.out.println("Running Teardown; occurs after executing test cases");
		dieObject = null; // object deletion
		assertNull(dieObject);
		System.out.println("Ending Teardown; occurs after executing test cases");
	}
}





