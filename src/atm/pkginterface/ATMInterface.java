/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.pkginterface;

import java.util.*;
import java.util.Scanner;

class bankAccount{
    
    private double balance;
    
    public bankAccount(double initialBalance){
        
        balance = initialBalance;
    
}   
    
    public void deposit (double Amount ){
        balance = Amount+balance;
    }
    
    public boolean withdraw (double Amount ){
        if (Amount <=balance){
            balance = balance -Amount;
            return true;
            
        }else
        {
           return false; 
        }
        
    }
    public double check_Balance (){
        return balance;
    }
    
    
    }


/**
 *
 * @author Divakar
 */
public class ATMInterface {

    private static double initialBalance;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner obj = new Scanner (System.in);
        bankAccount user_account = new bankAccount(10000);
        
        while(true) {
            
            System.out.println("Please Select the option");
            System.out.println("For Deposit press 1");
            System.out.println("For Withdraw Press 2");
            System.out.println("For Check Balance Press 3");
            System.out.println("For Exit Press 4");
            
            
            int choice =obj.nextInt();
            
            switch (choice){
                
                case 1 :
                    System.out.println("Enter Amount For Deposit : Rs:");
                    double d_amount =obj.nextInt();
                    user_account.deposit(d_amount);
                    System.out.println("Deposit Successfully Rs:"+d_amount);
                    break;
                case 2:
                     System.out.println("Enter Amount For Withdraw : Rs:");
                    double w_amount =obj.nextInt();
                    boolean withdrawSuccess = user_account.withdraw(w_amount);
                    if (withdrawSuccess){
                        System.out.println("Withdraw Successfully Rs:"+w_amount);
                    }else{
                        System.out.println("Insufficient Balance In Your Account");
                    }
                    break;
                case 3:
                    double c_balance = user_account.check_Balance();
                    System.out.println("Your Acount Balance is : Rs: "+c_balance);
                    break;
                    
                case 4:
                    System.out.println("Thank You For Using The ATM");
                    obj.close();
                    System.exit(0);
                
                default :
                    System.out.println("Invalid Option : Please Choose The Correct Option");
            }
            
                
            
        }
        
        
    }
    
}
