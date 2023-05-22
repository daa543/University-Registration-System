
package project_university;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class course {
    
  static int  number1_ofcourses ;
   static int  number1_ofcourses_current ;
    course next ;
 int Course_code ;
String Course_name;
int Course_credit_hours ;
 int Semester_for_course;
 double exam_week7 ;
 double exam_week12 ;
 double year_work ;
 double final_exam ;
double Grade_course ;
double Studen_absence ;
String Course_lecturer ;
String[] array,arrays ;
course() throws IOException{ //constructor no arrgument
  
    Course_lecturer = (new Generator_Random()).generat_name((new Random()).nextInt(40))+" "+(new Generator_Random()).generat_name((new Random()).nextInt(18)+22)+" "+(new Generator_Random()).generat_name((new Random()).nextInt(18)+22);
 Course_code = new Random().nextInt(10000);
Course_name = new Generator_Random().generat_courses_name(new Random().nextInt(12)) ;
Course_credit_hours = (new Random().nextInt(2))+2 ;
//Course_credit_hours_allfinishedcourse+=Course_credit_hours;

exam_week7  = (new Random().nextInt(18)+13) ;
exam_week12 = (new Random().nextInt(13)+8) ;
year_work = (new Random().nextInt(7)+4);
final_exam = (new Random().nextInt(23)+18);
Grade_course = exam_week7 +exam_week12+ year_work +year_work+ final_exam ;
Studen_absence = (new Random().nextInt(100))/100.00;
 array = new String[]{Course_lecturer,Course_name,String.valueOf(Course_code),String.valueOf(Course_credit_hours),String.valueOf(exam_week7),String.valueOf(exam_week12),String.valueOf(final_exam),String.valueOf(year_work),String.valueOf(Grade_course),String.valueOf(Studen_absence)};
 arrays = new String[]{"Course lecturer" ,"Coursename","Course code","Course credit hours","exam week7","exam week12","final exam","year work","Grade course","Studen absence"};

}

public void tostring() throws IOException{ //  to print array of course 

    for(int i=0;i<10;i++){
       System.out.println(arrays[i]+":"+array[i]+"\n"); 
  
   }
}
public void tostring_no_print() throws IOException{ //  to print array of course 
     
    for(int i=0;i<4;i++){

      System.out.println(arrays[i]+":"+array[i]+"\n"); 
   }
     
}
void input_course(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Name of course");
    Course_name = input.next();
    System.out.println("Enter code of course");
    Course_code = input.nextInt() ;
    System.out.println("Enter credit hours of course");
    Course_credit_hours = input.nextInt() ;
    System.out.println("Enter grade in exam week7 ");
    exam_week7 = input.nextInt() ;
    System.out.println("Enter your grade in exam week12 ");
    exam_week12 = input.nextInt() ;
    System.out.println("Enter your grade in final exam");
    final_exam = input.nextInt() ;
}
         }
