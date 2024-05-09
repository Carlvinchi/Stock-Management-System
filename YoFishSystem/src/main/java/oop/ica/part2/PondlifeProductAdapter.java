/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.part2;

/**
 *
 * @author confidence
 */
public class PondlifeProductAdapter extends YoFishItem {
    
    //class constructor
    public PondlifeProductAdapter(PondlifeProduct pondlifeProduct) {
        //super(num, product, cost, stock, maxLength, minTemp, maxTemp);
        
        super(pondlifeProduct.getSkuNumber(), 
                pondlifeProduct.getProduct(), 
                pondlifeProduct.getCost(), 
                pondlifeProduct.getStock(),
                pondlifeProduct.getMaxLength(), 
                pondlifeProduct.getMinTemp(), 
                pondlifeProduct.getMaxTemp() 
        );
        
    }

    
    @Override
    public String getPicFilename() {
        if(this.getId() == 1){
            return "0" + this.getId() + ".jpg";
        }
        else{
            return this.getId() + ".jpg";
        }
        
    }     
    
}