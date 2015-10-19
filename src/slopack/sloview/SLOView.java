package slopack.sloview;

import javax.swing.JOptionPane;

public class SLOView 
{
	
	public SLOView()
	{
		
	}
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	public String getResponce(String message)
	{
		return JOptionPane.showInputDialog(null, message);
	}
	
}
