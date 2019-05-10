//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Witch2 - My creation assignment. The Witch2 class animates a witch (second background version).

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Witch2 implements Runnable
{
    private Console c;

    public void witch2 ()
    {
	//local colour variable for the pathway
	Color pathGrey = new Color (50, 50, 50);
	//local colour variable for the witch's clothes
	Color clothesPurple = new Color (102, 0, 102);
	
	try
	{
	    Thread.sleep (3000);
	}
	catch (Exception e)
	{
	}

	//loop used for animate the witch
	for (int i = 0 ; i < 178 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.fillRect (649 - i, 323, 62, 174);
		c.setColor (clothesPurple);
		c.fillRect (672 - i, 380, 16, 10);
		c.setColor (Color.green);
		c.fillOval (665 - i, 355, 30, 30);
		c.setColor (clothesPurple);
		c.fillRoundRect (665 - i, 390, 30, 100, 10, 10);
		c.fillArc (650 - i, 432, 60, 129, 0, 180);
		c.drawLine (668 - i, 377, 673 - i, 377);
		c.setColor (Color.black);
		c.fillOval (670 - i, 367, 5, 5);
		c.fillArc (665 - i, 350, 30, 30, 0, 180);
		c.fillRect (679 - i, 365, 17, 60);
		int x[] = {668 - i, 679 - i, 690 - i};
		int y[] = {353, 323, 353};
		c.setColor (clothesPurple);
		c.fillPolygon (x, y, 3);
		c.fillOval (660 - i, 350, 40, 6);
		c.setColor (Color.green);
		c.fillRoundRect (675 - i, 390, 10, 50, 10, 10);
		c.fillOval (675 - i, 435, 10, 10);
		c.fillArc (656 - i, 370, 20, 4, 90, 180);
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
    }


    public Witch2 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	witch2 ();
    }
}
