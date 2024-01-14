import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is just an example. You can delete it or change the code.
 * It's not necessary for the scrolling system.
 */
public class Runner extends ScrollingActor
{
    
    public Runner() {
        
    }
    
    /**
     * Here you can tell your actor what he has to do.
     */
    public void act() {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 3);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 3, getY());
        }
    }
}