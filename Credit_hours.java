
package project_university;
import java.io.IOException;

public class Credit_hours extends Finished_courses {

    int Maximum_required, Finished_hours, Current_hours, remaining_hours;
    Current_course Cur;
    int p;

    Credit_hours() throws Exception{ //constructor no arrgument

            Cur = new Current_course();
            Maximum_required = 145;
            Current_hours = Cur.Course_credit_hours_Current_course;
            Finished_hours = Course_credit_hours_allfinishedcourse;
            remaining_hours = Maximum_required - Finished_hours - Current_hours;
            p = -remaining_hours + Maximum_required - Finished_hours;
        }
    
    
    void printCurrent_course() throws IOException {
        Cur.printCurrent_course();
    }
void accesesmethod() throws IOException{
    Cur.add_number_of_nodes(4);
    Cur.printCurrent_coursesto_file();
}
}
