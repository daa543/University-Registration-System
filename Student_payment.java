
 
package project_university;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class Student_payment extends Credit_hours {
    ArrayList<Transaction> transaction = new ArrayList<Transaction>();
 String Type_funding ;
  static int Number_payments ;
   static double Total_amount_paid ;
double  Amount_paid ;
 String Transaction_number;
 String Bank_transaction;
  String Date_transaction  ; 
    String details_payment ;
   Student_payment() throws Exception{ //constructor no arrgument
       super() ;
       
        Date_transaction = (new Date()).toString();
       Bank_transaction = (new Generator_Random()).generat_Banks(new Random().nextInt(5));
       Amount_paid = (new Random()).nextInt(3000);
     Type_funding =(new Generator_Random()).generat_Payments((new Random()).nextInt(2));
     Transaction_number = String.valueOf((new Random()).nextInt(99999) );
    details_payment  = "Number_payments : "+Number_payments+"\n"+"Amount of paid : "+String.valueOf(Amount_paid)+"\n"+"number of Transaction : "+Transaction_number+"\n"+"Bank of transaction : "+Bank_transaction+"\n"+"Date of transaction : "+Date_transaction ;

   }Student_payment(double num)throws Exception{ //constructor with Double as arrgument
            FileWriter file = new FileWriter("studentcreation.txt",true);
            
   Date_transaction = (new Date()).toString();
       Bank_transaction = (new Generator_Random()).generat_Banks(new Random().nextInt(5));
       Amount_paid = num;
     Type_funding =(new Generator_Random()).generat_Payments((new Random()).nextInt(2));
     Transaction_number = String.valueOf((new Random()).nextInt(99999) );
    details_payment  = "Number_payments : "+Number_payments+"\n"+"Amount of paid : "+String.valueOf(Amount_paid)+"\n"+"number of Transaction : "+Transaction_number+"\n"+"Bank of transaction : "+Bank_transaction+"\n"+"Date of transaction : "+Date_transaction ;
   file.write("Number_payments : "+Number_payments+"\n"+"Amount of paid : "+String.valueOf(Amount_paid)+"\n"+"number of Transaction : "+Transaction_number+"\n"+"Bank of transaction : "+Bank_transaction+"\n"+"Date of transaction : "+Date_transaction+"\n");
  file.write("-----------------------------------------------------"+"\n");
   file.close();
   }
   void add_payments() throws Exception{
       Number_payments++ ;
    transaction.add(new Transaction());  
   }
    public void printArray_of_Transaction(){
        
 for(int i =0 ; i<transaction.size(); i++){
   
 transaction.get(i).display();

 }
    }
    void input_payment(int num) throws Exception{
       for(int i=0;i<num;i++){

        Number_payments++ ;
        while(true){
        System.out.println("Enter the amount paid ");
          try{
        Scanner input =new Scanner(System.in);
      Amount_paid = input.nextDouble() ;
      transaction.add(new Transaction(Amount_paid));  
      break;
          }catch(Exception e){
              System.out.println("Enter Integer");
          }
          }
        }
    }
}
