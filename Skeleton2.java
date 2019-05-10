//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Skeleton2 - My creation assignment. The Skeleton2 class animates a skeleton (second background version).

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Skeleton2 implements Runnable
{
    private Console c;

    public void skeleton2 ()
    {
	//local colour variable for the pathway
	Color pathGrey = new Color (50, 50, 50);

	//loop used for animate the skeleton
	for (int i = 0 ; i < 58 ; i++)
	{
	    c.setColor (pathGrey);
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
	
	//loop used to draw a text box
	for (int i = 255 ; i < 365 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.drawLine (380, 355, i + 35, 365);
	    c.setColor (Color.black);
	    c.setFont (new Font ("Cambria", Font.PLAIN, 11));
	    c.drawString ("Hello. Would you mind", 260, 335);
	    c.drawString ("explaining to us what", 260, 349);
	    c.drawString ("event is taking place", 260, 363);

	}
	
	//used to delay the animation
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}

	//loop used to draw a text box
	for (int i = 255 ; i < 365 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.setColor (Color.black);
	    c.drawString ("for this town to be lit", 260, 335);
	    c.drawString ("up at this time, or why", 260, 349);
	    c.drawString ("you are dressed like so?", 260, 363);
	}
	//used to delay the animation
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}
	
	//erases part of the text box
	for (int i = 0; i < 16; i ++)
	{
	    c.setColor (pathGrey);
	    c.drawLine (385, 354, 385 + i, 365);
	}
	
	//loop used to draw a text box
	for (int i = 255 ; i < 365 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.drawLine (i - 15, 365, 255, 355);
	    c.setColor (Color.black);
	    c.drawString ("It's Halloween, so you ", 260, 335);
	    c.drawString ("go around knocking on ", 260, 349);
	    c.drawString ("doors to and saying", 260, 363);
	}
	
	//used to delay the animation
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}
	
	//loop used to draw a text box
	for (int i = 255 ; i < 365 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.setColor (Color.black);
	    c.drawString ("\"Trick or treat\" to get", 260, 335);
	    c.drawString ("candy... Your costumes", 260, 349);
	    c.drawString ("are so realistic! Wait...", 260, 363);
	}
	
	//used to delay the animation
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}
	
	//loop used to draw a text box
	for (int i = 255 ; i < 365 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.setColor (Color.black);
	    c.drawString ("Is that ghost floating? AH!", 260, 335);
	    c.drawString ("You- You can have our", 260, 349);
	    c.drawString ("candy, but don't eat us!", 260, 363);
	}
	
	//used to delay the animation
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}   
	
	//erases the text box
	for (int i = 255 ; i < 365 ; i++)
	{
	    c.setColor (pathGrey);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.drawLine (i - 15, 365, 255, 355);
	}
    }


    public Skeleton2 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	skeleton2 ();
    }
}
