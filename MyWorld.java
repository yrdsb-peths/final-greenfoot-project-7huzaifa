import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Main world for the zombie survival game.
 * 
 * @Qureshi 
 * @December 2023
 */
public class MyWorld extends World
{
    private GreenfootImage bg;
    private static int score = 0;
    private Label scoreLabel;
    private int level;
    
    public MyWorld()
    {    
        super(600, 400, 1);
        level = 1;
        Survivor survivor = new Survivor();
        addObject(survivor, 20, 300);
        createZombie();
        
        bg = new GreenfootImage("images/Backyardpool.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        score = 0;
        
        scoreLabel = new Label(0,70);
        addObject(scoreLabel, 550, 50);
    }
    public void act(){
        List<Zombie> zombie = getObjects(Zombie.class);
        if(zombie.isEmpty()){
            createZombie();
        }    
    }    
        public void createZombie()
    {
        Zombie zombie = new Zombie();
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        addObject(zombie, x, y);
    }
    public void increaseScore() {
        score = score + 1;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0){
            level ++;
        }
    } 
    public int getLevel(){
        return level;
    }
    public static int getScore(){
        return score;
    }    
    public void onGameOver(){
        Label gameOverLabel = new Label("Game Over",100);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
        Greenfoot.setWorld(new GameOverWorld());
    }
}
