// Note that this crooked die always returns 3
public class CrookedDie1 extends Die //CrookedDie1 is a subclass of the Parent class called Die
{
	//Constructor with no arguments
	public CrookedDie1()
	{
		CrapsGame.println("  CrookedDie1's constructor called.");
		
	}

	
	// access-modifier = public
	// non-access-modifier = static
	// return-type = Die aka Class Name
	// method-name = testStatic
	//parameters list = ()
	//Main Programs Non Static Method Call: objectname.nonstaticmethodname
	//Main Programs Static Method Call: classname.staticmethodname
	public static CrookedDie1 testStatic()
	{
		CrookedDie1 myDieObject = new CrookedDie1(); //object creation
		System.out.println("Executing CrookedDie1 classes teststatic method");
		return myDieObject; // method returns the CrookedDie1 object due to specifying Die as the return-type
	}
	
	
	
	
	//Overridding Dies classes getLastRoll() method--- Method for Junit Testing
	public int getLastRoll() // this OVERRIDES Die's getLastRoll(), replacing
								// it!
	{
		return 3;
	}
	
	//Overridding Dies classes toString() method--- Method for Junit Testing
	public String toString() // this OVERRIDES Die's toString()
	{
		return "A CrookedDie1 always rolling 3, and... " + super.toString(); // executing Die classes toString() method
	}

	//Main Method
	public static void main(String[] args)
	{
		CrookedDie1 crookedDie1Obj = new CrookedDie1(); // executes the constructor
		System.out.println(crookedDie1Obj.toString()); // executes the toString() method
		
	}
}
