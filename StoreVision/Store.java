import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store extends World
{

    /**
     * Constructor for objects of class Store.
     * 
     */
    public Store()
    {    

        super(1200, 700, 1); 
        
        prepare();
    }
    
    private void prepare() {
        Store_Item pin = new Store_Item();
        addObject(pin, pin.getX(), pin.getY());
        
        GreenfootImage img = getBackground();
        getBackground().setColor(Color.GRAY);
        
        img.drawRect(200,0,700,100);
        img.fillRect(200,0,700,100);
        
        img.drawRect(1100,100,100,500);
        img.fillRect(1100,100,100,500);
        
        img.drawRect(200,600,800,100);
        img.fillRect(200,600,800,100);
        
        img.drawRect(600,200,300,100);
        img.fillRect(600,200,300,100);
        
        img.drawRect(600,400,300,100);
        img.fillRect(600,400,300,100);
        
        img.drawRect(200,200,300,100);
        img.fillRect(200,200,300,100);
        
        img.drawRect(200,400,300,100);
        img.fillRect(200,400,300,100);
        
        setBackground(img);
        
        GreenfootImage location = new GreenfootImage("location.jpg");
        getBackground().drawImage(location, 27, 575);
        
        GreenfootImage produce = new GreenfootImage("Produce", 80, Color.WHITE, Color.GRAY, Color.BLACK);
        getBackground().drawImage(produce, 450, 7);
        
        GreenfootImage snacks = new GreenfootImage("Snacks", 70, Color.WHITE, Color.GRAY, Color.BLACK);
        getBackground().drawImage(snacks, 250, 210);
        
        GreenfootImage frozen = new GreenfootImage("Frozen", 70, Color.WHITE, Color.GRAY, Color.BLACK);
        getBackground().drawImage(frozen, 250, 410);
        
        GreenfootImage liquor = new GreenfootImage("Liquor", 70, Color.WHITE, Color.GRAY, Color.BLACK);
        getBackground().drawImage(liquor, 660, 210);
        
        GreenfootImage canned = new GreenfootImage("Canned", 70, Color.WHITE, Color.GRAY, Color.BLACK);
        getBackground().drawImage(canned, 650, 410);
        
        GreenfootImage register = new GreenfootImage("Register", 80, Color.WHITE, Color.GRAY, Color.BLACK);
        getBackground().drawImage(register, 450, 610);
        
        GreenfootImage bakery = new GreenfootImage("bakery.JPG");
        getBackground().drawImage(bakery, 1120, 250);
        
        

    }
}
