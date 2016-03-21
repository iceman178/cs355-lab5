package cs355.controller;

import java.awt.event.MouseEvent;

public class Controller3DState implements IControllerState
{

	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		// DO NOTHING
	}

	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		// DO NOTHING
	}

	@Override
	public void mouseDragged(MouseEvent arg0) 
	{
		// DO NOTHING
	}

	@Override
	public stateType getType() 
	{
		return stateType.THREE_DIM;
	}

}
