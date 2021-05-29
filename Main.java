/*
Student1 = Abdallah Saied Salem Khalil
ID = 20190325
Student2 = Mohamed waheed mohamed
ID = 20190487
Student2 = Mohamed Khayri Mohamed 
ID = 20190436

*/


package com.packag;

import java.util.Scanner;
/**
 * 
 * @author abdallah saied salem ,Mohamed Khayri Mohamed ,mohamed wahieed 
 */
public class Main {
    /**
     * show options
     */
    public static  void options (){
        System.out.println("1- Create a client");
        System.out.println("2- Create a CommercialClient");
        System.out.println("3- display data");
        System.out.println("4.to withdraw ");
        System.out.println("5.to deposit ");
        System.out.println("6- exist");
}
    
    public static  void createclint(){
        System.out.println("enter the data like :");
        System.out.println("1.name 2.nationalId (if it's a commerical enter id)  3.address 4.phone 5.account_number 6.balance");
    }
    
     public  static  void main(String[] args) {
         int userChoice,balance;
         Client c1=new Client();
         CommercialClient cc1=new CommercialClient();
         Bank b1 =new Bank();
         Account a=new Account(); 
         SpecialAccount sa=new SpecialAccount();
         Scanner cin = new Scanner (System .in);
         while (true){
             options();
             userChoice = cin.nextInt();
             if (userChoice==1){
                 createclint();
                 cin.nextLine();
                 c1.set_name(cin.nextLine());
                 
                 c1.set_national_id(cin.nextLine());
                 c1.set_address(cin.nextLine());
                 c1.set_phone(cin.nextLine());
                 a.set_account_number(cin.nextInt());
                 a.set_balance(cin.nextDouble());
                 c1.set_account(a);
                 b1.add_client(c1);
             }
             else if (userChoice==2){
                 createclint();
                 cin.nextLine();
                 cc1.set_name(cin.nextLine());
                 cc1.set_commercial_id(cin.nextLine());
                 cc1.set_address(cin.nextLine());
                 cc1.set_phone(cin.nextLine());
                 sa.set_account_number(cin.nextInt());
                 sa.set_balance(cin.nextDouble());
                 cc1.set_account(sa);
                 b1.add_client(cc1);
                 
             }
             else if (userChoice==3){
                 b1.display();
             }   
             else if (userChoice==4)
             {
                 System.out.println("enter the account number");
                 userChoice=cin.nextInt();
                 System.out.println("enter the balance that you want to whithdrow");
                 balance=cin.nextInt();
                 b1.withDraw(userChoice, balance);

             }
             else if (userChoice==5)
             {
                 System.out.println("enter the account number");
                 userChoice=cin.nextInt();
                 System.out.println("enter the balance that you want to whithdrow");
                 balance=cin.nextInt();
                 b1.deposit(userChoice, balance);
             }
             else if(userChoice==6)
                 break;
             else 
                 System.out.println("wrong input!");
             
         }
    }
}