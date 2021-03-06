//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;

import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;
	private int life;
	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   super(x,y);
	}

	public Ship(int x, int y, int s)
	{
		super(x,y);
		speed=s;
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("ship.jpg");
			image = ImageIO.read(url);
			
		}
		catch(Exception e)
		{
			System.out.print("hello");
		}
		life = 3;
	}


	public void setSpeed(int s)
	{
	   speed=s;
		if (life>0){
			life--;
			System.out.print(life);
			}
	}
	public int getLife(){
		return life;
	}
	public void loseLife(List<Alien> aliens){
		
		for (int j = 0; j < aliens.size(); j++) {
		if (this.isCollide(aliens.get(j))) {
				life--;
				setX(400);
				setY(400);
				
				}
		if (life==0)
				gameOver();
				
				}
			}
	public void gainLife(Lifes lif){
		
		if (this.isCollide(lif)) {
			
				life++;
				
				lif.move();
				
				
				}
		if (life==0)
				gameOver();
				
				}
			
	
		
			
	
	private void gameOver() {
		
		
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		if (direction.equals("RIGHT")){
			setX(getX()+speed);
		
			
		}
		else if (direction.equals("LEFT")){
			setX(getX()-speed);
		
			
		}
		else if (direction.equals("UP")){
			setY(getY()-speed);

			
		}
		else if (direction.equals("DOWN")){
			setY(getY()+speed);
		
		}
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(), null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
