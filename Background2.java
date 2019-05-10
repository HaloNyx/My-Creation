//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Background2 - My creation assignment. The Background2 class is the second background, which features a town scene with houses decorated for Halloween.

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Background2
{
    private Console c;
    //class to make background 2
    public void draw ()
    {
	//local colour variable for the sky
	Color skyBlue = new Color (0, 0, 51);
	//local colour variable for the pathway
	Color pathGrey = new Color (50, 50, 50);
	//local colour variable for some building walls
	Color buildingBrown = new Color (205, 184, 135);
	//local colour variable for the building roofs
	Color roofBrown = new Color (102, 51, 0);
	//local colour variable for the building windows
	Color windowLight = new Color (255, 255, 0);
	//local colour variable for the grass
	Color grassGreen = new Color (0, 51, 0);
	//local colour variable for the doors
	Color doorRed = new Color (100, 0, 0);
	//local colour variable for the doorknobs
	Color doorknobYellow = new Color (205, 205, 105);
	//local colour variable for the jack 'o' lantern
	Color pumpkinOrange = new Color (255, 128, 0);

	//loop used to create the sky
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (skyBlue);
	    c.drawRect (0, 0, x, 280);
	}


	//loop used to create the buildings
	for (int x = 20 ; x < 280 ; x++)
	{
	    c.setColor (Color.gray);
	    c.drawLine (0, x, 180, x);
	    c.drawLine (460, x, 640, x);
	    c.setColor (buildingBrown);
	    c.drawLine (220, x, 420, x);

	}

	//loop used to create the building roofs
	for (int x = 0 ; x < 230 ; x++)
	{
	    c.setColor (roofBrown);
	    c.drawLine (320, -80, 320 - 114 + x, 20);
	    c.drawLine (80, -80, 80 - 114 + x, 20);
	    c.drawLine (560, -80, 560 - 114 + x, 20);

	}


	//loop used to create the grass
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (grassGreen);
	    c.drawLine (0, 280 + x, 640, 280 + x);
	}

	//loop used to create the street
	for (int x = 0 ; x < 240 ; x++)
	{
	    c.setColor (pathGrey);
	    c.drawLine (0, 320 + x, 640, 320 + x);
	}

	//loop used to create the paths to the houses and the doors
	for (int x = 0 ; x < 160 ; x++)
	{
	    c.setColor (Color.darkGray);
	    c.drawLine (80, 245, 80 - 80 + x, 320);
	    c.drawLine (320, 245, 320 - 80 + x, 320);
	    c.drawLine (560, 245, 560 - 80 + x, 320);

	}

	//loop used to create the doors
	for (int x = 0 ; x < 140 ; x++)
	{
	    c.setColor (doorRed);
	    c.drawLine (40, 140 + x, 120, 140 + x);
	    c.drawLine (280, 140 + x, 360, 140 + x);
	    c.drawLine (520, 140 + x, 600, 140 + x);

	}

	//loop used to create the doorknobs
	for (int x = 0 ; x < 4 ; x++)
	{
	    c.setColor (doorknobYellow);
	    c.drawOval (100 + 1 * x, 210, 4, 8);
	    c.drawOval (340 + 1 * x, 210, 4, 8);
	    c.drawOval (580 + 1 * x, 210, 4, 8);

	}

	//loop used to create the windows
	for (int x = 0 ; x < 80 ; x++)
	{
	    c.setColor (windowLight);
	    c.drawLine (40, 40 + x, 120, 40 + x);
	    c.drawLine (280, 40 + x, 360, 40 + x);
	    c.drawLine (520, 40 + x, 600, 40 + x);

	}

	//loop used to create the window curtains
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (Color.orange);
	    c.drawLine (40, 90, 80 - 40 + x, 40);
	    c.drawLine (120, 90, 120 - 39 + x, 40);
	    c.setColor (Color.red);
	    c.drawLine (280, 90, 320 - 40 + x, 40);
	    c.drawLine (360, 90, 360 - 39 + x, 40);
	    c.setColor (Color.magenta);
	    c.drawLine (520, 90, 560 - 40 + x, 40);
	    c.drawLine (600, 90, 600 - 39 + x, 40);
	}

	//loop used to create the pumpkin part of the jack 'o' lantern
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (pumpkinOrange);
	    c.drawOval (8 + 1 * x, 265, 10, 20);
	    c.drawOval (123 + 1 * x, 265, 10, 20);
	    c.drawOval (248 + 1 * x, 265, 10, 20);
	    c.drawOval (363 + 1 * x, 265, 10, 20);
	    c.drawOval (488 + 1 * x, 265, 10, 20);
	    c.drawOval (603 + 1 * x, 265, 10, 20);
	}

	//loop used to create the jack 'o' lantern eyes and pumpkin stems
	for (int x = 0 ; x < 4 ; x++)
	{
	    c.setColor (Color.black);
	    c.drawOval (253 + 1 * x, 270, 3, 6);
	    c.drawOval (266 + 1 * x, 270, 3, 6);
	    c.drawLine (21 + x, 265, 21 + x, 259);
	    c.drawLine (135 + x, 265, 135 + x, 259);
	    c.drawLine (261 + x, 265, 261 + x, 259);
	    c.drawLine (376 + x, 265, 376 + x, 259);
	    c.drawLine (501 + x, 265, 501 + x, 259);
	    c.drawLine (616 + x, 265, 616 + x, 259);

	}

	//loop used to create the jack 'o' lantern mouth
	for (int x = 0 ; x < 11 ; x++)
	{
	    c.drawLine (263, 284, 263 - 5 + x, 280);
	}

    }




    public Background2 (Console con)
    {
	c = con;
	draw ();
    }
}
