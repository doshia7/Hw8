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
public class Services extends Account {

    private int numberOfHours;
    private double ratePerHour;

    public Services(int id, int numberOfHours, double ratePerHour) {
        super(id);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    public Services(int id) {
        super(id);
        numberOfHours = 0;
        ratePerHour = 0;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double calculateSales() {
        return getNumberOfHours() * getRatePerHour();
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + "\nRate per hour: $" + getRatePerHour()
                + "\nNumber of hours : " + getNumberOfHours()
                + "\nTotal Sales : $" + calculateSales();
    }
}
