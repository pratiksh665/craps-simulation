
//Imported Methods
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCrookedDie2
{
	//defined the object as an instance variable
	// so that its scope allows usage inside of the
	// individual junit tests cases
	
	CrookedDie2 crookedDie2Object; // instance variable object pointer
	
	//Method annotated with `@Before` will execute before 
	//each test method in this class is executed.
	@Before
	public void setup()
	{
		System.out.println("Running Setup; occurs before executing test cases");
		crookedDie2Object = new CrookedDie2();  //object creation
		System.out.println("Ending Setup; occurs before executing test cases");
	}

	// Testcase1
	@Test
	public void test1_verify_output_of_tostring_method()
	{
		System.out.println("Running Test Case2- Testing the ToString Method");
		String expected = "A CrookedDie2 rolling 1,2,3,4,5,6 in sequence, and... ";
		String actual = crookedDie2Object.toString();  // instance variable scope allows usage of CrookedDie1obje without giving a compile error
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
		crookedDie2Object = null; // object deletion
		assertNull(crookedDie2Object);
		System.out.println("Ending Teardown; occurs after executing test cases");
	}
}

