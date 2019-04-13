
public class CrookedDie2 extends Die //CrookedDie2 is a subclass of the Parent class called Die
{
	//Constructor with no arguments
	public CrookedDie2()
	{
		CrapsGame.println("  CrookedDie2's constructor called.");
	}

	//Overridding Dies classes roll() method
	public void roll() // can you see what this computes?
	{
		// call the inherited method to get lastRoll from parent Die parts

		int testRoll = getLastRoll(); // executes Dies getLast Roll Method

		if (testRoll == 6)
			this.setLastRoll(1);
		else
			this.setLastRoll(testRoll + 1);
		
	}
	
	//Overridding Dies classes getLastRoll() method
	public String toString()
	{
		return "A CrookedDie2 rolling 1,2,3,4,5,6 in sequence, and... ";
	}
	
	//Main Method
	public static void main (String[] args)
	{
		CrookedDie2 crookedDie2Obj = new CrookedDie2(); // executes the constructor
		crookedDie2Obj.roll(); // executes the roll method which doesnt return anything
		crookedDie2Obj.toString();
	}

}
