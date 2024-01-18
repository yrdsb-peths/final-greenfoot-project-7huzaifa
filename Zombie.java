import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 /**
 * The enemies to our survivor, zombies eat brains.
 * 
 * @Qureshi 
 * @December 2023
 */
 public class Zombie extends Actor
 {
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound zombieSound = new GreenfootSound("sounds/zombieGroan.mp3");
    GreenfootImage[] zombieLeft = new GreenfootImage[24];
    SimpleTimer animationTimer = new SimpleTimer(); 
    private int imageIndex;    
    private static int speed;
    String facing  = "left";
    public Zombie() {
        imageIndex = 0;
        speed = -1;
        for(int i = 0; i < zombieLeft.length; i++) {
            zombieLeft[i] = new GreenfootImage("images/zombie/zombie_walk" + i + ".png");
            zombieLeft[i].scale(100, 100);
            zombieLeft[i].mirrorHorizontally();
        }
        animationTimer.mark();
        setImage(zombieLeft[0]);
    }
    
    public void act() 
    {
        MyWorld world = (MyWorld) getWorld();
        animateZombie();
        if(facing.equals("left")){
            move(speed);
        }
        speed = -1*world.getLevel();
        if(getX() <= 0) {
            world.onGameOver();
        }
        zombieSound.play();
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
