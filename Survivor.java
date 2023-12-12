import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephants are great.
 * 
 * @author Qureshi
 * @version November 2023
 */
public class Survivor extends Actor
{
   // GreenfootImage[] idleRight = new GreenfootImage[8];
   // GreenfootImage[] idleLeft = new GreenfootImage[8];    
    SimpleTimer animationTimer = new SimpleTimer(); 
   // private int imageIndex;    
   String facing = "right";
    //public Survivor() {
    //    imageIndex = 0;
    //    for(int i = 0; i < idleRight.length; i++) {
    //        idleRight[i] = new GreenfootImage();
    //        idleRight[i].scale(100, 100);
   //     }
   //     for(int i = 0; i < idleLeft.length; i++) {
   //         idleLeft[i] = new GreenfootImage();
   //         idleLeft[i].scale(100, 100);
   //         idleLeft[i].mirrorHorizontally();
   //     }
   //    animationTimer.mark();
   //     setImage(idleRight[0]);
   // }
    
   // public void animateSurvivor(){
   //     if(animationTimer.millisElapsed() > 100){
   //         if(facing.equals("right")){
   //             setImage(idleRight[imageIndex]);
   //             imageIndex = (imageIndex + 1) % idleRight.length;
   //         }
   //         else{
   //             setImage(idleLeft[imageIndex]);
   //             imageIndex = (imageIndex + 1) % idleLeft.length;
   //         }
   //         animationTimer.mark();
   //     }
   // }
    
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
        //animateSurvivor();
    }
}
