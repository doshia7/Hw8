/*
 * Author: Aayushi Doshi
 * Course: cpsc24500
 * Date: 4/1/2020
 * Discription:- This program is about implementing Java GUI to get input from 
 * the user to enter objects Services and Supplies into ArrayList Account. 
 * 
 */
package javaapplication54;

/**
 *
 * @author doshi
 */
public class Supplies extends Account {

    private int numberOfItems;
    private double pricePerItem;

    public Supplies(int id, int numberOfItems, double pricePerItem) {
        super(id);
        this.numberOfItems = numberOfItems;
        this.pricePerItem = pricePerItem;
    }

    public Supplies(int id) {
        super(id);
        numberOfItems = 0;
        pricePerItem = 0;
    }

    public double getPricePerItem() // Getter method
    {
        return pricePerItem;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) // Setter method
    {
        this.numberOfItems = numberOfItems;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double calculateSales() {
        return getNumberOfItems() * getPricePerItem();
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + "\nPrice per item: $" + getPricePerItem()
                + "\nItems sold : " + getNumberOfItems()
                + "\nTotal Sales : $" + calculateSales();
    }
}
