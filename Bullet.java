import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullets to kill zombies with.
 * 
 * @Qureshi
 * @January 2024
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
             world.increaseScore();
            world.removeObject(this);
            return; 
        }   
        if(getX() >= getWorld().getWidth()-1){
            getWorld().removeObject(this);
            return;
        }    
    }    
}
