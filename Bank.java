/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packag;

import java.util.SplittableRandom;
import java.util.ArrayList;
/**
 *
 * @author 10
 * @version 1.6
 */
public class Bank {
    private static int counter=0;
    ArrayList <Account> accounts =new ArrayList<>();
    ArrayList<Client> clients=new ArrayList<>();
    private  String name;
    private  String phone ;
    private  String address ;
    /**
     *
     * constructor that set this values = null
     * @param name
     * @param address
     * @param phone
     * 
     */
    Bank(){name="";phone="";address="";};//defult constrector
    /**
     *
     * constructor that set class data
     * @param name
     * @param address
     * @param phone
     */
    Bank(String name, String phone , String address)//prameterized constrector
    {
        this.address=address;
        this.phone=phone;
        this.name=name;
    }
    /**
     * set name 
     * @param name 
     */
    void set_name(String name)//to set name
    {
        this.name=name;
    }
    /**
     * set address
     * @param address 
     */
    void set_address(String address)//to set adress
    {
        this.address=address;
    }
    /**
     * set phone
     * @param phone 
     */
    void set_phone (String phone)//to set phone number
    {
        this.phone =phone ;

    }
    /**
     *   
     * @return name
     */
    String get_name()//this function to get the name
    {
        return  this.name ;
    }
    /**
     *  
     * @return phone
     */
    String get_phone()//this function to get the phone number
    {
        return  this.phone;
    }
    /**
     * 
     * @return address 
     */
    String get_address()//this function to get the adress   
    {
        return  this.address;
    }
    /**
     * to add client in arrayList 
     * @param client 
     */
    void add_client(Client client)//copy constrector
    {


        clients.add(client);

        accounts.add(client.get_account());


        counter++;


    }
    /**
     * Looking for the account number and withdrawing by calling withdraw  from class account 
     * @param account_number
     * @param value 
     */
    void withDraw (int   account_number,int value )
    {
        for (int i=0;i<counter;i++)
        {
            if (accounts.get(i).get_account_number()==account_number)
            {
                if (accounts.get(i).withdraw(value)){
                    System.out.println("The operation is complete");
                }
                else {
                    System.out.println("the balance does not Enough ");
                }
            }

        }
      
    }
    /**
     * Looking for the account number and depositing by calling deposit  from class account 
     * @param account_number
     * @param value 
     */
    void deposit (int   account_number,int value)
    {
        for (int i=0;i<counter;i++)
        {
            if (accounts.get(i).get_account_number()==account_number)
            {
                accounts.get(i).deposit(value);
            }

        }
    }
    /**
     * this function display the all clients with there account 
     */
    void display()//this function to display data 
    {
        for (int i=0;i<counter;i++)
        {
            System.out.print ("        client: "   );
            System.out.println(i+1);

            System.out.println(clients.get(i).toString());
            System.out.println("***************");

        }
    }

}