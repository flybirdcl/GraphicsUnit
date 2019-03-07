package GraphicsUnit2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.awt.Color;
import java.awt.Graphics;

public class Shape {

    //instance variables
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;
    private int xSpeed;
    private int ySpeed;

    /*
     *The constructor is used to initialize all instance variables.
     *The constructor makes the object.
     */
    public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
        xPos = x;
        //finish this constructor
        yPos = y;
        width = wid;
        height = ht;
        color = col;
        xSpeed = xSpd;
        ySpeed = ySpd;
    }

    /*
     *The draw method draws the shape on the screen.
     */
    public void draw(Graphics window) {
        window.setColor(getColor());
        window.fillRect(getxPos(), getyPos(), getWidth(), getHeight());

        //draw whatever you want
        //    ^
        //  [ :: ]
        //    ()
        //trunk
        window.setColor(Color.MAGENTA);
        window.fillRect(getxPos() + getWidth() / 2 - 5, getyPos() + 20, 10, getHeight());
        //tree top
        window.setColor(getColor());
        window.fillOval(getxPos(), getyPos(), getWidth(), getHeight() - 20);

    }

    /*
     *This draw method will be used to erase the shape.
     */
    public void draw(Graphics window, Color col) {
        window.setColor(col);
        window.fillRect(getxPos(), getyPos(), getWidth(), getHeight());
    }

    public void moveAndDraw(Graphics window) {
        //not needed yet
        setxPos(getxPos()+getxSpeed());
        setyPos(getyPos()+getySpeed());
        draw(window);
    }

    public String toString() {
        return getxPos() + " " + getyPos() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getxSpeed() + " " + getySpeed();
    }

    /**
     * @return the xPos
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * @param xPos the xPos to set
     */
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * @return the yPos
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * @param yPos the yPos to set
     */
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the xSpeed
     */
    public int getxSpeed() {
        return xSpeed;
    }

    /**
     * @param xSpeed the xSpeed to set
     */
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * @return the ySpeed
     */
    public int getySpeed() {
        return ySpeed;
    }

    /**
     * @param ySpeed the ySpeed to set
     */
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}
