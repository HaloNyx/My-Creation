//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//Background1 - My creation assignment. The Background1 class is the first background, which features a starlit graveyard and a town in the distance.

import java.awt.*;
import hsa.Console;
import java.lang.*; // to access Thread class

public class Background1
{
    private Console c;
    //class to make background 1
    public void draw ()
    {
	//local colour variable for the sky
	Color skyBlue = new Color (0, 0, 51);
	//local colour variable for the grass
	Color grassGreen = new Color (0, 51, 0);
	//local colour variable for the moon
	Color moonGrey = new Color (192, 192, 192);
	//local colour variable for the stars
	Color starYellow = new Color (255, 255, 102);
	//local colour variable for some building walls
	Color buildingBrown = new Color (205, 184, 135);
	//local colour variable for the building roofs
	Color roofBrown = new Color (102, 51, 0);
	//local colour variable for the building windows
	Color windowLight = new Color (255, 255, 0);
	//local colour variable for the pathway
	Color pathGrey = new Color (50, 50, 50);
	//local colour variable for the gravestones
	Color gravestoneGrey = new Color (215, 215, 215);

	//loop used to create the sky
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (skyBlue);
	    c.drawRect (0, 0, x, 500);
	}

	//loop used to create moon
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (moonGrey);
	    c.drawOval (200 + x, 40 + x, 75 - 2 * x, 75 - 2 * x);
	}


	//loop used to create the stars
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.setColor (starYellow);
	    c.drawStar (40 + x, 80 + x, 20 - 2 * x, 20 - 2 * x);
	    c.drawStar (120 + x, 160 + x, 20 - 2 * x, 20 - 2 * x);
	    c.drawStar (320 + x, 40 + x, 20 - 2 * x, 20 - 2 * x);
	    c.drawStar (480 + x, 10 + x, 20 - 2 * x, 20 - 2 * x);
	    c.drawStar (560 + x, 60 + x, 20 - 2 * x, 20 - 2 * x);
	    c.drawStar (440 + x, 100 + x, 20 - 2 * x, 20 - 2 * x);
	    c.drawStar (140 + x, 20 + x, 20 - 2 * x, 20 - 2 * x);
	    c.drawStar (20 + x, 180 + x, 20 - 2 * x, 20 - 2 * x);
	    c.drawStar (580 + x, 180 + x, 20 - 2 * x, 20 - 2 * x);
	    c.drawStar (280 + x, 120 + x, 20 - 2 * x, 20 - 2 * x);
	}


	//loop used to create the building roofs
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.setColor (roofBrown);
	    c.drawLine (265 - 15 + x, 162, 265, 152);
	    c.drawLine (200 - 15 + x, 185, 200, 175);
	    c.drawLine (240 - 15 + x, 165, 240, 155);
	    c.drawLine (250 - 15 + x, 175, 250, 165);
	    c.drawLine (275 - 15 + x, 180, 275, 170);
	    c.drawLine (290 - 15 + x, 170, 290, 160);
	    c.drawLine (367 - 15 + x, 190, 367, 180);
	    c.drawLine (390 - 15 + x, 167, 390, 157);
	    c.drawLine (215 - 15 + x, 188, 215, 178);
	    c.drawLine (350 - 15 + x, 180, 350, 170);
	    c.drawLine (415 - 15 + x, 192, 415, 182);
	}

	//loop used to create the village buildings
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (Color.gray);
	    c.drawLine (255 + x, 162, 255 + x, 205);
	    c.setColor (buildingBrown);
	    c.drawLine (190 + x, 185, 190 + x, 205);
	    c.drawLine (230 + x, 165, 230 + x, 205);
	    c.drawLine (235 + x, 175, 235 + x, 205);
	    c.drawLine (265 + x, 180, 265 + x, 205);
	    c.drawLine (280 + x, 170, 280 + x, 205);
	    c.drawLine (357 + x, 190, 357 + x, 205);
	    c.drawLine (380 + x, 167, 380 + x, 205);
	    c.setColor (Color.gray);
	    c.drawLine (205 + x, 188, 205 + x, 205);
	    c.drawLine (340 + x, 180, 340 + x, 205);
	    c.drawLine (405 + x, 192, 405 + x, 205);
	}

	//loop used to create the building windows
	for (int x = 0 ; x < 8 ; x++)
	{
	    c.setColor (windowLight);
	    c.drawLine (261 + x, 187, 261 + x, 195);
	    c.drawLine (261 + x, 167, 261 + x, 175);
	    c.drawLine (196 + x, 190, 196 + x, 198);
	    c.drawLine (236 + x, 175, 236 + x, 195);
	    c.drawLine (286 + x, 177, 286 + x, 190);
	    c.drawLine (364 + x, 192, 364 + x, 197);
	    c.drawLine (386 + x, 187, 386 + x, 195);
	    c.drawLine (386 + x, 172, 386 + x, 180);
	}


	//loop used to create the hill
	for (int x = 0 ; x < 1080 ; x++)
	{
	    c.setColor (grassGreen);
	    c.drawOval (-215 + x, 200 + x, 1080 - 2 * x, 400 - 2 * x);
	}

	//loop used to create the path
	for (int x = 0 ; x < 160 ; x++)
	{
	    c.setColor (pathGrey);
	    c.drawLine (320, 185, 320 - 80 + x, 300);
	}


	//loop used to erase part of the path
	for (int x = 0 ; x < 16 ; x++)
	{
	    c.setColor (skyBlue);
	    c.drawLine (310, 185 + x, 330, 185 + x);
	}


	//loop used to create the fence and the gate
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.setColor (Color.black);
	    c.drawLine (x, 200, x, 300);
	    c.drawLine (40 + x, 220, 40 + x, 300);
	    c.drawLine (80 + x, 220, 80 + x, 300);
	    c.drawLine (120 + x, 200, 120 + x, 300);
	    c.drawLine (160 + x, 220, 160 + x, 300);
	    c.drawLine (200 + x, 220, 200 + x, 300);
	    c.drawLine (240 + x, 180, 240 + x, 300);
	    c.drawLine (390 + x, 180, 390 + x, 300);
	    c.drawLine (430 + x, 220, 430 + x, 300);
	    c.drawLine (470 + x, 220, 470 + x, 300);
	    c.drawLine (510 + x, 200, 510 + x, 300);
	    c.drawLine (550 + x, 220, 550 + x, 300);
	    c.drawLine (590 + x, 220, 590 + x, 300);
	    c.drawLine (630 + x, 200, 630 + x, 300);
	    c.drawLine (0, 220 + x, 240, 220 + x);
	    c.drawLine (390, 220 + x, 640, 220 + x);
	    c.drawArc (240 + x, 105, 150, 150, 0, 180);
	}

	//loop used to create the rectangular part of the gravestones
	for (int x = 0 ; x < 80 ; x++)
	{
	    c.setColor (gravestoneGrey);
	    c.drawLine (40 + x, 280, 40 + x, 320);
	    c.drawLine (160 + x, 280, 160 + x, 320);
	    c.drawLine (400 + x, 280, 400 + x, 320);
	    c.drawLine (520 + x, 280, 520 + x, 320);
	}

	//loop used to create the rounded part of the gravestones
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (gravestoneGrey);
	    c.drawArc (40, 240 + x, 79, 80, 0, 180);
	    c.drawArc (160, 240 + x, 79, 80, 0, 180);
	    c.drawArc (400, 240 + x, 79, 80, 0, 180);
	    c.drawArc (520, 240 + x, 79, 80, 0, 180);

	}

	//Text
	c.setColor (Color.black);
	c.setFont (new Font ("Cambria", Font.BOLD, 18));
	c.drawString ("Tricker", 48, 280);
	c.drawString ("Treat", 56, 300);
	c.drawString ("By", 189, 290);
	c.drawString ("Juleen", 414, 290);
	c.drawString ("Chen", 540, 290);

    }




    public Background1 (Console con)
    {
	c = con;
	draw ();
    }
}
