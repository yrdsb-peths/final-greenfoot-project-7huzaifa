import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Titlescreen for the hungry animal game.
 * 
 * @Qureshi (your name) 
 * @December 2023 (a version number or a date)
 */
public class Controls extends World
{

    private GreenfootImage controlsScreen;
    public Controls()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        controlsScreen = new GreenfootImage("images/controlsScreen.png");
        controlsScreen.scale(getWidth(), getHeight());
        setBackground(controlsScreen);        
    }

    public void act(){
        if(Greenfoot.mouseClicked(null)){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
