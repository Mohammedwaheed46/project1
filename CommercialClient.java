package com.packag;
/**
 * 
 * @author 10
 */
public class CommercialClient extends Client {
    private String commercialID;
    /**
     * empty constructor
     */
    public CommercialClient() //empty constructor 
    {
        super();
        this.commercialID = " ";
    }


   /**
    * Overriding parent's set_national_id   
    * @param nationalId  set the value =00000000000000
    */
    @Override
    public void set_national_id(String nationalId) //override the function to made CommercialClient id =00000000000000
    {
        super.set_national_id("00000000000000");

    }
    /**
     * 
     * @param commercialID set the id of the commercial client 
     */
    void set_commercial_id(String commercialID)//to set commercialID
    {
        this.commercialID=commercialID;
    }
    /**
     * 
     * @return commercialID
     */
    String get_commercial_id ()//to set commercialID
    {
        return  this.commercialID;
    }
    /**
     * overriding function toString 
     * @return all data in the class 
     */
    @Override
    public String toString() //Override this function to return all valuse in this class
    {
        return "            the all inf about client \nname: "+get_name()+"\n"+"commercial id : "+get_commercial_id()+"\n"
                +"address: "+get_address()+"\n"+"phone number: "+get_phone()+"\n"
                +get_account().toString();
    }
}