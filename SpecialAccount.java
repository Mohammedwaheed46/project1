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
class SpecialAccount extends Account
{
    /**
     * empty constructor called the constructor from the base class  
     */
    SpecialAccount(){
        super();
    }
    /**
     *  constructor called the constructor from the base class and set balance and account number  
     * @param account_number
     * @param balance 
     */
    SpecialAccount(int account_number,double balance)//prameterized constrector
    {
        super(account_number,balance);
    }
    /**
     * overriding the parent's withdraw function 
     * special account can withdraw up to 1000 if he does not have balance
     * @param value 
     * @return true if the balance is enough.false if the balance does not enough  
     */
    @Override
            //To withdraw money from the account
            //special account can withdraw up to 1000 if he does not have balance
    //special account withdraw function 
    boolean withdraw(int value) {
        if (get_balance()+1000<value)
        {
            return  false;
        }
        else
        {
            set_balance(get_balance()-value);
            return true;
        }
    }
}

