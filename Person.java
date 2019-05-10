//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Person - My creation assignment. The Person class animates a person.

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Person implements Runnable
{
    private Console c;

    public void person ()
    {
	//local colour variable for the skin tone
	Color peach = new Color (255, 233, 223);
	//local colour variable for the pathway
	Color pathGrey = new Color (50, 50, 50);
	//local colour variable for the hair
	Color hair = new Color (102, 51, 0);
	//local colour variable for the door light
	Color doorLight = new Color (255, 255, 0);
	//local colour variable for the grass
	
	//used to delay the animation
	    try
	    {
		Thread.sleep (33000);
	    }
	    catch (Exception e)
	    {
	    }
	    
	//loop used to animate the "opening" door.
	for (int i = 80 ; i > -1 ; i--)
	{
	    synchronized (c)
	    {
		c.setColor (doorLight);
		c.drawLine (280 + i, 140, 280 + i, 278);
	    }
	    
	    //used to delay the animation
	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used for animate the person
	for (int i = -189 ; i < 0 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (doorLight);
		c.fillRect (299, 140, 43, 139);
		c.setColor (Color.darkGray);
		c.fillRect (299, 279, 43, 140);
		c.setColor (pathGrey);
		c.fillRect (299, 321, 43, 163);
		c.setColor (pathGrey);
		c.fillRect (299, 140 + (i * -1 + 189), 43, 168);
		c.setColor (peach);
		c.fillRect (312, 360 + i, 16, 10);
		c.fillOval (305, 335 + i, 30, 30);
		c.fillRoundRect (300, 373 + i, 10, 60, 10, 10);
		c.fillRoundRect (330, 373 + i, 10, 60, 10, 10);
		c.setColor (Color.red);
		c.fillRoundRect (305, 370 + i, 30, 60, 10, 10);
		c.setColor (Color.orange);
		c.fillRect (309, 430 + i, 24, 10);
		c.fillRect (309, 430 + i, 10, 60);
		c.fillRect (322, 430 + i, 10, 60);
		c.setColor (Color.black);
		c.fillRoundRect (306, 486 + i, 15, 10, 10, 10);
		c.fillRoundRect (319, 486 + i, 15, 10, 10, 10);
		c.drawLine (315, 357 + i, 325, 357 + i);
		c.fillOval (323, 347 + i, 5, 5);
		c.fillOval (313, 347 + i, 5, 5);
		c.fillArc (303, 403 + i, 35, 40, 180, 180);
		c.setColor (hair);
		c.fillArc (302, 330 + i, 36, 30, 0, 180);
		c.setColor (Color.white);
		c.setFont (new Font ("Cambria", Font.PLAIN, 9));
		c.drawString ("CANDY", 306, 435 + i);
	    }
	    //used to delay the animation
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	
	//loop used to draw a text bubble.
	for (int i = 65 ; i < 155 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.drawLine (170, 355, i + 35, 365);
	    c.setColor (Color.black);
	    c.setFont (new Font ("Cambria", Font.PLAIN, 11));
	    c.drawString ("Trick or Treat!", 70, 349);
	}
	    //used to delay the animation
	    try
	    {
		Thread.sleep (3000);
	    }
	    catch (Exception e)
	    {
	    }
	    
	//loop used to draw a text bubble.
	for (int i = 375 ; i < 455 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.drawLine (i - 15, 365, 375, 355);
	    c.setColor (Color.black);
	    c.setFont (new Font ("Cambria", Font.PLAIN, 11));
	    c.drawString ("Your costumes are", 380, 335);
	    c.drawString ("so realistic, I", 380, 349);
	    c.drawString ("almost feel tricked!", 380, 363);
	}
	//used to delay the animation
	    try
	    {
		Thread.sleep (5000);
	    }
	    catch (Exception e)
	    {
	    }
	    
	    //loop used to draw a text bubble.
	for (int i = 375 ; i < 455 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.drawLine (i - 15, 365, 375, 355);
	    c.setColor (Color.black);
	    c.drawString ("Oh well... take", 380, 335);
	    c.drawString ("your candy.", 380, 349);
	    c.drawString (" Happy Halloween!", 380, 363);
	}
	
	//used to delay the animation
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}
    }
    
    //a transition.
    public void transition ()
    {
	//loop used to animate a transition
	for (int i = 0 ; i <= 360 ; i++)
	{
	    c.setColor (Color.black);
	    c.fillArc (-86, -149, 812, 812, 0, 0 + i);
	    //used to delay the animation
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
	
	//text
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.white);
	c.drawString ("Thanks For Watching!", 180, 260);
	
	//used to delay the animation
	try
	{
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
    }
    
    public Person (Console con)
    {
	c = con;
    }


    public void run ()
    {
	person ();
	transition ();
    }
}
