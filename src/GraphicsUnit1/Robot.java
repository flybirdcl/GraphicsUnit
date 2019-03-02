package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);


		//add more code here
      window.setColor(Color.GREEN);
      window.fillOval(325+25, 125, 100/6, 100/6);
      window.fillOval(325+115, 125, 100/6, 100/6);
      window.setColor(Color.BLACK);
      window.fillOval(400-10, 150, 20, 10);
      window.setColor(Color.RED);
      window.drawArc(210+100+30+5, 150+50-25-10-20, 110, 40, 90+90, 180);
      
   }

   public void upperBody( Graphics window )
   {

		//add more code here
	   window.setColor(Color.BLUE);
	   window.fillRect(400-50-25, 250-40+20, 150, 150-20);
	   window.setColor(Color.BLACK);
	   window.drawLine(400-50-25, 250-40+20, 325-80, 230-70);
	   window.drawLine(400-50-25+150, 250-40+20, 325-80+300, 230-70);
   }

   public void lowerBody( Graphics window )
   {
	   window.setColor(Color.DARK_GRAY);
	   window.fillRect(400-50-25, 250-40+20+150+20-25, 150, 120);
	   window.setColor(Color.BLACK);
	   window.drawLine(400-50-25, 250-40+20+150+20-25+120, 325-80, 250-40+20+150+20-25+120+30);
	   window.drawLine(400-50-25+150, 250-40+20+150+20-25+120, 325-80+300, 250-40+20+150+20-25+120+30);

   }
}