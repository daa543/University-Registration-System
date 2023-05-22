
package project_university;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class Student extends Student_payment{
    
     String  Street,Area,City,Governorate,Country;
    int flat,House ;
    String nationality ;
   String mailing_address ;
 int age , Day,Month,year ;
    String Date ;
  String  Student_tutor_name ;
String   firstname ,Postal_code ;
  String middlename ;
  String lastname ;
   static int number_Student ;
int code_tutor ;
String ID ;
String  Student_mobile_number,Student_home_phone_number;
 String registration  = new String ();
String Student_gender;
   int First_term , first_year ;
String department ;
int  Current_term ;
 String Contact_Student_e_mail ;
  double Overall_GPA ;
    int Number_semesters_finished ;
    double  individual_semester_GPAs [] = new double[8];

    
Student() throws IOException, Exception{ //constructor no arrgument
    super();
     FileWriter file= new FileWriter("studentcreation.txt",true);
        
     number_Student++ ;
     
      department=(new Generator_Random()).generat_department((new Random()).nextInt(4));
     Day = ((new Random()).nextInt(30)+1) ;  
        Month = ((new Random()).nextInt(11)+1) ;
        year = ((new Random()).nextInt(13)+1990);
        Date = Day+"/"+Month+"/"+year;
            ID =String.valueOf(3030)+String.valueOf(new Random().nextInt(10000))+String.valueOf(100000);
         firstname = (new Generator_Random()).generat_name((new Random()).nextInt(40)) ;
   middlename = (new Generator_Random()).generat_name((new Random()).nextInt(20)+20);
     lastname = (new Generator_Random()).generat_name((new Random()).nextInt(20)+20);
        nationality =(new Generator_Random()).generat_nationality((new Random()).nextInt(9));
        flat= (new Random().nextInt(15));
    Street= (new Generator_Random()).generat_Street((new Random()).nextInt(10));
    Area = (new Generator_Random()).generat_Area((new Random()).nextInt(11));
    City = (new Generator_Random()).generat_City((new Random()).nextInt(28)) ;
    Country = "Egypt";
    House = (new Random().nextInt(50));
     Postal_code = String.valueOf((new Random().nextInt(100000)));
     mailing_address = String.valueOf(House)+" "+Street+" "+Area+"  "+" "+City+" "+Country;
    Student_gender = (new Generator_Random()).random_gendar();
        first_year();  
        First_term = 1 ;
    code_tutor = ((new Random()).nextInt(100000));
    Student_mobile_number = "01"+String.valueOf(new Random().nextInt(3))+(new Generator_Random().phone_number(0));
    Student_home_phone_number = "03"+(new Generator_Random().phone_number(1));
      Student_tutor_name = (new Generator_Random()).generat_name((new Random()).nextInt(20)+20);
 nationality = (new Generator_Random()).generat_nationality((new Random()).nextInt(9));  
       
    Contact_Student_e_mail=firstname+" "+lastname+"@"+(new Generator_Random()).random_email();
      age =2022-year;
 
 Current_term=new Random().nextInt(8)+1 ;
 Current_term() ;
 Number_semesters_finished = Current_term-1 ;
 registration= first_year+"25"+Current_term+new Generator_Random().Contains_number(department)+number_Student;
 
 file.write(firstname+" "+middlename+" "+lastname+"\n");
    file.write("contact e_mail : " +Contact_Student_e_mail+"\n");
file.write("Mailing address : " + mailing_address+"\n"+"Postal code is : "+Postal_code +"\n"+"Student_mobile_number : "+Student_mobile_number+"\n"+"Student_home_phone_number : "+Student_home_phone_number+"\n");
file.write("Nationality : "+nationality+"\n");
file.write("First_term is : "+First_term +"\n"+"First_year : "+first_year+"\n"+"department : "+department+"\n"+"Current_term : "+Current_term+"\n"+"Number of semesters finished : " +Number_semesters_finished+"\n");       
file.write("the ID is "+ID +"\n");
file.close();
  add_number_of_nodes(4);
  printFinished_courses_to_file();
  accesesmethod();
 
individual_semester_GPAs();
 
Overall_GPA(); 
}
Student(boolean bol) throws IOException, Exception{
    super();
     FileWriter file= new FileWriter("studentcreation.txt",true);
        
     number_Student++ ;
     
      department="1";
     
      //  first_year();  
        First_term = 1 ;
    code_tutor = ((new Random()).nextInt(100000));
  
      Student_tutor_name = (new Generator_Random()).generat_name((new Random()).nextInt(20)+20);

      age =2022-year;
 

Input_Student();
 Number_semesters_finished = Current_term ;
registration= first_year+"25"+Current_term+new Generator_Random().Contains_number(department)+number_Student;
 file.write(firstname+" "+middlename+" "+lastname+"\n");
    file.write("contact e_mail : " +Contact_Student_e_mail+"\n");
file.write("Mailing address : " + mailing_address+"\n"+"Postal code is : "+Postal_code +"\n"+"Student_mobile_number : "+Student_mobile_number+"\n"+"Student_home_phone_number : "+Student_home_phone_number+"\n");
file.write("the ID is : "+ID +"\n");
file.write("the registration : "+registration+"\n");
file.write("Nationality : "+nationality+"\n");
file.write("First_term is : "+First_term +"\n"+"First_year : "+first_year+"\n"+"department : "+department+"\n"+"Current_term : "+Current_term+"\n"+"Number of semesters finished : " +Number_semesters_finished+"\n");       
file.close();
  add_number_of_nodes(4);
  printFinished_courses_to_file();
  accesesmethod();
  
individual_semester_GPAs();
 
Overall_GPA(); 
}

public void first_year(){
    if (age==19|age==20){
 first_year=2019+(22-age);
}else{
     first_year=(new Random().nextInt(4)+2019);
 }
}
public void Current_term(){
    if(age<21){
      Current_term = (age-17)*2;  
    }
}
public void individual_semester_GPAs() throws IOException{
     FileWriter file= new FileWriter("studentcreation.txt",true);
    for(int i = 0; i<Current_term-1;i++){
        individual_semester_GPAs[i] = new Random().nextDouble()+(new Random().nextInt(3)+1);
       
        file.write("\n"+"semester_GPA "+(i+1)+" : "+ String.valueOf(individual_semester_GPAs[i])+"\n");
    }
    file.close();
}
public void Overall_GPA() throws IOException{
     FileWriter file= new FileWriter("studentcreation.txt",true);
         for(int i = 0; i<Current_term-1;i++){
 Overall_GPA += individual_semester_GPAs[i];   
  }
         Overall_GPA=Overall_GPA/Current_term;
      file.write("Overall_GPA : "+String.valueOf(Overall_GPA)+"\n"+"________________________________"+"\n");
      file.close();
}
void Input_Student() throws IOException{
    FileWriter file = new FileWriter("student.txt",true);
    Scanner input = new Scanner(System.in) ;
    System.out.println("Enter your firstname");
    firstname = input.next();
    System.out.println("Enter your middlename");
    middlename = input.next();
 System.out.println("Enter your lastname");
    lastname= input.next();
    System.out.println("Enter your gender");
    Student_gender = input.next();
  System.out.println("Enter your Student_mobile_number");
  Student_mobile_number =input.next();
    System.out.println("Enter Student_home_phone_number");
    Student_home_phone_number = input.next();
    while(true){
      try{  
    Scanner inpute = new Scanner(System.in) ;  
   System.out.println(" Enter first year ");
    first_year = inpute.nextInt();
          System.out.println("Enter Current_term ");
          Current_term = inpute.nextInt();
          System.out.println("Enter department" );
          department = inpute.next();
    break;
      }catch(Exception e){
           System.out.println("Enter Integer number");
      }
    }
    while(true){
        System.out.println("Enter your birth date");
      try{  
    Scanner inpute = new Scanner(System.in) ;
    Day =inpute.nextInt() ;
    Month = inpute.nextInt();
    year = inpute.nextInt() ;
    Date = Day+"/"+Month+"/"+year;
    System.out.println("Enter your Street,Area,City,Country ");
   Street = input.next();
   Area = input.next();
   City = input.next();
   Country = input.next();
   break;
      }catch(Exception e){
          System.out.println("Enter Integer number");  
      }
    }
     while(true){
         System.out.println("Enter your number of flat,House");
    try{    
        Scanner inpute = new Scanner(System.in) ;
    flat = inpute.nextInt();
    House = inpute.nextInt() ;
     break;
      }catch(Exception e){
          System.out.println("Enter Integer number");  
      }
    }
     
    mailing_address = String.valueOf(House)+" "+Street+" "+Area+"  "+" "+City+" "+Country;
    System.out.println("Enter your ID");
    ID=input.next();
    System.out.println("Enter postal code ");
    Postal_code = input.next();
    System.out.println("Enter your nationality");
    nationality = input.next();
    System.out.println("Enter your e_mail to Contact with you");
    Contact_Student_e_mail = input.next();
 
          }
void info_student() throws IOException{
    FileWriter file = new FileWriter("student.txt",true);
    System.out.println(firstname+" "+middlename+" "+lastname);
    System.out.println("contact e_mail " +Contact_Student_e_mail);
    System.out.println(" Mailing address " + mailing_address+"\n"+"Postal code is "+Postal_code +"\n"+"Student_mobile_number"+Student_mobile_number+"\n"+"Student_home_phone_number"+Student_home_phone_number);
    System.out.println(" Nationality "+nationality);
    System.out.println(" registration number "+registration );
    System.out.println("First_term is "+First_term +"\n"+"First_year "+first_year+"\n"+"department "+department+"\n"+"Current_term "+Current_term+"\n"+"Number of semesters finished" +Number_semesters_finished);
   for(int i =0;i<Current_term;i++){
         System.out.println("GPA semester "+(i+1)+":" +individual_semester_GPAs[i]);    
   file.write(" GPA semester "+(i+1)+":" +individual_semester_GPAs[i]+"\n");
   }
   file.close();
   System.out.println("Overall GPA : "+ Overall_GPA);
    System.out.println("Student tutor name "+Student_tutor_name+"\n"+"code tutor "+code_tutor);
    
}
}