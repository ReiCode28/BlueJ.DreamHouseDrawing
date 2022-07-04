
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(30);
        wall.changeSize(100,100);
        wall.makeVisible();
        wall.changeColor("magenta");
        
        wall = new Square();
        wall.moveVertical(100);
        wall.changeSize(100,100);
        wall.makeVisible();
        wall.changeColor("magenta");
        
        wall = new Square();
        wall.moveVertical(200);
        wall.moveHorizontal(-100);
        wall.changeSize(500,500);
        wall.makeVisible();
        wall.changeColor("gray");
        
        wall = new Square();
        wall.moveVertical(160);
        wall.moveHorizontal(36);
        wall.changeSize(40,30);
        wall.makeVisible();
        wall.changeColor("gray");

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(40);
        window.changeSize(20,20);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(65);
        window.moveVertical(40);
        window.changeSize(20,20);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(85);
        window.changeSize(20,20);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(65);
        window.moveVertical(85);
        window.changeSize(20,20);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(130);
        window.changeSize(20,20);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(65);
        window.moveVertical(130);
        window.changeSize(20,20);
        window.makeVisible();
        
        //person body
        roof = new Triangle();
        roof.changeSize(15, 12);
        roof.moveHorizontal(-30);
        roof.moveVertical(225);
        roof.makeVisible();
        
        
        //person right arm
        wall = new Square();
        wall.moveVertical(196);
        wall.moveHorizontal(-37);
        wall.changeSize(2,5);
        wall.makeVisible();
        wall.changeColor("green");
        
        
        //person left arm
        wall = new Square();
        wall.moveVertical(196);
        wall.moveHorizontal(-47);
        wall.changeSize(2,5);
        wall.makeVisible();
        wall.changeColor("green");
        
        
        //person left leg
        wall = new Square();
        wall.moveVertical(205);
        wall.moveHorizontal(-43);
        wall.changeSize(5,2);
        wall.makeVisible();
        wall.changeColor("green");
        
        
        //person right leg
        wall = new Square();
        wall.moveVertical(205);
        wall.moveHorizontal(-38);
        wall.changeSize(5,2);
        wall.makeVisible();
        wall.changeColor("green");
        
        
        //person head
        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(-3);
        sun.moveVertical(178);
        sun.changeSize(7);
        sun.makeVisible();
        
        //dog head
        roof = new Triangle();
        roof.changeSize(7, 7);
        roof.moveHorizontal(-5);
        roof.moveVertical(235);
        roof.makeVisible();
        
        //dog body
        wall = new Square();
        wall.moveVertical(207);
        wall.moveHorizontal(-25);
        wall.changeSize(5,9);
        wall.makeVisible();
        wall.changeColor("green");
        
        //dog tail
        wall = new Square();
        wall.moveVertical(207);
        wall.moveHorizontal(-30);
        wall.changeSize(1,5);
        wall.makeVisible();
        wall.changeColor("green");
        
        //dog leg 1
        wall = new Square();
        wall.moveVertical(212);
        wall.moveHorizontal(-25);
        wall.changeSize(3,1);
        wall.makeVisible();
        wall.changeColor("green");
        
        //dog leg 2
        wall = new Square();
        wall.moveVertical(212);
        wall.moveHorizontal(-23);
        wall.changeSize(3,1);
        wall.makeVisible();
        wall.changeColor("green");
        
        //dog leg 3
        wall = new Square();
        wall.moveVertical(212);
        wall.moveHorizontal(-17);
        wall.changeSize(3,1);
        wall.makeVisible();
        wall.changeColor("green");
        
        //dog leg 4
        wall = new Square();
        wall.moveVertical(212);
        wall.moveHorizontal(-19);
        wall.changeSize(3,1);
        wall.makeVisible();
        wall.changeColor("green");

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-30);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
