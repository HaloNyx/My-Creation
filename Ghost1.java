//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Ghost1 - My creation assignment. The Ghost1 class animates a ghost (first background version).

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Ghost1 implements Runnable
{
    private Console c;

    public void ghost1 ()
    {
	//local colour variable for the grass
	Color grassGreen = new Color (0, 51, 0);
	
	//loop used for animate the ghost
	for (int x = 0 ; x < 118 ; x++)
	{
	    c.setColor (grassGreen);
	    c.fillRect (-59 + x, 329, 42, 128); 
	    c.setColor (Color.white);
	    c.fillOval (-58 + x, 330, 40, 40);
	    c.fillRect (-58 + x, 350, 40, 101);
	    c.fillArc (-58 + x, 446, 10, 10, 180, 180);
	    c.fillArc (-48 + x, 446, 10, 10, 180, 180);
	    c.fillArc (-38 + x, 446, 10, 10, 180, 180);
	    c.fillArc (-28 + x, 446, 10, 10, 180, 180);
	    c.setColor (Color.black);
	    c.drawLine (-45 + x, 415, -45 + x, 370);
	    c.drawLine (-32 + x, 415, -32+ x, 370);
	    c.drawArc (-45 + x, 407, 13, 13, 180, 180);
	    c.fillOval (-32 + x, 345, 5, 10);
	    c.fillArc (-23 + x, 355, 10, 15, 90, 180);
	    //used to delay the animation
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	
	//loop used for animate the ghost
	for (int x = 118 ; x < 128 ; x++)
	{
	    c.setColor (grassGreen);
	    c.fillRect (-59 + x, 329, 42, 128); 
	    c.setColor (Color.white);
	    c.fillOval (-58 + x, 330, 40, 40);
	    c.fillRect (-58 + x, 350, 40, 101);
	    c.fillArc (-58 + x, 446, 10, 10, 180, 180);
	    c.fillArc (-48 + x, 446, 10, 10, 180, 180);
	    c.fillArc (-38 + x, 446, 10, 10, 180, 180);
	    c.fillArc (-28 + x, 446, 10, 10, 180, 180);
	    c.setColor (Color.black);
	    c.fillOval (-32 + x, 345, 5, 10);
	    c.fillOval (-50 + x, 345, 5, 10);
	    c.fillOval (-43 + x, 355, 10, 15);
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


    public Ghost1 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	ghost1 ();
    }
}
