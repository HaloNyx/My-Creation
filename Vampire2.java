//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Vampire2 - My creation assignment. The Vampire1 class animates a vampire (second background version).

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Vampire2 extends Thread
{
    private Console c;

    public void vampire2 ()
    {
	//local colour variable for robe collar area
	Color collarGrey = new Color (192, 192, 192);
	//local colour variable for sleeves
	Color sleevesGrey = new Color (128, 128, 128);
	//local colour variable for the pathway
	Color pathGrey = new Color (50, 50, 50);
	//local colour variable for the door
	Color doorRed = new Color (100, 0, 0);
	//local colour variable for the doorknob
	Color doorknobYellow = new Color (205, 205, 105);
	//local colour variable for some building walls
	Color buildingBrown = new Color (205, 184, 135);

	//loop used for animate the vampire
	for (int i = 0 ; i < 238 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.fillRect (659 - i, 329, 42, 168);
		c.setColor (collarGrey);
		c.fillRect (672 - i, 360, 16, 10);
		c.setColor (Color.white);
		c.fillOval (665 - i, 335, 30, 30);
		c.setColor (Color.black);
		c.fillRoundRect (665 - i, 370, 30, 100, 10, 10);
		c.fillArc (660 - i, 386, 40, 221, 0, 180);
		c.fillArc (663 - i, 330, 36, 30, 315, 225);
		c.drawLine (667 - i, 357, 674 - i, 357);
		c.drawLine (672 - i, 357, 673 - i, 360);
		c.drawLine (674 - i, 357, 673 - i, 360);
		c.setColor (Color.white);
		c.fillArc (665 - i, 340, 15, 15, 0, 180);
		c.fillOval (675 - i, 425, 10, 10);
		c.setColor (Color.red);
		c.fillOval (672 - i, 347, 5, 5);
		c.setColor (sleevesGrey);
		c.fillRoundRect (673 - i, 370, 15, 60, 10, 10);
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
	    Thread.sleep (33000);
	}
	catch (Exception e)
	{
	}
	
	//loop used for animate the vampire
	for (int i = 238 ; i < 368 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.fillRect (659 - i, 329, 42, 168);
		c.setColor (collarGrey);
		c.fillRect (672 - i, 360, 16, 10);
		c.setColor (Color.white);
		c.fillOval (665 - i, 335, 30, 30);
		c.setColor (Color.black);
		c.fillRoundRect (665 - i, 370, 30, 100, 10, 10);
		c.fillArc (660 - i, 386, 40, 221, 0, 180);
		c.fillArc (663 - i, 330, 36, 30, 315, 225);
		c.drawLine (667 - i, 357, 674 - i, 357);
		c.drawLine (672 - i, 357, 673 - i, 360);
		c.drawLine (674 - i, 357, 673 - i, 360);
		c.setColor (Color.white);
		c.fillArc (665 - i, 340, 15, 15, 0, 180);
		c.fillOval (675 - i, 425, 10, 10);
		c.setColor (Color.red);
		c.fillOval (672 - i, 347, 5, 5);
		c.setColor (sleevesGrey);
		c.fillRoundRect (673 - i, 370, 15, 60, 10, 10);
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
	//loop used for animate the vampire
	for (int i = 368 ; i < 378 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.fillRect (622 - i, 329, 81, 168);
		c.setColor (collarGrey);
		c.fillRect (672 - i, 360, 16, 10);
		c.setColor (Color.white);
		c.fillOval (665 - i, 335, 30, 30);
		c.setColor (Color.black);
		c.fillRoundRect (665 - i, 370, 30, 100, 10, 10);
		c.fillArc (660 - i, 386, 40, 221, 0, 180);
		c.fillArc (663 - i, 330, 36, 30, 315, 225);
		c.drawLine (667 - i, 357, 674 - i, 357);
		c.drawLine (672 - i, 357, 673 - i, 360);
		c.drawLine (674 - i, 357, 673 - i, 360);
		c.setColor (Color.white);
		c.fillArc (665 - i, 340, 15, 15, 0, 180);
		c.fillOval (623 - i, 373, 10, 10);
		c.setColor (Color.red);
		c.fillOval (672 - i, 347, 5, 5);
		c.setColor (sleevesGrey);
		c.fillRoundRect (628 - i, 371, 60, 15, 10, 10);
		c.setColor (Color.black);
		c.fillArc (665 - i, 343, 15, 20, 180, 180);
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
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}
	
	//loop used for animate the vampire
	for (int i = 338 ; i < 373 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.fillRect (-94 + i, 329, 77, 168);
		c.setColor (collarGrey);
		c.fillRect (-46 + i, 360, 16, 10);
		c.setColor (Color.white);
		c.fillOval (-53 + i, 335, 30, 30);
		c.setColor (Color.black);
		c.fillRoundRect (-53 + i, 370, 30, 100, 10, 10);
		c.fillArc (-58 + i, 385, 40, 220, 0, 180);
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
	
	//loop used to draw a text bubble
	for (int i = 375 ; i < 455 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.drawLine (i - 15, 365, 375, 355);
	    c.setColor (Color.black);
	    c.setFont (new Font ("Cambria", Font.PLAIN, 11));
	    c.drawString ("Wow, these candies", 380, 335);
	    c.drawString ("taste good. I'll", 380, 349);
	    c.drawString ("take the girls'", 380, 363);
	}
	//used to delay the animation
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}
	
	//loop used to draw a text bubble
	for (int i = 375 ; i < 455 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.setColor (Color.black);
	    c.drawString ("advice and go to", 380, 335);
	    c.drawString ("that door to ask", 380, 349);
	    c.drawString ("for more candy.", 380, 363);
	}
	//used to delay the animation
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}
	
	//loop used to draw a text bubble
	for (int i = 375 ; i < 455 ; i++)
	{
	    c.setColor (pathGrey);
	    c.drawRoundRect (i, 320, 20, 50, 10, 10);
	    c.drawLine (i - 15, 365, 375, 355);
	}
	
	//loop used to animate a vampire
	for (int i = 0 ; i < 180 ; i++)
	{
	    synchronized (c)
	    {

		c.setColor (pathGrey);
		c.fillRect (312, 497 - i, 43, 122);
		c.setColor (Color.darkGray);
		c.fillRect (312, 460 - i, 43, 40);
		c.setColor (doorRed);
		c.fillRect (312, 329 - i, 43, 168);
		c.setColor (doorRed);
		c.fillRect (312, 140, 43, 139);
		c.setColor (Color.darkGray);
		c.fillRect (312, 280, 43, 41);
		c.setColor (pathGrey);
		c.fillRect (312, 321, 43, 176);
		c.setColor (collarGrey);
		c.fillRect (326, 360 - i, 16, 10);
		c.setColor (Color.white);
		c.fillOval (344, 425 - i, 10, 10);
		c.fillOval (314, 425 - i, 10, 10);
		c.setColor (sleevesGrey);
		c.fillRoundRect (316, 370 - i, 36, 60, 10, 10);
		c.setColor (Color.black);
		c.fillRoundRect (319, 370 - i, 30, 100, 10, 10);
		c.fillArc (314, 386 - i, 40, 221, 0, 180);
		c.fillOval (316, 330 - i, 36, 36); //132

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
	
	//Text
	c.setFont (new Font ("Cambria", Font.PLAIN, 11));
	c.drawString ("Knock", 370, 229);
	
	//used to delay the animation
	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}
	
	//Text
	c.drawString ("Knock", 370, 245);

	//used to delay the animation
	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}
	
	//Erases the text box.
	for (int i = 0 ; i < 32 ; i++)
	{
	    c.setColor (buildingBrown);
	    c.drawLine (369 + i, 220, 369 + i, 251);
	}

	//loop used to animate a vampire
	for (int i = 180 ; i > 0 ; i--)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.fillRect (312, 497 - i, 43, 122);
		c.setColor (Color.darkGray);
		c.fillRect (312, 460 - i, 43, 40);
		c.setColor (doorRed);
		c.fillRect (312, 329 - i, 43, 168);
		c.setColor (doorRed);
		c.fillRect (312, 140, 43, 139);
		c.setColor (Color.darkGray);
		c.fillRect (312, 280, 43, 41);
		c.setColor (pathGrey);
		c.fillRect (312, 321, 43, 176);
		c.setColor (collarGrey);
		c.fillRect (326, 360 - i, 16, 10);
		c.setColor (doorknobYellow);
		c.fillOval (340, 210, 8, 8);
		c.setColor (Color.white);
		c.fillOval (344, 425 - i, 10, 10);
		c.fillOval (314, 425 - i, 10, 10);
		c.setColor (sleevesGrey);
		c.fillRoundRect (316, 370 - i, 36, 60, 10, 10);
		c.setColor (Color.black);
		c.fillRoundRect (319, 370 - i, 30, 100, 10, 10);
		c.fillArc (314, 386 - i, 40, 221, 0, 180);
		c.fillOval (316, 330 - i, 36, 36);
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
	
	//loop used to animate a vampire
	for (int i = 373 ; i > 310 ; i--)
	{
	    synchronized (c)
	    {
		c.setColor (pathGrey);
		c.fillRect (-94 + i, 329, 77, 168);
		c.setColor (collarGrey);
		c.fillRect (-46 + i, 360, 16, 10);
		c.setColor (Color.white);
		c.fillOval (-53 + i, 335, 30, 30);
		c.setColor (Color.black);
		c.fillRoundRect (-53 + i, 370, 30, 100, 10, 10);
		c.fillArc (-58 + i, 385, 40, 220, 0, 180);
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


    public Vampire2 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	vampire2 ();
    }
}


