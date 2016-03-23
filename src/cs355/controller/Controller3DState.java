package cs355.controller;

import java.awt.event.MouseEvent;
import java.util.Iterator;

import com.sun.glass.events.KeyEvent;

import cs355.model.scene.Point3D;
import cs355.model.scene.SceneModel;

public class Controller3DState implements IControllerState
{

	public Controller3DState() 
	{
		
	}
	
	
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

//	@Override
//	public void keyPressed(Iterator<Integer> iterator)
//	{
//		while(iterator.hasNext())
//		{
//			switch(iterator.next())
//			{
//				case KeyEvent.VK_A:
//					this.moveLeft();
//					break;
//				case KeyEvent.VK_D:
//					this.moveRight();
//					break;
//				case KeyEvent.VK_W:
//					this.moveForward();
//					break;
//				case KeyEvent.VK_S:
//					this.moveBackward();
//					break;
//				case KeyEvent.VK_Q:
//					this.turnLeft();
//					break;
//				case KeyEvent.VK_E:
//					this.turnRight();
//					break;
//				case KeyEvent.VK_R:
//					this.moveUp();
//					break;
//				case KeyEvent.VK_F:
//					this.moveDown();
//					break;
//				case KeyEvent.VK_H:
//					this.moveHome();
//					break;
//			}
//		}
//	}

	
//	//-------------------------------CAMERA FUNCTIONS----------------------------------
//	
//	private void moveLeft()
//	{
//		Point3D cam = SceneModel.instance().getCameraPosition();
//		cam.x += UNIT * (float)Math.sin(Math.toRadians(SceneModel.instance().getCameraRotation()-90));
//	    cam.z -= UNIT * (float)Math.cos(Math.toRadians(SceneModel.instance().getCameraRotation()-90));
//	    SceneModel.instance().setCameraPosition(cam);
//	}
//	
//	private void moveRight()
//	{
//		Point3D cam = SceneModel.instance().getCameraPosition();
//		cam.x += UNIT * (float)Math.sin(Math.toRadians(SceneModel.instance().getCameraRotation()+90));
//	    cam.z -= UNIT * (float)Math.cos(Math.toRadians(SceneModel.instance().getCameraRotation()+90));
//	    SceneModel.instance().setCameraPosition(cam);
//	}
//	
//	private void moveForward()
//	{
//		Point3D cam = SceneModel.instance().getCameraPosition();
//		cam.x -= UNIT * (float) Math.sin(Math.toRadians(SceneModel.instance().getCameraRotation()));
//		cam.z += UNIT * (float) Math.cos(Math.toRadians(SceneModel.instance().getCameraRotation()));
//		SceneModel.instance().setCameraPosition(cam);
//	}
//	
//	private void moveBackward()
//	{
//		Point3D cam = SceneModel.instance().getCameraPosition();
//		cam.x += UNIT * (float) Math.sin(Math.toRadians(SceneModel.instance().getCameraRotation()));
//		cam.z -= UNIT * (float) Math.cos(Math.toRadians(SceneModel.instance().getCameraRotation()));
//		SceneModel.instance().setCameraPosition(cam);
//	}
//	
//	private void turnLeft()
//	{
//		SceneModel.instance().setCameraRotation(SceneModel.instance().getCameraRotation() - UNIT/16);
//	}
//	
//	private void turnRight()
//	{
//		SceneModel.instance().setCameraRotation(SceneModel.instance().getCameraRotation() + UNIT/16);
//	}
//	
//	private void moveUp()
//	{
//		Point3D cam = SceneModel.instance().getCameraPosition();
//		cam.y += UNIT;
//		SceneModel.instance().setCameraPosition(cam);
//	}
//	
//	private void moveDown()
//	{
//		Point3D cam = SceneModel.instance().getCameraPosition();
//		cam.y -= UNIT;
//		SceneModel.instance().setCameraPosition(cam);
//	}
//	
//	private void moveHome()
//	{
//		Point3D cam = SceneModel.instance().getCameraPosition();
//		cam.x = 0;
//		cam.y = 3;
//		cam.z = -50;
//		SceneModel.instance().setCameraRotation(0.0f);
//		SceneModel.instance().setCameraPosition(cam);
//	}

}
