/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Defines a product
 * @author Daniel Jiménez
 */
public class Product {
    private String description;
    private int size;
    
    /**
     * This constructor initializes a product with the input descriptions
     * 
     * @param description The name of the product
     * @param size The size of the product
     * @param isDamaged The input attribute isDamaged
     */
    public Product(String description, int size, boolean isDamaged) {
        this.description = description;
        this.size = size;
        this.isDamaged = isDamaged;
    }
    
    
    /**
     * Returns is a product is damaged
     * @return Boolean attribute
     */
    public boolean isIsDamaged() {
        return isDamaged;
    }
    
    /**
     * Sets is a product is damaged
     * @param isDamaged The input attribute is damaged 
     */
    public void setIsDamaged(boolean isDamaged) {
        this.isDamaged = isDamaged;
    }
    private boolean isDamaged;
    
    /**
     * Returns the name
     * @return The name of the product
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Returns The size of the product
     * @return Integer with the size
     */
    public int getSize() {
        return size;
    }

    
    /**
     * Sets the name
     * @param description The input name 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the size
     * @param size The size of the product
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    

}
