
public class Die
{
	// changed from private to protected so the subclasses have access to the lastRoll variable of the Die class
	protected int lastRoll;

	//Constructor with no arguments
	public Die()
	{
		this.lastRoll= (int) (Math.random() * 6 + 1); // generates a random number between 1-6
	}

	public Die(int firstValue) // overloaded constructor: different signature
	{
		setLastRoll(firstValue); // execute the setLastRoll() method
	}
	
	
	// access-modifier = public
	// non-access-modifier = static
	// return-type = Die aka Class Name
	// method-name = testStatic
	//parameters list = ()
	//Main Programs Non Static Method Call: objectname.nonstaticmethodname
	//Main Programs Static Method Call: classname.staticmethodname
	public static Die testStatic()
	{
		Die myDieObject = new Die(); //object creation
		System.out.println("Executing Dies classes teststatic method");
		return myDieObject; // method returns the die object due to specifying Die as the return-type
	}

	public int getLastRoll() // getter or accessor method
	{

		return this.lastRoll; // displays the value of the instance variable called lastRoll
	}

	// protected => visible to subclasses and package
	protected void setLastRoll(int lastRoll) // setter or mutator method
	{
		this.lastRoll = lastRoll; // updates the value of the instance variable called lastRoll
	}

	public void roll() // note how this changes Die's state, but doesn't return anything
	{
		setLastRoll((int) (Math.random() * 6 + 1)); // generates a random number between 1-6
	}

	// try changing visibility of toString to protected...
	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "A Die object with roll " + this.getLastRoll(); 

		// add the following to the end of the above line:
		// + " " + super.toString()
	}

	public String toString(int msg) // Overloading... but NOT overriding due to different signature
	{
		return msg + this.toString();
	}
	
	//main method
	public static void main (String [] args)
	{
		Die obj = new Die();
		System.out.println(obj.toString());
		System.out.println(obj.toString(4));
	}
}
