/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.part2;

//import libraries
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author s3154679
 */
public class YoFishTableModel extends AbstractTableModel {
    
    //Table fields
    private String[] columnNames;
    private Object tableData[][];
    
    //Class constructor
    public YoFishTableModel(String[] colNames, ArrayList <YoFishItem> fishList ){
        
        //get length of array colNames
        int columnNamesLength = colNames.length;
        
        //copy contents of array colNames to columnNames
        this.columnNames = Arrays.copyOf(colNames, columnNamesLength);
        
        //get the size of ArrayList fishList
        int rowLength = fishList.size();
        
        //set the size of tableData array
        this.tableData = new Object[rowLength][columnNamesLength];
        
        //populate row data
        for(int index = 0; index < fishList.size(); index++){
            //get fields in fishList
            int id = fishList.get(index).getId();
            String item = fishList.get(index).getItem();
            String price = fishList.get(index).priceToString();
            int stock = fishList.get(index).getStock();
            double maxSize = fishList.get(index).getMaxSize();
            int lowTemp = fishList.get(index).getLowTemp();
            int highTemp = fishList.get(index).getHighTemp();
            
            //use fields to create linear array rowData
            Object[] rowData = {id, item, price, stock, maxSize, lowTemp, highTemp };
            
            //copy row data array into current tableData row
            this.tableData[index] = Arrays.copyOf(rowData, columnNamesLength);
        }//end of loop    
        
    }// end of constructor
    
    @Override
    public int getRowCount() {
        //return number of rows
        return this.tableData.length;    
    }

    @Override
    public int getColumnCount() {
        //return number of column
        return this.columnNames.length;   
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //get value of  a cell
        return this.tableData[rowIndex][columnIndex];
    }
    
    @Override
    public void setValueAt(Object value ,int rowIndex, int columnIndex) {
        //set value of a cell
        this.tableData[rowIndex][columnIndex] = value;
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
}//end of class
