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

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

      //add more code here
      //draw 2 eyes
      window.setColor(Color.GREEN);
      window.fillOval(210+80, 210, 400/6, 200/5);
      window.fillOval(210+400-150, 210, 400/6, 200/5);
      //draw black nose
      window.setColor(Color.BLACK);
      window.fillOval(210+(400)/2-20, 100+400/2, 40, 40);
      //draw smile
      window.setColor(Color.RED);
      window.drawArc(210+100, 350, 200, 50, 90+90, 180);
   }
}