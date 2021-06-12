
package SP20_BSE_0360_LAB14_ASSIGNMENT;

import java.io.Serializable;
import java.util.Scanner;

public class Account implements Serializable {
    private String AccountNumber;
    private int balance;
    Scanner input= new Scanner(System.in);

    public Account(String AccountNumber, int balance) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public double deposit(String AccountNumber){
       // System.out.println("enter amount to deposit in this account number "+ getAccountNumber());
        int amount;
       amount=600;
      //  Scanner input= new Scanner(System.in);
        //amount=input.nextInt();
        this.balance += amount;
     System.out.println("\n Total balance is after deposit the amount: "+ amount + " is " + balance);
      return balance;
    }
    public double withdraw(String AccountNumber){
      //  System.out.println("Enter the amount to withdraw");
        int amount;
        amount = 500;
     //  amount=input.nextInt();
        if(amount <= balance){
            balance -=amount;
            System.out.println("\n the withdraw money is "+ amount +" total balance is "+ balance);
        }
        else{
            System.out.println("\n withdraw money failed");
        }
        return balance;
}
    public double transfer(String AcountNumber, Account acc){
      //  System.out.println("enter the amount to transfer");
        int amount;
        amount =900;
      //  amount=input.nextInt();
        if(this.balance<amount){
            System.out.println("\n transfer fails");            
        }
        else{
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("\n The transfer "+amount+"of Account  "+this.AccountNumber +"to the Account of "+acc.AccountNumber);
         
            System.out.println("\n The balance of "+this.AccountNumber+ " Balance is "+ balance+" and "+" the balance of transfered account "+
                    acc.AccountNumber + " is "+ acc.balance);
            
        }   
        return balance;
    }
    public String balanceInquiry(String AccountNumber){
        
       
        return " Account number:" + AccountNumber +"\n Balance: "+ balance;
    }
    @Override
    public String toString() {
       
        return "\n"+ "Account{" + "\nAccountNumber=" + AccountNumber + ", \n balance=" + balance + '}';
               
    }
    
    
    
    
}
