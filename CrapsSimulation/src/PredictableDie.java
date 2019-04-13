
public class PredictableDie extends Die  //PredictableDie is a subclass of the Parent class called Die
{                                        //extends keyword denotes Inheritance Relationship
	//Instance Variables
	private int[] throwSequence = null;
	private int nextInSeq = 0;
	
	//Constructor with no arguments
	public PredictableDie()
	{
		this.setThrowSequence(null);
	}
	
	//Constructor with 1 argument
	public PredictableDie(int[] seq)
	{
		this.setThrowSequence(seq);
	}
	
	//getter method to access the private instance variable inside another class
	public int[] getThrowSequence()
	{
		return throwSequence;
	}
	
	
	//setter method to update the private instance variable inside another class
	public void setThrowSequence(int [] throwSequence)
	{
		this.throwSequence=throwSequence;
	}
	
	// overriding Dies roll method
	public void roll ()
	{
		if(getThrowSequence()==null)
		{
			throw new RuntimeException("Null initializer");
		}
		if(nextInSeq == getThrowSequence().length)
		{
			this.nextInSeq=0;
		}
		
		this.lastRoll = getThrowSequence()[nextInSeq];
		this.nextInSeq++;
	}
}

