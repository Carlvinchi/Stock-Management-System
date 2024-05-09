/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oop.ica.part2;

/**
 *
 * @author confidence
 */
public interface YoFish {
    
    //methods to be implemented by a concreate class
    
    int getId();
    String getItem();
    double getPrice();
    int getStock();
    double getMaxSize();
    int getLowTemp();
    int getHighTemp();
    void setStock(int value, String action);
    String priceToString();
    String getPicFilename();
    
}
