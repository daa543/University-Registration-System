

package project_university;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Project_University extends JFrame   {


    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {

        boolean bool = true;
        int result = 0;

          while(bool) {
         System.out.println("Enter(1) to creat data to test program"+"\n"+"Enter(2) to enter your data"+"\n"+"Enter(0) to exit from program");
        
        
         while (true) {
         try {
         Scanner input = new Scanner(System.in) ;
         result = input.nextInt();
         break ;
         }catch (Exception e) {System.out.println("Enter number pleas");}}
         if(result ==0){
         bool=false;
         } else if(result==1){
         creat_data();
         Student.number_Student=0;
         }else if(result==2){
         Enterdata();
                
                
         }
         }
    }

    public static void add_number_payments(int num, Student array[], int index) throws Exception {
        for (int i = 0; i < num; i++) {
            array[index].add_payments();

        }
        array[index].printArray_of_Transaction();
    }

    public static void creat_data() throws IOException, Exception {

        boolean t = true;
        int num;
        int result;
        
        System.out.println("Enter number of student to test program in it");
     
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                num = input.nextInt();
             
                exciption(num);
                break;
            } catch (Exception e) {
                System.out.println("Enter number greater than 01 pleas");
            }
        }
        Student[] array = new Student[num];
        for (int counter = 0; counter < num; counter++) {
            array[counter] = new Student();
            array[counter].add_number_of_nodes(4);
        }
        while (t) {

            while (true) {
                try {
                    System.out.println("this is registration number to test : " + array[new Random().nextInt(num)].registration);

                    System.out.println("Enter registration for student ");
      
                    Scanner input = new Scanner(System.in);
                    String result0 = new String();
                    result0 = input.next();
             
                    int u = Integer.valueOf(result0.substring(9));
                    if (result0.equalsIgnoreCase(array[(u - 1)].registration)) {
                        while (true) {
                            System.out.println("Enter (1) to print information of student" + "\n" + "Enter (2) to print information payment of student" + "\n" + "Enter (3)to print information course of student");
                            try {
                                
                                Scanner input0 = new Scanner(System.in);
                                result = input0.nextInt();
                                break;
                            } catch (Exception e) {
                                System.out.println("pleas enter Integer");
                            }
                        }
                        if (result == 1) {

                            array[u - 1].info_student();
                        } else if (result == 2) {
                            add_number_payments(2, array, u - 1);
                        } else if (result == 3) {
                            array[u - 1].printCurrent_course();
                            array[u - 1].printFinished_courses();
                            System.out.println("remaining hours : " + (145-(array[u - 1].Course_credit_hours_allfinishedcourse+array[u-1].Current_hours)));
                        } else {

                            System.out.println("your choice is not a valid");
                        }
                        t = false;
                        break;
                    } else {
                        System.out.println("the registration is not exist");
                        break;
                    }
                } catch (java.lang.StringIndexOutOfBoundsException e) {
                    System.out.println("this numer is not allow" + num);
                }

            }

        }

    }

    public static void Enterdata() throws IOException, Exception {

        System.out.println("Enter number of student to test program in it");
        int num;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                num = input.nextInt();
                exciption(num);
                break;
            } catch (Exception e) {
                System.out.println("Enter number pleas");
            }
        }
        
        Student[] array = new Student[num];
FileWriter file = new FileWriter("studentcreation.txt",true);
file.write("(Data your are enter)"+"\n"+"*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-"+"\n");
        for (int counter = 0; counter < num; counter++) {
            array[counter] = new Student(true);
            array[counter].input_payment(2);
 }
        while(true){
        try{    
        
        System.out.println("Enter your registration number");
        String num_R = new String();
       Scanner inpute = new Scanner(System.in);
         num_R =inpute.next();
       //(u) = number of student
       int u = Integer.valueOf(num_R.substring(9));
      
                    if (num_R.equalsIgnoreCase(array[(u - 1)].registration)){
        System.out.println("Enter(1) to print information of student" + "\n" + "Enter(0) to dont print it");
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                int num0 = input.nextInt();
                if (num0 == 1) {
                    print_Enterdata(array, num);
                    break;
                } else if(num0==0)  {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Enter number pleas");
            }
        }
        break;
             }else{
                        System.out.println("your registration numer is incorrect ");     
                    }
        }catch(Exception e){
            System.out.println("try to enter another numer");
        }
    }
    }
    public static void print_Enterdata(Student array[], int num) throws IOException {

        for (int i = 0; i < num; i++) {

            array[i].info_student();
            array[i].printArray_of_Transaction();
            array[i].printCurrent_course();

            array[i].printFinished_courses();
        }

    }

    static void exciption(int num) throws Exception {
        if (num <= 0) {
            throw new Exception();
        }
    }

}
