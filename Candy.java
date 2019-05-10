//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Candy - My creation assignment. The Candy class animates a candy.

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Candy extends Thread
{
    private Console c;

    public void candy ()
    {
	//local colour variable for the pathway
	Color pathGrey = new Color (50, 50, 50);
	//local colour variable for the candy
	Color candyPurple = new Color (102, 0, 102);

	//loop used for animate the candy
	for (int i = 0 ; i < 20 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.fillRect (220, 467 + i, 22, 13);
		c.setColor (Color.yellow);
		c.fillOval (226, 468 + i, 10, 10);
		c.fillArc (236, 468 + i, 10, 10, 90, 180);
		c.fillArc (216, 468 + i, 10, 10, 270, 180);
		c.setColor (candyPurple);
		c.fillStar (226, 468 + i, 10, 10);
		c.setColor (Color.red);
		c.drawLine (238, 469 + i, 238, 477 + i);
		c.drawLine (223, 469 + i, 223, 477 + i);
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
	
	//used to delay the animation
	try
	{
	    Thread.sleep (4500);
	}
	catch (Exception e)
	{
	}

	//erases the candy
	for (int i = 0 ; i < 20 ; i++)
	{
	    c.setColor (pathGrey);
	    c.fillRect (220, 467 + i, 22, 12);
	}

	//loop used for animate the candy
	for (int i = 0 ; i < 110 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.fillRect (220, 467 - i, 22, 13);
		c.setColor (Color.yellow);
		c.fillOval (226, 468 - i, 10, 10);
		c.fillArc (236, 468 - i, 10, 10, 90, 180);
		c.fillArc (216, 468 - i, 10, 10, 270, 180);
		c.setColor (candyPurple);
		c.fillStar (226, 468 - i, 10, 10);
		c.setColor (Color.red);
		c.drawLine (238, 469 - i, 238, 477 - i);
		c.drawLine (223, 469 - i, 223, 477 - i);
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
	//loop used for animate the candy
	for (int i = 0 ; i < 48 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.fillRect (220 + i, 357, 22, 13);
		c.setColor (Color.yellow);
		c.fillOval (226 + i, 358, 10, 10);
		c.fillArc (236 + i, 358, 10, 10, 90, 180);
		c.fillArc (216 + i, 358, 10, 10, 270, 180);
		c.setColor (candyPurple);
		c.fillStar (226 + i, 358, 10, 10);
		c.setColor (Color.red);
		c.drawLine (238 + i, 359, 238 + i, 367);
		c.drawLine (223 + i, 359, 223 + i, 367);
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
	
	//erases the candy
	for (int i = 0 ; i < 23 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.drawRect (265 + i, 357, 1, 13);
	    }
	}
    }


    public Candy (Console con)
    {
	c = con;
    }


    public void run ()
    {
	candy ();
    }
}
