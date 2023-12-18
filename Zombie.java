import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 /**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public class Zombie extends Actor
 {
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //private int speed = 1;
    GreenfootImage[] zombieLeft = new GreenfootImage[24];
    SimpleTimer animationTimer = new SimpleTimer(); 
    private int imageIndex;    
    public void act() 
    {
        // setLocation(getX() + speed, getY());
        setLocation(getX(), getY());
        MyWorld world = (MyWorld) getWorld();
        animateZombie();
    }    
        
    public Zombie() {
        imageIndex = 0;
        for(int i = 0; i < zombieLeft.length; i++) {
            zombieLeft[i] = new GreenfootImage("images/zombie/zombie_walk" + i + ".png");
            zombieLeft[i].scale(100, 100);
        }
        animationTimer.mark();
        setImage(zombieLeft[0]);
    }
    
    public void animateZombie()
    {
        if(animationTimer.millisElapsed() > 50){
            setImage(zombieLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % zombieLeft.length;
            
            animationTimer.mark();
        }
    }      
}
