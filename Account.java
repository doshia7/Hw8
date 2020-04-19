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
public abstract class Account {

    private int accountID;

    public Account(int id) {
        this.accountID = id;
    }

    public int getAccountId() {
        return accountID;
    }

    public void setAccountId(int accountId) {
        this.accountID = accountId;
    }

    // Abstract method
    public abstract double calculateSales();

    @Override
    public String toString() {
        return "Account ID: " + getAccountId();
    }
}
