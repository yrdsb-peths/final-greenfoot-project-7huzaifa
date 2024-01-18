import greenfoot.*;   //(World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The only survivor in this zombie-infested world.
 * 
 * @Qureshi
 * @December 2023
 */
public class Survivor extends Actor
{
    GreenfootSound walkingSound = new GreenfootSound("sounds/walking.mp3");
    GreenfootSound gunshotSound = new GreenfootSound("sounds/gunshot.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[7];
    GreenfootImage[] idleLeft = new GreenfootImage[7];
    GreenfootImage[] shootRight = new GreenfootImage[6];
    GreenfootImage[] shootLeft = new GreenfootImage[6];
    SimpleTimer animationTimer = new SimpleTimer(); 
    private int imageIndex;  
    private static int score;
    String facing = "right";
    public Survivor() {
        imageIndex = 0;
        for(int i = 0; i < idleRight.length; i++) {
            idleRight[i] = new GreenfootImage("images/character/walk" + i + ".png");
            idleRight[i].scale(100, 100);
            idleRight[i].mirrorHorizontally();
        }
        for(int i = 0; i < shootRight.length; i++){
            shootRight[i] = new GreenfootImage("images/character/shoot" + i + ".png");
            shootRight[i].scale(100, 100);
            shootRight[i].mirrorHorizontally();
        }    
        animationTimer.mark();
        setImage(idleRight[0]);
    }
    
    public void animateSurvivor(){
        if(animationTimer.millisElapsed() > 100){
            if(facing.equals("right")){
                setImage(idleRight[imageIndex]);
                imageIndex = (imageIndex + 1) % idleRight.length;
            }
            animationTimer.mark();
        }
    }    

    public void act() 
    {
        if(Greenfoot.isKeyDown("w")){
            moveVertically(-6);
        }
        else if(Greenfoot.isKeyDown("s")){
            moveVertically(6);
        }        
        if(Greenfoot.mouseClicked(null)){
            shoot();
        }        
        animateSurvivor();
        walkingSound.play();
    }
    private void moveVertically(int distance) {
        // Allows the actor to move vertically
        int yCoordinate = getY() + distance;
        setLocation(getX(), yCoordinate);
    }    
    public static int getScore(){
        return score;
    }
    private void shoot() {
        // Shoots projectiles to eliminate zombies
        Bullet bullet = new Bullet();
        int x = 20;
        int y = getY();
        getWorld().addObject(bullet, x, y);
        gunshotSound.play();
    }    
}
