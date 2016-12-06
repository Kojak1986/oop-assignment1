/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

/**
 *
 * @author Kojak
 */
public class Product 
{
    private String productName;
    private double productPrice;
    private Manufacturer manufacturer;
    
    public Product(String productName, Manufacturer manufacturer, double productPrice)
    {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.productPrice = productPrice;
    }
    
    
    //accessors
    public String getProductName()
            
    {
        return this.productName;
    }
    
    public Manufacturer getManufacturer()
    {
        return this.manufacturer;
    }
    
    public double productPrice()
    {
        return this.productPrice;
    }
    
    //mutators
    public void setProductName()
    {
        this.productName = productName;
    }
    public void setManufacturer()
    {
        this.manufacturer = manufacturer;
    }
    public void setProductPrice()
    {
        this.productPrice = productPrice;
    }
    
    public String toString(){
        return super.toString() + "\nProduct Name: " + this.productName + "\n"
                + "Manufacturer: " + this.manufacturer.toString() + "\n"
                + "Price: " + this.productPrice;
    }
    
    
    
    
}
