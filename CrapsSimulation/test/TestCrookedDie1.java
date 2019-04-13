

//Imported Methods
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCrookedDie1
{
	//defined the object as an instance variable
	// so that its scope allows usage inside of the
	// individual junit tests cases
	
	CrookedDie1 crookedDie1Object; // instance variable object pointer
	
	//Method annotated with `@Before` will execute before 
	//each test method in this class is executed.
	@Before
	public void setup()
	{
		System.out.println("Running Setup; occurs before executing test cases");
		crookedDie1Object = new CrookedDie1();  //object creation
		System.out.println("Ending Setup; occurs before executing test cases");
	}

	// Testcase1
	@Test
	public void test1_getlastroll_method_prints_out_3_Always()
	{
		System.out.println("Running Test Case1- Testing the GetLastRoll Method");
		int expected = 3;
		int actual = crookedDie1Object.getLastRoll();  // instance variable scope allows usage of CrookedDie1obje without giving a compile error
		// assertEquals(expected,actual) outputs a boolean
		assertEquals(expected, actual);
		System.out.println("Ending Test Case1");
	}
	
	// Testcase2
	@Test
	public void test2_verify_output_of_tostring_method_gives_3()
	{
		System.out.println("Running Test Case2- Testing the ToString Method");
		String expected = "A CrookedDie1 always rolling 3, and... A Die object with roll 3";
		String actual = crookedDie1Object.toString();  // instance variable scope allows usage of CrookedDie1obje without giving a compile error
		// assertEquals(expected,actual) outputs a boolean
		assertEquals(expected, actual);
		System.out.println("Ending Test Case2");
	}
		

    //Method annotated with `@After` will execute once 
	//after all of the test methods are executed in this class.
	@After
	public void teardown ()
	{
		System.out.println("Running Teardown; occurs after executing test cases");
		crookedDie1Object = null; // object deletion
		assertNull(crookedDie1Object);
		System.out.println("Ending Teardown; occurs after executing test cases");
	}
}
