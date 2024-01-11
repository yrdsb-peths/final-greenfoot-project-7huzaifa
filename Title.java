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
        
        titleScreen = new GreenfootImage("images/newTitleScreen.png");
        titleScreen.scale(getWidth(), getHeight());
        setBackground(titleScreen);        
    }

    public void act(){
        if(Greenfoot.mouseClicked(null)){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
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
