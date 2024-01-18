import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Control screen explaining the keybinds for the zombie survival game.
 * 
 * @Qureshi  
 * @December 2023
 */
public class Controls extends World
{

    private GreenfootImage controlsScreen;
    public Controls()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        controlsScreen = new GreenfootImage("images/newControlScreen.png");
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
