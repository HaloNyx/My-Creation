//Juleen Chen
//Ms. Krasteva, ICS 3UF
//24/10/2017
//MyCreation - My creation assignment. The MyCreation class runs all the other classes.


// The "MyCreation" class.
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c; // The output console

    //adds the first background to MyCreation
    public void background1 ()
    {
	Background1 b = new Background1 (c);
    }


    //adds the second background to MyCreation
    public void background2 ()
    {
	//not a thread because it's not animated!!!
	Background2 b = new Background2 (c);
    }


    //adds the Vampire1 thread to MyCreation
    public void vampire1 ()
    {
	//creates the thread
	Vampire1 i = new Vampire1 (c);
	//starts the thread
	i.run ();
    }

    
    //adds the Vampire2 thread to MyCreation
    public void vampire2 ()
    {
	//creates the thread
	Vampire2 i = new Vampire2 (c);
	//starts the thread
	i.start ();
    }

    
    //adds the Witch1 thread to MyCreation
    public void witch1 ()
    {
	//creates the thread
	Witch1 i = new Witch1 (c);
	//starts the thread
	i.run ();
    }


    //adds the Witch2 thread to MyCreation
    public void witch2 ()
    {
	//creates the thread
	Witch2 i = new Witch2 (c);
	//starts the thread
	i.run ();
    }


    //adds the Ghost1 thread to MyCreation
    public void ghost1 ()
    {
	//creates the thread
	Ghost1 i = new Ghost1 (c);
	//starts the thread
	i.run ();
    }


    //adds the Ghost2 thread to MyCreation
    public void ghost2 ()
    {
	//creates the thread
	Ghost2 i = new Ghost2 (c);
	//starts the thread
	i.run ();
    }


    //adds the Skeleton1 thread to MyCreation
    public void skeleton1 ()
    {
	//creates the thread
	Skeleton1 i = new Skeleton1 (c);
	//starts the thread
	i.run ();
    }


    //adds the Skeleton2 thread to MyCreation
    public void skeleton2 ()
    {
	//creates the thread
	Skeleton2 i = new Skeleton2 (c);
	//starts the thread
	i.run ();
    }


    //adds the Princesses1 thread to MyCreation
    public void princesses1 ()
    {
	//creates the Princesses1 thread
	Color second = new Color (175, 255, 102);
	Color third = new Color (153, 255, 255);
	Princesses1 a = new Princesses1 (c);
	//starts the thread
	a.run ();
	Princesses1 b = new Princesses1 (c, second);
	//starts the thread
	b.run ();
	Princesses1 d = new Princesses1 (c, third, 10);
	//starts the thread
	d.run ();
    }


    //adds the Princesses1 thread to MyCreation
    public void princesses2 ()
    {
	//creates the Princesses1 thread
	Color second = new Color (175, 255, 102);
	Color third = new Color (153, 255, 255);
	Princesses2 a = new Princesses2 (c);
	//starts the thread
	a.start ();
	Princesses2 b = new Princesses2 (c, second);
	//starts the thread
	b.start ();
	Princesses2 d = new Princesses2 (c, third, 10);
	//starts the thread
	d.start ();
    }


    //adds the Person thread to MyCreation
    public void person ()
    {
	//creates the thread
	Person i = new Person (c);
	//starts the thread
	i.run ();
    }


    //adds the Candy thread to MyCreation
    public void candy ()
    {
	//creates the thread
	Candy i = new Candy (c);
	//starts the thread
	i.start ();
    }


    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("Halloween");
    }


    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	z.background1 ();
	z.vampire1 ();
	z.witch1 ();
	z.ghost1 ();
	z.skeleton1 ();
	z.background2 ();
	z.princesses1 ();
	z.vampire2 ();
	z.witch2 ();
	z.ghost2 ();
	z.skeleton2 ();
	z.princesses2 ();
	z.candy ();
	z.person ();
    }
} // MyCreation class
