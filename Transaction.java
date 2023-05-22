
package project_university;
import java.util.Arrays;

public class Transaction extends Student_payment {
   
 public Transaction()throws Exception{ //constructor no arrgument
     
 } public Transaction(double num) throws Exception{  //constructor with Double as arrgument
   super(num); // call constructor with Double as arrgument of Student_payment
     
     
 }
public void display(){
     Total_amount_paid+= Amount_paid ;
    
 System.out.println(details_payment) ; 
 
}
 

}
