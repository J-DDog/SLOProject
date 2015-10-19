package slopack.slocontroller;

import slopack.sloview.SLOView;

public class SLOController 
{
	
	private int myInt;
	private double myDouble;
	private String intString;
	
	private SLOView myOutput;
	
	public SLOController()
	{
		myOutput = new SLOView();
		myDouble = 5.14;
	}
	
	public void start()
	{
		intString = myOutput.getResponce("Give me a Integer: ");
		
		while(!isInt(intString))
		{
			intString = myOutput.getResponce("Give me a Integer: ");
		}
		
		if ( myInt <= 5 )
		{
			myOutput.displayMessage("Thats a small number.");
		}
		else
		{
			myOutput.displayMessage("Thats a Moderatly Sized number.");
		}
		
		if(myDouble > 4)
		{
			myOutput.displayMessage(myDouble + " > 4");
		}
		
	}
	
	private boolean isInt(String input)
	{
		boolean convertWorked = false;
		
		try
		{
			myInt = Integer.parseInt(input);
			convertWorked = true;
		}
		catch(NumberFormatException v)
		{
			myOutput.displayMessage("Error not an integer - try again");
		}
		
		return convertWorked;	
		
	}
	
}
