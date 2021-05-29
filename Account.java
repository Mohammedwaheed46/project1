/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packag;

/**
 *
 * @author 10
 */
class Account
{
    private double balance;
    private int account_number;
    /**
     * default constructor set balance and account number =0
     */
    public Account() //default constructor 
    {
        this.balance = 0;
        this.account_number = 0;
    }
    /**
     * constructor take values and set it in the parameter 
     * @param account_number
     * @param balance 
     */
    Account(int account_number,double balance) //pramiterized constrector
    {
        this.account_number=account_number;
        this.balance=balance;
    }
    /**
     * set account number 
     * @param account_number 
     */
    void set_account_number(int account_number)//seter to account number 
    {
        this.account_number=account_number;
    }
    /**
     * set balance 
     * @param balance 
     */
    void set_balance (double balance)//seter to balance
    {
        this.balance=balance;
    }
    /**
     * return account number 
     * @return account_number
     */
    int get_account_number()//geter to account number
    {
        return this.account_number;
    }
    /**
     * return balance
     * @return balance
     */
    double get_balance ()//geter to balance
    {return this.balance;}
    /**
     * this function do a check if the balance bigger than value 
     * @param value
     * @return true if balance is enough to withdraw and false if not  
     */
  //account withdraw function
    boolean withdraw (int value )
    {
        if (value>balance)
        {
            return false;
        }
        else {
            balance-=value;
            return true;
        }
    }
    /**
     * this function to deposit in the account 
     * @param value 
     */
    void deposit(int value)//To deposit money from the account
    {
        balance += value;
    }
    /**
     * overriding function to string 
     * @return balance and account number
     */
    @Override
    public String toString()//to  show data
    {
        return "the balance = " + balance + "\n the account_number = " + account_number + "\n";
    }


}

