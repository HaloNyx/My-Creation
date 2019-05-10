//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Vampire1 - My creation assignment. The Vampire1 class animates a vampire (first background version).

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Vampire1 implements Runnable
{
    private Console c;

    public void vampire1 ()
    {
	//local colour variable for robe collar area
	Color collarGrey = new Color (192, 192, 192);
	//local colour variable for sleeves
	Color sleevesGrey = new Color (128, 128, 128);
	//local colour variable for the grass
	Color grassGreen = new Color (0, 51, 0);

	//loop used for animate the vampire
	for (int i = 0 ; i < 238 ; i++)
	{
	    c.setColor (grassGreen);
	    c.fillRect (-59 + i, 329, 42, 168);
	    c.setColor (collarGrey);
	    c.fillRect (-46 + i, 360, 16, 10);
	    c.setColor (Color.white);
	    c.fillOval (-53 + i, 335, 30, 30);
	    c.setColor (Color.black);
	    c.fillRoundRect (-53 + i, 370, 30, 100, 10, 10);
	    c.fillArc (-58 + i, 386, 40, 221, 0, 180);
	    c.fillArc (-57 + i, 330, 36, 30, 0, 225);
	    c.drawLine (-33 + i, 357, -26 + i, 357);
	    c.drawLine (-34 + i, 357, -33 + i, 360);
	    c.drawLine (-32 + i, 357, -33 + i, 360);
	    c.setColor (Color.white);
	    c.fillArc (-38 + i, 340, 15, 15, 0, 180);
	    c.fillOval (-43 + i, 425, 10, 10);
	    c.setColor (Color.red);
	    c.fillOval (-35 + i, 347, 5, 5);
	    c.setColor (sleevesGrey);
	    c.fillRoundRect (-46 + i, 370, 15, 60, 10, 10);
	    
	    //used to delay the animation
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}  
	//loop used for animate the vampire
	for (int x = 238 ; x < 248 ; x++)
	{
	    c.setColor (grassGreen);
	    c.fillRect (-59 + x, 329, 42, 168); 
	    c.setColor (collarGrey);
	    c.fillRect (-46 + x, 360, 16, 10);
	    c.setColor (Color.white);
	    c.fillOval (-53 + x, 335, 30, 30);
	    c.fillOval (-58 + x, 425, 10, 10);
	    c.fillOval (-28 + x, 425, 10, 10);
	    c.setColor (sleevesGrey);
	    c.fillRoundRect (-58 + x, 370, 40, 60, 10, 10);
	    c.setColor (Color.black);
	    c.fillRoundRect (-53 + x, 370, 30, 100, 10, 10);
	    c.fillArc (-58 + x, 385, 40, 220, 0, 180);
	    c.fillArc (-53 + x, 330, 30, 30, 0, 180);
	    c.drawLine (-43 + x, 357, -33 + x, 357);
	    c.drawLine (-42 + x, 357, -41 + x, 360);
	    c.drawLine (-40 + x, 357, -41 + x, 360);
	    c.drawLine (-36 + x, 357, -35 + x, 360);
	    c.drawLine (-34 + x, 357, -35 + x, 360);
	    c.setColor (Color.white);
	    c.fillArc (-53 + x, 340, 15, 15, 0, 180);
	    c.fillArc (-38 + x, 340, 15, 15, 0, 180);
	    c.setColor (Color.red);
	    c.fillOval (-46 + x, 347, 5, 5);
	    c.fillOval (-35 + x, 347, 5, 5);

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

    public Vampire1 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	vampire1 ();
    }
}
