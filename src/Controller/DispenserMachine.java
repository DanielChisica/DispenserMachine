/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import java.util.Queue;
import java.util.Stack;

/**
 * Defines the attributes and methods of a Dispenser Machine
 *
 * @author Daniel Jiménez
 */
public class DispenserMachine {
    
    /**
     * Returns the queue
     * @return The queue
     */
    public Queue getQueue1() {
        return queue1;
    }
    
    /**
     * Sets the queue
     * @param queue1 Returns the queue
     */
    public void setQueue1(Queue queue1) {
        this.queue1 = queue1;
    }
    
    /**
     * Returns the queue
     * @return The queue
     */
    public Queue getQueue2() {
        return queue2;
    }
    
    /**
     * Sets the queue
     * @param queue2 Returns the queue
     */
    public void setQueue2(Queue queue2) {
        this.queue2 = queue2;
    }
    
    /**
     * Returns the queue
     * @return The queue
     */
    public Queue getQueue3() {
        return queue3;
    }
    
    /**
     * Sets the queue
     * @param queue3 Returns the queue
     */
    public void setQueue3(Queue queue3) {
        this.queue3 = queue3;
    }
    
    /**
     * Returns the queue
     * @return The queue
     */
    public Queue getQueue4() {
        return queue4;
    }
    
    /**
     * Sets the queue
     * @param queue4 Returns the queue
     */
    public void setQueue4(Queue queue4) {
        this.queue4 = queue4;
    }
    
    /**
     * Returns the queue
     * @return The queue
     */
    public Queue getQueue5() {
        return queue5;
    }
    
    /**
     * Sets the queue
     * @param queue5 Returns the queue
     */
    public void setQueue5(Queue queue5) {
        this.queue5 = queue5;
    }
    
    /**
     * Returns the queue
     * @return The queue
     */
    public Queue getQueue6() {
        return queue6;
    }
    
    /**
     * Sets the queue
     * @param queue6 Returns the queue
     */
    public void setQueue6(Queue queue6) {
        this.queue6 = queue6;
    }
    
    /**
     * Returns the queue
     * @return The queue
     */
    public Queue getQueue7() {
        return queue7;
    }
    
    /**
     * Sets the queue
     * @param queue7 Returns the queue
     */
    public void setQueue7(Queue queue7) {
        this.queue7 = queue7;
    }
    
    /**
     * Returns the queue
     * @return The queue
     */
    public Queue getQueue8() {
        return queue8;
    }
    
    /**
     * Sets the queue
     * @param queue8 Returns the queue
     */
    public void setQueue8(Queue queue8) {
        this.queue8 = queue8;
    }
    
    /**
     * Returns the queue
     * @return The queue
     */
    public Queue getQueue9() {
        return queue9;
    }
    
    /**
     * Sets the queue
     * @param queue9 Returns the queue
     */
    public void setQueue9(Queue queue9) {
        this.queue9 = queue9;
    }
    
    /**
     * 
     * @return 
     */
    public Stack getStack() {
        return stack;
    }
    
    /**
     * 
     * @param stack 
     */
    public void setStack(Stack stack) {
        this.stack = stack;
    }
    
    /**
     * 
     * @return 
     */
    public Arraylist getListDamagedProducts() {
        return listDamagedProducts;
    }
    
    /**
     * 
     * @param listDamagedProducts 
     */
    public void setListDamagedProducts(Arraylist listDamagedProducts) {
        this.listDamagedProducts = listDamagedProducts;
    }

    private Queue queue1;
    private Queue queue2;
    private Queue queue3;
    private Queue queue4;
    private Queue queue5;
    private Queue queue6;
    private Queue queue7;
    private Queue queue8;
    private Queue queue9;

    private Stack stack;
    private Arraylist listDamagedProducts;

    public DispenserMachine() {
        for (int i = 0; i < 10; i++) {
            queue1.add(new Product("Coke", 100, false));
        }
        
        for (int i = 0; i < 10; i++) {
            queue2.add(new Product("Oreo", 50, false));
        }
        
        for (int i = 0; i < 10; i++) {
            queue3.add(new Product("Margarita Potatoes", 30, false));
        }
        
        for (int i = 0; i < 10; i++) {
            queue4.add(new Product("Sparkies", 20, false));
        }
        
        for (int i = 0; i < 10; i++) {
            queue5.add(new Product("Water", 120, false));
        }
        
        for (int i = 0; i < 10; i++) {
            queue6.add(new Product("Salchichon", 220, false));
        }
        
        for (int i = 0; i < 10; i++) {
            queue7.add(new Product("Empanada", 60, false));
        }
        
        for (int i = 0; i < 10; i++) {
            queue8.add(new Product("Sandwich", 70, false));
        }
        
        for (int i = 0; i < 10; i++) {
            queue9.add(new Product("Apple", 80, false));
        }
        
    }

}
