import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Store_Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store_Item extends Actor
{
    /**
     * Act - do whatever the Store_Item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String name;
    private String fileName;
    private int xLoc;
    private int yLoc;
    private int stock;
    private String price;
    
    public Store_Item() {
        name = "";
        fileName = "";
        xLoc = 10000;
        yLoc = 10000;
        stock = 0;
        price = "$0.00";
    }
    
    public Store_Item(String n, String f, int x, int y, int s, String p) {
        name = n;
        fileName = f;
        xLoc = x;
        yLoc = y;
        stock = s;
        price = p;
    }
    
    public String getName() {
        return name;
    }
    
    public String getFileName() {
        return fileName;
    }
    
    public int getX() {
        return xLoc;
    }
    
    public int getY() {
        return yLoc;
    }
    
    public int getStock() {
        return stock;
    }
    
    public String getPrice() {
        return price;
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("space")) {
            List<Store_Item> items = getWorld().getObjects(Store_Item.class);
            if (items.size() == 3) {
                getWorld().removeObject(items.get(2));
                getWorld().removeObject(items.get(1));
                items.remove(2);
                items.remove(1);
            }
            
            String q = Greenfoot.ask("Enter the name of the product you wish to find.");
            
            if (q.equals("no")) {
                Greenfoot.stop();
            }
            
            else if (q.equals("Apples")) {
                Store_Item apples = new Store_Item("Apples", "apples.png", 300, 50, 20, "$1.50");
                apples.setImage(apples.getFileName());
                getWorld().addObject(apples, 100, 75);
                getWorld().showText("Product: " + apples.getName(), 100, 200);
                getWorld().showText("Stock: " + apples.getStock(), 100, 250);
                getWorld().showText("Price: " + apples.getPrice(), 100, 300);
                
                Store_Item itemLocation = new Store_Item("Map_Pin", "map_pin.png", 0, 0, 0, "");
                itemLocation.setImage(itemLocation.getFileName());
                getWorld().addObject(itemLocation, apples.getX(), apples.getY());
            }
            
            else if (q.equals("Strawberries")) {
                Store_Item strawberries = new Store_Item("Strawberries", "strawberries.jpg", 800, 50, 50, "$4.00");
                strawberries.setImage(strawberries.getFileName());
                getWorld().addObject(strawberries, 100, 75);
                getWorld().showText("Product: " + strawberries.getName(), 100, 200);
                getWorld().showText("Stock: " + strawberries.getStock(), 100, 250);
                getWorld().showText("Price: " + strawberries.getPrice(), 100, 300);
                
                Store_Item itemLocation = new Store_Item("Map_Pin", "map_pin.png", 0, 0, 0, "");
                itemLocation.setImage(itemLocation.getFileName());
                getWorld().addObject(itemLocation, strawberries.getX(), strawberries.getY());
            }
            
            else if (q.equals("Cheetos")) {
                Store_Item cheetos = new Store_Item("Cheetos", "cheetos.jpg", 350, 185, 10, "$3.00");
                cheetos.setImage(cheetos.getFileName());
                getWorld().addObject(cheetos, 100, 75);
                getWorld().showText("Product: " + cheetos.getName(), 100, 200);
                getWorld().showText("Stock: " + cheetos.getStock(), 100, 250);
                getWorld().showText("Price: " + cheetos.getPrice(), 100, 300);
                
                Store_Item itemLocation = new Store_Item("Map_Pin", "map_pin.png", 0, 0, 0, "");
                itemLocation.setImage(itemLocation.getFileName());
                getWorld().addObject(itemLocation, cheetos.getX(), cheetos.getY());
            }
            
            else if (q.equals("Wine")) {
                Store_Item wine = new Store_Item("Wine", "wine.jpg", 875, 230, 15, "$15.50");
                wine.setImage(wine.getFileName());
                getWorld().addObject(wine, 100, 75);
                getWorld().showText("Product: " + wine.getName(), 100, 200);
                getWorld().showText("Stock: " + wine.getStock(), 100, 250);
                getWorld().showText("Price: " + wine.getPrice(), 100, 300);
                
                Store_Item itemLocation = new Store_Item("Map_Pin", "map_pin.png", 0, 0, 0, "");
                itemLocation.setImage(itemLocation.getFileName());
                getWorld().addObject(itemLocation, wine.getX(), wine.getY());
            }
            
            else if (q.equals("Ice Cream")) {
                Store_Item iceCream = new Store_Item("Ice Cream", "Ice Cream.jpg", 225, 450, 5, "$5.00");
                iceCream.setImage(iceCream.getFileName());
                getWorld().addObject(iceCream, 100, 75);
                getWorld().showText("Product: " + iceCream.getName(), 100, 200);
                getWorld().showText("Stock: " + iceCream.getStock(), 100, 250);
                getWorld().showText("Price: " + iceCream.getPrice(), 100, 300);
                
                Store_Item itemLocation = new Store_Item("Map_Pin", "map_pin.png", 0, 0, 0, "");
                itemLocation.setImage(itemLocation.getFileName());
                getWorld().addObject(itemLocation, iceCream.getX(), iceCream.getY());
            }
            
            else if (q.equals("Beans")) {
                Store_Item beans = new Store_Item("Beans", "beans.jpeg", 615, 390, 25, "$2.00");
                beans.setImage(beans.getFileName());
                getWorld().addObject(beans, 100, 75);
                getWorld().showText("Product: " + beans.getName(), 100, 200);
                getWorld().showText("Stock: " + beans.getStock(), 100, 250);
                getWorld().showText("Price: " + beans.getPrice(), 100, 300);
                
                Store_Item itemLocation = new Store_Item("Map_Pin", "map_pin.png", 0, 0, 0, "");
                itemLocation.setImage(itemLocation.getFileName());
                getWorld().addObject(itemLocation, beans.getX(), beans.getY());
            }
            
            else if (q.equals("Cookies")) {
                Store_Item cookies = new Store_Item("Cookies", "cookie.jpg", 1125, 150, 10, "$5.00");
                cookies.setImage(cookies.getFileName());
                getWorld().addObject(cookies, 100, 75);
                getWorld().showText("Product: " + cookies.getName(), 100, 200);
                getWorld().showText("Stock: " + cookies.getStock(), 100, 250);
                getWorld().showText("Price: " + cookies.getPrice(), 100, 300);
                
                Store_Item itemLocation = new Store_Item("Map_Pin", "map_pin.png", 0, 0, 0, "");
                itemLocation.setImage(itemLocation.getFileName());
                getWorld().addObject(itemLocation, cookies.getX(), cookies.getY());
            }
        } 
    }    
}
