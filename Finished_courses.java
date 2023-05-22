
package project_university;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Finished_courses extends course{
   int number_ofcourses ;
    int  Course_credit_hours_allfinishedcourse ;
  int number_finished_course;
course head ;
    Finished_courses() throws IOException{      //constructor no arrgument
       FileWriter file= new FileWriter("studentcreation.txt",true);
      
        head = new course();
     
    }
    public  void add() throws IOException{ //to creat one cours       
        course newNode = new course(); 
       newNode.next = head ;
        Course_credit_hours_allfinishedcourse +=newNode.Course_credit_hours ;
        number_ofcourses ++;
        head=newNode ;
   
        }
    public void add_number_of_nodes(int num) throws IOException{ // to creat N courses
        number_finished_course = num ;
      for (int i = 0 ; i<num;i++)  {
   add();
      }

    }
  void printFinished_courses() throws IOException{ 
        course travars = new course();
        travars =head ;
        head.tostring();
      for(int i = 0 ; i<number_finished_course-1;i++){
          
        travars =   travars.next ;
        travars.tostring();
       } 
      System.out.println("number of finished courses is " + number_ofcourses +"\n"+"Finished_hours: "+Course_credit_hours_allfinishedcourse);
  }
    void printFinished_courses_to_file() throws IOException{
        FileWriter file = new FileWriter("studentcreation.txt",true);
        
        course travars = new course();
        travars =head ;
         file.write("cours cod : "+head.Course_code+"\n");
        file.write("cours name : "+head.Course_name+"\n");
        file.write("cours lecturer : "+head.Course_lecturer+"\n");
        file.write("cours credit hours : "+head.Course_credit_hours+"\n");
        file.write("cours exam week 7 : "+String.valueOf(head.exam_week7)+"\n");
        file.write("cours exam week 12 : "+String.valueOf(head.exam_week12)+"\n");
        file.write("cours final_exam : "+String.valueOf(head.final_exam)+"\n");
         file.write("cours year work : "+String.valueOf(head.year_work)+"\n");
        file.write("cours Studen absence : "+String.valueOf(head.Studen_absence)+"\n");
        
      for(int i = 0 ; i<number_finished_course-1;i++){
        travars =   travars.next ;
        file.write("cours cod : "+travars.Course_code+"\n");
        file.write("cours name : "+travars.Course_name+"\n");
        file.write("cours lecturer : "+travars.Course_lecturer+"\n");
        file.write("cours credit hours : "+travars.Course_credit_hours+"\n");
        file.write("cours exam week 7 : "+String.valueOf(travars.exam_week7)+"\n");
        file.write("cours exam week 12 : "+String.valueOf(travars.exam_week12)+"\n");
        file.write("cours final_exam : "+String.valueOf(travars.final_exam)+"\n");
         file.write("cours year work : "+String.valueOf(travars.year_work)+"\n");
        file.write("cours Studen absence : "+String.valueOf(travars.Studen_absence)+"\n");
       }
      file.write("number of finished courses is " + number_ofcourses +"\n"+"Finished_hours: "+Course_credit_hours_allfinishedcourse+"\n");
      file.close();
    }
}
