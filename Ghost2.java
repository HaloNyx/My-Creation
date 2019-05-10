//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Ghost2 - My creation assignment. The Ghost2 class animates a ghost (second background version).

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Ghost2 implements Runnable
{
    private Console c;

    public void ghost2 ()
    {
	//local colour variable for the pathway
	Color pathGrey = new Color (50, 50, 50);
	
	//loop used for animate the ghost
	for (int x = 0 ; x < 118 ; x++)
	{
	    c.setColor (pathGrey);
	    c.fillRect (659 - x, 329, 42, 128); 
	    c.setColor (Color.white);
	    c.fillOval (660 - x, 330, 40, 40);
	    c.fillRect (660 - x, 350, 40, 101);
	    c.fillArc (660 - x, 446, 10, 10, 180, 180);
	    c.fillArc (670 - x, 446, 10, 10, 180, 180);
	    c.fillArc (680 - x, 446, 10, 10, 180, 180);
	    c.fillArc (690 - x, 446, 10, 10, 180, 180);
	    c.setColor (Color.black);
	    c.drawLine (673 - x, 415, 673 - x, 370);
	    c.drawLine (686 - x, 415, 686 - x, 370);
	    c.drawArc (673 - x, 407, 13, 13, 180, 180);
	    c.fillOval (666 - x, 345, 5, 10);
	    c.fillArc (655 - x, 355, 10, 15, 270, 180);
	    
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


    public Ghost2 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	ghost2 ();
    }
}
