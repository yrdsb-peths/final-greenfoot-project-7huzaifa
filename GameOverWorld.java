import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game over world/screen for when the player loses the game.
 * 
 * @Qureshi 
 * @December 2023
 */
public class GameOverWorld extends World
{
    private GreenfootImage gameOver;
    private int score;
    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        score = MyWorld.getScore();
        gameOver = new GreenfootImage("images/GameOverScreen.png");
        gameOver.scale(getWidth(), getHeight());
        setBackground(gameOver);
        Label finalScoreLabel = new Label(score, 60);
        addObject(finalScoreLabel, getWidth()/2 + 80, 315);
        
    }
}
