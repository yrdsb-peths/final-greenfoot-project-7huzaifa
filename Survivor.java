import greenfoot.*;   //(World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephants are great.
 * 
 * @author Qureshi
 * @version November 2023
 */
public class Survivor extends Actor
{
    GreenfootSound walkingSound = new GreenfootSound("sounds/walking.mp3");
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
        for(int i = 0; i < idleLeft.length; i++) {
            idleLeft[i] = new GreenfootImage("images/character/walk" + i + ".png");
            idleLeft[i].scale(100, 100);
        }
        for(int i = 0; i < shootRight.length; i++){
            shootRight[i] = new GreenfootImage("images/character/shoot" + i + ".png");
            shootRight[i].scale(100, 100);
            shootRight[i].mirrorHorizontally();
        }    
        for(int i = 0; i < shootLeft.length; i++){
            shootLeft[i] = new GreenfootImage("images/character/shoot" + i + ".png");
            shootLeft[i].scale(100, 100);
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
            else{
                setImage(idleLeft[imageIndex]);
                imageIndex = (imageIndex + 1) % idleLeft.length;
            }
            if(Greenfoot.isKeyDown("space") && facing.equals("right")){
                setImage(shootRight[imageIndex]);
                imageIndex = (imageIndex + 1) % idleRight.length;
            }
            animationTimer.mark();
        }
    }    

    public void act() 
    {
        if(Greenfoot.isKeyDown("a")){
            move(-6);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("d")){
            move(6);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("left")){
            move(-6);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right")){
            move(6);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("w")){
            moveVertically(-6);
        }
        else if(Greenfoot.isKeyDown("s")){
            moveVertically(6);
        }        
        animateSurvivor();
        walkingSound.play();
    }
    private void moveVertically(int distance) {
        int yCoordinate = getY() + distance;
        setLocation(getX(), yCoordinate);
    }    
    public static int getScore(){
        return score;
    }
}
