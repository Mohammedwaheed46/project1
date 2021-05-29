package com.packag;
/**
 * 
 * @author 10
 */
class Client {
    private String AddName ;
    private String nationalId;
    private  String address ;
    private  String phone ;
    private  Account account=new Account();//aggregation
    /**
     * empty constructor set values = null
     */
    public Client() 
    {
        this.AddName = " ";
        this.nationalId = " ";
        this.address = " ";
        this.phone = " ";
    }
    /**
     * set the data of the class 
     * @param AddName name
     * @param nationalId nationalId
     * @param address address
     * @param phone phone
     * @param account account
     */
    
    public Client (String AddName,String nationalId,String address,String phone,Account account)//prameterized constructor
    {
        this.account.set_account_number(account.get_account_number());
        this.account.set_balance(account.get_balance());
        this.address=address;
        this.AddName=AddName;
        this.phone=phone ;
        this.nationalId=nationalId;

    }
    /**
     * 
     * @param client 
     */
    public  Client(Client client)//copy constructor
    {
        this.set_account(client.account);
        this.AddName=client.AddName;
        this.nationalId=client.nationalId;
        this.phone=client.phone;
        this.address=client.address;
    }
    /**
     * set address
     * @param address 
     */
    public  void set_address(String address){this.address=address;}//seter to address
    /**
     * set nationalId
     * @param nationalId 
     */
    public void set_national_id(String nationalId){this.nationalId=nationalId;}//seter to nationalId
    /**
     * set_phone
     * @param phone 
     */
    public void set_phone(String phone){this.phone=phone;}//seter to phone
    /**
     * set name 
     * @param name 
     */
    public void set_name(String name){this.AddName=name;}//seter to name
    /**
     * set account data 
     * @param account 
     */
    public  void set_account(  Account account)//seter to Account
    {
        this.account.set_account_number(account.get_account_number());
        this.account.set_balance(account.get_balance());
    }
    /**
     * 
     * @return phone
     */
    public String get_phone ()//geter to phone number
    {
        return  this.phone;
    }
    /**
     * 
     * @return AddName
     */
    public String get_name()//geter to AddName
    {
        return  this.AddName;
    }
    /**
     * 
     * @return nationalId
     */
    public String get_national_id ()//geter to nationalId
    {
        return this.nationalId;
    }
    /**
     * 
     * @return account
     */
    public Account get_account()//geter to account
    {
        return this.account;
    }
    /**
     * 
     * @return address
     */
    public  String get_address()//geter to address
    {
        return this.address;
    }
    /**
     * overriding function toString 
     * @return all data in the class 
     */
    @Override
    public  String  toString ( )//Override this function to return all valuse in this class 
    {
        return "          the all inf about client \nname: "+AddName+"\n"+"national ID: "+nationalId+"\n"
                +"address: "+address+"\n"+"phone number: "+phone+"\n"
                +account.toString();
    }
}
