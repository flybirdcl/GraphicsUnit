package GraphicsUnit2;

import java.awt.Color;
import java.awt.Graphics;

public class Shape {

	// instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

	public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpeed = xSpd;
		ySpeed = ySpd;
	}

	public void draw(Graphics window) {

		window.setColor(color);
		window.fillOval(xPos + 10, yPos + 10, width - 10, height - 10);

		window.setColor(Color.GREEN);
		window.fillRect(xPos + 10 + 10, yPos + 10 + 10, width - 30, height - 30);

		window.setColor(Color.WHITE);
		window.fillOval(xPos + 10 + 30, yPos + 10 + 30, width - 70, height - 70);
	}

	// clear shape
	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(xPos, yPos, width, height);
	}

	public void moveAndDraw(Graphics window) {
		xPos += xSpeed;
		yPos += ySpeed;
		draw(window);
	}

	// add in set and get methods for xPos, yPos, xSpeed, and ySpeed
	public int getX() {
		return xPos;
	}

	public void setX(int x) {
		xPos = x;
	}

	public int getY() {
		return yPos;
	}

	public void setY(int y) {
		yPos = y;
	}

	public int getXSpeed() {
		return xSpeed;
	}

	public void setXSpeed(int x) {
		xSpeed = x;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	public void setYSpeed(int y) {
		ySpeed = y;
	}

	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color + " " + xSpeed + " " + ySpeed;
	}
}