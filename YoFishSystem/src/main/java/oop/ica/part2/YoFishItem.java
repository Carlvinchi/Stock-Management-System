/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.part2;

/**
 *
 * @author s3154679
 */
public class YoFishItem {
    
    // Delcaring class attributes
    private int id;
    private String item;
    private double price;
    private int stock;
    private double maxSize;
    private int lowTemp;
    private int highTemp;
    
    // class constructor
    public YoFishItem(int id, String item, double price, int stock, double maxSize, int lowTemp, int highTemp){
        this.id = id;
        this.item = item;
        this.price = price;
        this.stock = stock;
        this.maxSize = maxSize;
        this.lowTemp = lowTemp;
        this.highTemp = highTemp;
    }
    
    // Accessor methods
    public int getId(){
        return this.id;
    }
    
    public String getItem(){
        return this.item;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    public double getMaxSize(){
        return this.maxSize;
    }
    
    public int getLowTemp(){
        return this.lowTemp;
    }
    
    public int getHighTemp(){
        return this.highTemp;
    }
    
    
    //Mutator method
    public void setStock(int stock){
        this.stock = stock;
    }
    
    
    //Service method
    public String priceToString(){
        return String.format("£ %.2f ", this.price);
    }
    
    public String getPicFilename(){
        return this.id + ".jpg";
    }
    
}
