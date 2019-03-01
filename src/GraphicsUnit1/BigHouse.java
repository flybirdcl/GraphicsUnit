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

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
	  bigHouse(window);
   } 

   public void bigHouse( Graphics window )
   {
	  for (int i = 1; i < 1000; i+=130) {
		  window.setColor(Color.MAGENTA);
	      window.fillRect( 200-70 + i-300, 600-150, 20, 150 );
	      
	      window.setColor(Color.GREEN);
	      window.fillOval(200-70-40 + i-300, 600-170, 100, 75);
	}
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );
      
      window.setColor(Color.GREEN);
      
      window.fillRect( 200-70, 100, 540, 100 );
      
      window.setColor(Color.YELLOW);
      
      window.fillRect( 200+50, 100+80+100, 80, 80 );
      window.fillRect( 200+400-80-50, 100+80+100, 80, 80 );
      
      window.setColor(Color.WHITE);
      window.fillRect(200+200-50, 600-170, 100, 170);
      
      window.setColor(Color.MAGENTA);
      window.fillRect( 200-70 , 600-150, 20, 150 );
      
      window.setColor(Color.GREEN);
      window.fillOval(200-70-40, 600-170, 100, 75);
      
      
      window.setColor(Color.MAGENTA);
      window.fillRect( 200-70+550, 600-150, 20, 150 );
      
      window.setColor(Color.GREEN);
      window.fillOval(200-70-40 + 550, 600-170, 100, 75);
      
   }
}