
package SP20_BSE_0360_LAB14_ASSIGNMENT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

 
 
public class Account_Runner {
   
   public static void main(String[] args) throws FileNotFoundException, IOException {
     Account [] array= new Account[10];
     

  // have not take the input and  was commented out just to run the program quickly i fixed the deposit withdraw and transfer amount
     array[0]= new Account("12567",4000);
     array[1]= new Account("12468",5000);
     array[2]= new Account("52768",6000);
     array[3]= new Account("72768",7000);
     array[4]= new Account("192768",8000);
     array[5]= new Account("92768",9000);
     array[6]= new Account("02768",1000);
    array[7]= new Account("02768",10000);
    array[8]= new Account("92768",11000);
    array[9]= new Account("16768",5200);
    
     try{
    
         ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("Account.bin")); 
         int index=0;
         while(index<array.length){
             if(array[index]!=null){
                 System.out.println("\n After doing all operation the account details ");
                 System.out.println("----"+index+"| Account Number:"+ array[index].getAccountNumber()+" Details-----------");
                file.writeObject(array[index].deposit(array[index].getAccountNumber()));
                file.writeObject(array[index].withdraw(array[index].getAccountNumber()));
                file.writeObject(array[index].transfer(array[index].getAccountNumber(), array[1]));
                file.writeObject(array[index].balanceInquiry(array[index].getAccountNumber()));
                System.out.println("\n");
             }
             index=index+1;
         }
             file.close();
         
     }
     catch(IOException e){
         System.out.println("Error writing the file");
         System.exit(0);
     }
       System.out.println("Array written to the file");
       System.out.println("now let's reopen the file and dsiplay content");
     //   Account B[]=null;
       try{
         ObjectInputStream inputfile = new ObjectInputStream(new FileInputStream("Account.bin"));
         int index=0;
         while(index<array.length){
             if(array[index]!=null){
               inputfile.readObject();
             }
             index=index+1;
         }
         inputfile.close();
        //     B=(Account[])inputfile.readObject();
         //    inputfile.close();
         }
     
     catch(ClassNotFoundException e){
         System.out.println("can not find he file");
         System.exit(0);
     }
       catch(IOException e){
         System.out.println("problem with file input");
         System.exit(0);
     }
       System.out.println("The following reading from file");
       int i;
       for( i=0;i<array.length;i++){
           System.out.println(array[i]);
           System.out.println("end of program");
           
       }
   }
       
   }

     
