import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Titlescreen for the hungry animal game.
 * 
 * @Qureshi (your name) 
 * @December 2023 (a version number or a date)
 */
public class Title extends World
{

    private GreenfootImage titleScreen;
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
        
        titleScreen = new GreenfootImage("images/gameTitleScreen.png");
        titleScreen.scale(getWidth(), getHeight());
        setBackground(titleScreen);        
    }


    public void act(){
        if(Greenfoot.mouseClicked(null)){
            Controls controlsWorld = new Controls();
            Greenfoot.setWorld(controlsWorld);
        }
    }    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Survivor survivor = new Survivor();
        addObject(survivor,300,150);
        
    }
}
