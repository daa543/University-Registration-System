
package project_university;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Current_course extends course{
   int number_ofcourses ;
    int Course_credit_hours_Current_course ;
   int number_current_course;
course head ;
    Current_course() throws IOException{      //constructor no arrgument
        head = new course();
    }
    public  void add() throws IOException{ //to creat one cours       
        course newNode = new course(); 
       newNode.next = head ;
        Course_credit_hours_Current_course +=newNode.Course_credit_hours ;
        number_ofcourses++;
        head=newNode ;
   
        }
    public void add_number_of_nodes(int num) throws IOException{ // to creat N courses
    number_current_course = num ;
        for (int i = 0 ; i<num;i++)  {
          
           number1_ofcourses_current ++;
          add();
      }
    }
  void printCurrent_course() throws IOException{
        course travars = new course();
        travars =head ;
        head.tostring_no_print();
      for(int i = 0 ; i<number_current_course-1;i++){
          
        travars =   travars.next ;
        travars.tostring_no_print();
       } 
      if(number_ofcourses==0&&Course_credit_hours_Current_course==0){
           Course_credit_hours_Current_course +=head.Course_credit_hours;
          number_ofcourses++;
      System.out.println("number of  Current courses is  : " + (number_ofcourses)+"\n" +"Current_hours: "+Course_credit_hours_Current_course);
      }else{
     System.out.println("number of Current courses is : " + (number_ofcourses) +"\n"+"Current_hours: "+Course_credit_hours_Current_course);
  
      }
}
    void printCurrent_coursesto_file() throws IOException{
        FileWriter file = new FileWriter("studentcreation.txt",true);
        
        course travars = new course();
        travars =head ;
         file.write("cours cod : "+head.Course_code+"\n");
        file.write("cours name : "+head.Course_name+"\n");
        file.write("cours lecturer : "+head.Course_lecturer+"\n");
        file.write("cours credit hours : "+head.Course_credit_hours+"\n");
        
        
      for(int i = 0 ; i<number_current_course-1;i++){
        travars =   travars.next ;
        file.write("cours cod : "+travars.Course_code+"\n");
        file.write("cours name : "+travars.Course_name+"\n");
        file.write("cours lecturer : "+travars.Course_lecturer+"\n");
        file.write("cours credit hours : "+travars.Course_credit_hours+"\n");
       
        
       }
      file.write("number of Current courses is : " + (number_ofcourses) +"\n"+"Current_hours: "+Course_credit_hours_Current_course+"\n");
      file.close();
    }
}
