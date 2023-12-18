import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootImage bg;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Survivor survivor = new Survivor();
        addObject(survivor, 300, 300);
        createZombie();
        
        bg = new GreenfootImage("images/Backyardpool.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
        public void createZombie()
    {
        Zombie zombie = new Zombie();
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        addObject(zombie, x, y);
    }
}
