import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the BulletS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage bullet = new GreenfootImage("images/bullet.png");
        MyWorld world = (MyWorld) getWorld();
        move(2);
        Zombie zombie = (Zombie) getOneIntersectingObject(Zombie.class);
        if(zombie != null){
            world.removeObject(zombie);
            world.removeObject(this);
            world.increaseScore();
            
        }   
        if(getX() >= getWorld().getWidth()-1){
            getWorld().removeObject(this);
            return;
        }    
    }    
}
