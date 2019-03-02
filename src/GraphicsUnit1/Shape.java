package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape {
	// instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

	public Shape(int x, int y, int wid, int ht, Color col) {
		xPos = x;
		// finish this constructor
		yPos = y;
		width = wid;
		height = ht;
		color = col;
	}

	public void draw(Graphics window) {
		// draw whatever you want
		// ^
		// [ :: ]
		// (draw trees)
		
		//trunk
		window.setColor(Color.MAGENTA);
		window.fillRect(getxPos()+getWidth()/2-5, getyPos()+20, 10, getHeight());
		//tree top
		window.setColor(getColor());
		window.fillOval(getxPos(), getyPos(), getWidth(), getHeight()-20);
		

	}

	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}

	// BONUS
	// add in set and get methods for all instance variables
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}