import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPlayWithInheritance
{
	//defined the object as an instance variable
	// so that its scope allows usage inside of the
	// individual junit tests cases
	
	PlayWithInheritance PWIObject; // instance variable object pointer
	private Die die;
	
	//Method annotated with `@Before` will execute before 
	//each test method in this class is executed.
	@Before
	public void setup()
	{
		System.out.println("Running Setup; occurs before executing test cases");
		PWIObject= new PlayWithInheritance();  //object creation
		System.out.println("Ending Setup; occurs before executing test cases");
	}

	@Test
	public void test()
	{
		die= new CrookedDie1();
		die.testStatic();
		assertNotNull(die);
	}

	
    //Method annotated with `@After` will execute once 
	//after all of the test methods are executed in this class.
	@After
	public void teardown ()
	{
		System.out.println("Running Teardown; occurs after executing test cases");
		PWIObject = null; // object deletion
		assertNull(PWIObject);
		System.out.println("Ending Teardown; occurs after executing test cases");
	}
}
