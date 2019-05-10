//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Skeleton1 - My creation assignment. The Skeleton1 class animates a skeleton (first background version).

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Skeleton1 implements Runnable
{
    private Console c;

    public void skeleton1 ()
    {
	//local colour variable for the grass
	Color grassGreen = new Color (0, 51, 0);

	//loop used for animate the skeleton
	for (int i = 0 ; i < 118 ; i++)
	{
	    c.setColor (grassGreen);
	    c.fillRect (646 - i, 349, 62, 147);
	    c.setColor (Color.white);
	    c.fillOval (662 - i, 350, 30, 30);
	    c.fillRect (667 - i, 375, 20, 10);
	    c.fillRoundRect (675 - i, 380, 8, 115, 10, 10);
	    c.fillRect (665 - i, 396, 13, 3);
	    c.fillRect (665 - i, 404, 13, 3);
	    c.fillRect (665 - i, 412, 13, 3);
	    c.fillArc (672 - i, 420, 15, 15, 180, 180);
	    c.fillRect (663 - i, 491, 15, 4);
	    c.setColor (Color.black);
	    c.fillOval (667 - i, 362, 10, 10);
	    c.drawLine (667 - i, 380, 678 - i, 380);
	    c.drawLine (668 - i, 378, 668 - i, 382);
	    c.drawLine (670 - i, 378, 670 - i, 382);
	    c.drawLine (672 - i, 378, 672 - i, 382);
	    c.drawOval (675 - i, 422, 5, 5);
	    c.drawLine (678 - i, 390, 678 - i, 422);
	    c.drawLine (678 - i, 432, 678 - i, 490);
	    c.drawOval (675 - i, 489, 5, 5);
	    c.drawLine (675 - i, 492, 665 - i, 492);
	    //used to delay the animation
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	
	//loop used for animate the skeleton
	for (int i = 118 ; i < 128 ; i++)
	{
	    c.setColor (grassGreen);
	    c.fillRect (646 - i, 349, 62, 147);
	    c.setColor (Color.white);
	    c.fillOval (664 - i, 350, 30, 30);
	    c.fillRect (669 - i, 375, 20, 10);
	    c.fillRoundRect (675 - i, 380, 8, 55, 10, 10);
	    c.fillRect (665 - i, 427, 8, 65);
	    c.fillRect (687 - i, 427, 8, 65);
	    c.fillRect (661 - i, 388, 36, 3);
	    c.fillRect (666 - i, 396, 26, 3);
	    c.fillRect (666 - i, 404, 26, 3);
	    c.fillRect (666 - i, 412, 26, 3);
	    c.fillRect (661 - i, 388, 3, 36);
	    c.fillRect (694 - i, 388, 3, 36);
	    c.fillArc (665 - i, 420, 30, 15, 180, 180);
	    c.fillRect (661 - i, 491, 15, 4);
	    c.fillRect (685 - i, 491, 15, 4);
	    c.setColor (Color.black);
	    c.fillOval (680 - i, 362, 10, 10);
	    c.fillOval (667 - i, 362, 10, 10);
	    c.drawLine (672 - i, 380, 684 - i, 380);
	    c.drawLine (674 - i, 378, 674 - i, 382);
	    c.drawLine (676 - i, 378, 676 - i, 382);
	    c.drawLine (678 - i, 378, 678 - i, 382);
	    c.drawLine (680 - i, 378, 680 - i, 382);
	    c.drawLine (682 - i, 378, 682 - i, 382);
	    
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
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
	
	//loop used to draw a text box
	for (int i = 255 ; i < 365 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.drawLine (i - 15, 365, 255, 355);
	    c.setColor (Color.black);
	    c.setFont (new Font ("Cambria", Font.PLAIN, 11));
	    c.drawString ("It's been a while, friends.", 260, 335);
	    c.drawString ("The village is still lit up", 260, 349);
	    c.drawString ("at this hour? I wonder...", 260, 363);
	}
	
	//used to delay the animation
	try
	{
	    Thread.sleep (7500);
	}
	catch (Exception e)
	{
	}
	
	//erases part of the text box
	for (int i = 0 ; i < 16 ; i++)
	{
	    c.setColor (grassGreen);
	    c.drawLine (255 - i, 365, 255, 354);
	}

	//loop used to draw a text box
	for (int i = 255 ; i < 365 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.drawLine (380, 355, i + 35, 365);
	    c.setColor (Color.black);
	    c.setFont (new Font ("Cambria", Font.PLAIN, 11));
	    c.drawString ("I, too, am curious.", 260, 335);
	    c.drawString ("Let us make haste...", 260, 349);
	    c.drawString ("To the village we go!", 260, 363);
	}
	
	//used to delay th animation
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}
    }


    public void transition ()
    {
	//a transition
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
	c.drawString ("A Few Minutes Later...", 180, 260);
	
	//used to delay the animation
	try
	{
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
    }


    public Skeleton1 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	skeleton1 ();
	transition ();
    }
}


