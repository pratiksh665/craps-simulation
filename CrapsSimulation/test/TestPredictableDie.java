
// imported libraries aka java classes 
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPredictableDie
{
	private PredictableDie predictableDieObject; // instance variables scope allows usage inside of the invidual test cases
	
	//Method annotated with `@Before` will execute before 
	//each test method in this class is executed.
	@Before 
	public void setup()
	{
		System.out.println("Running Setup; occurs before executing test cases");
		predictableDieObject = new PredictableDie(); //object creation
		System.out.println("Ending Setup; occurs before executing test cases");
	}
	
	//Method annotated with '@Test' means that we are specifying a test case
	@Test
	public void test1_predictable_die_one_value()
	{
		System.out.println("Running Test Case1");
		predictableDieObject.setThrowSequence(new int[] {1});
		predictableDieObject.roll();
		assertEquals(1,predictableDieObject.getLastRoll()); 		// expected, actual
		System.out.println("Ending Test Case1");
	}
	
	//Method annotated with '@Test' means that we are specifying a test case
	@Test
	public void test2_predictable_die_two_values()
	{
		System.out.println("Running Test Case2");
		predictableDieObject.setThrowSequence(new int[] {1,2});
		predictableDieObject.roll();
		assertEquals(1,predictableDieObject.getLastRoll()); 		// expected, actual
		predictableDieObject.roll();
		assertEquals(2,predictableDieObject.getLastRoll()); 		// expected, actual
		System.out.println("Ending Test Case2");
	}
		
	//Method annotated with '@Test' means that we are specifying a test case
	@Test
	public void test3_predictable_die_two_value_wraparound()
	{
		System.out.println("Running Test Case3");
		predictableDieObject.setThrowSequence(new int[] {1,2});
		predictableDieObject.roll();
		assertEquals(1,predictableDieObject.getLastRoll()); 		// expected, actual
		predictableDieObject.roll();
		assertEquals(2,predictableDieObject.getLastRoll()); 		// expected, actual
		predictableDieObject.roll();
		assertEquals(1,predictableDieObject.getLastRoll()); 		// expected, actual
		System.out.println("Ending Test Case3");
	}
	
	//Method annotated with '@Test' means that we are specifying a test case
	@Test(expected=RuntimeException.class) // expected Runtime Exception
	public void test4_predictable_die_empty_initializer()
	{
		System.out.println("Running Test Case4");
		predictableDieObject.setThrowSequence(new int[] {});
		predictableDieObject.roll();
		assertEquals(1,predictableDieObject.getLastRoll()); 	// expected, actual
		System.out.println("Ending Test Case4");
	}
	
	//Method annotated with '@Test' means that we are specifying a test case
	@Test
	public void test5_predictable_die_six_values()
	{
		System.out.println("Running Test Case5");
		predictableDieObject.setThrowSequence(new int[] {1,2,3,4,5,6});
		predictableDieObject.roll();
		assertEquals(1,predictableDieObject.getLastRoll()); 		// expected, actual
		predictableDieObject.roll();
		assertEquals(2,predictableDieObject.getLastRoll()); 		// expected, actual
		predictableDieObject.roll();
		assertEquals(3,predictableDieObject.getLastRoll()); 		// expected, actual
		predictableDieObject.roll();
		assertEquals(4,predictableDieObject.getLastRoll()); 		// expected, actual
		predictableDieObject.roll();
		assertEquals(5,predictableDieObject.getLastRoll()); 		// expected, actual
		predictableDieObject.roll();
		assertEquals(6,predictableDieObject.getLastRoll()); 		// expected, actual
		System.out.println("Ending Test Case5");
	}
	
	//Method annotated with '@Test' means that we are specifying a test case
	@Test
	public void test6_throwSequence()
	{
		System.out.println("Running Test Case5");
		predictableDieObject.setThrowSequence(new int[] {1,2});
		int [] expected = {1,2};
		assertArrayEquals(expected , predictableDieObject.getThrowSequence()); 		// expected, actual
		System.out.println("Ending Test Case6");
	}
	
	
	//Method annotated with `@After` will execute once 
	//after all of the test methods are executed in this class.
	@After
	public void teardown ()
	{
		System.out.println("Running Teardown; occurs after executing test cases");
		predictableDieObject = null; // object deletion
		assertNull(predictableDieObject);
		System.out.println("Ending Teardown; occurs after executing test cases");
	}
}
