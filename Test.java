package Theory.Assignment2;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        int pass=0;
        int fail=0;

        //Taking Input of Total Students
        System.out.print("Enter Total Entries of Students  :");
        int no = input.nextInt();
        Student[] student = new Student[no];

        //Getting Data from User
        for (int i = 0; i < student.length; i++) {
            System.out.println("---------------------------------------");
            System.out.println("    ENTER DATA OF STUDENT " + (i + 1) );
            System.out.println("---------------------------------------");
            System.out.print("Enter ID of Student "+(i+1)+" : ");
            int id = input.nextInt();

            System.out.print("Enter Name Of Student "+(i+1)+" : ");
            String name = inputString.nextLine();

            //Creating Student Object
            student[i] = new Student(id, name,null);

            //Calling Functions
            student[i].calculateQuizMarks();
            student[i].Assignment();
            student[i].MidTermMarks();
            student[i].finalTermMarks();
        }

        //Displaying Student Data
        System.out.println(" --------- PRINTING STUDENT DATA  ---------");
        for(int i=0;i<student.length;i++)
        {
            System.out.print(" --------- DATA OF STUDENT "+(i+1)+" ---------\n");
            System.out.print("ID of Student "+(i+1)+" : "+student[i].getId()+"\n");
            System.out.print("Name of Student "+(i+1)+" : "+student[i].getName()+"\n");
            student[i].displayQuizMarks();
            student[i].displayAssignmentMarks();
            student[i].displayMidMarks();
            student[i].displayFinalMarks();
            student[i].totalMarksObtained();
            System.out.print("Status of Student: "+student[i].checkingStatus()+"\n");

            if(student[i].checkingStatus()=="Pass"){
                pass++;
            }
            else if(student[i].checkingStatus()=="Fail"){
                fail++;
            }
        }
        System.out.print("Collective Passed Students: "+pass+"\n");
        System.out.print("Collective Failed Students: "+fail);



    }
}
