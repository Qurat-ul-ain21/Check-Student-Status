package Theory.Assignment2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Student {
    Scanner input = new Scanner(System.in);
    //private attributes
    private int id;
    private String name;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus()
    {
        return status;
    }

    public Student(int id, String name, String status) {
        this.id=id;
        this.status=checkingStatus();
        this.name=name;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    //creating methods;
    //for quiz:
    double Mid,finals,quiz,Assignment,obtained;
    double sumOfQuiz=0;
    double AssTotal=0;
    //double

    public void calculateQuizMarks() {

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Total Marks of Quiz"+(i+1)+" :");
            double total=input.nextDouble();
            System.out.print("Enter Obtained Marks of Quiz" + (i+1) + " :");
            quiz = input.nextDouble();
            quiz = quiz*(3.5/total);
            sumOfQuiz+=quiz;
        }

    }
    public void displayQuizMarks(){
        System.out.println("Total Marks in quiz are:"+sumOfQuiz);
    }

    public void Assignment() {
        for (int j = 0; j < 4; j++) {
            System.out.print("Enter Total Marks of Assignment "+(j+1)+" :");
            double total=input.nextDouble();
            System.out.print("Enter Obtained Marks of Assignment "+(j+1)+" :");
            Assignment = input.nextDouble();

            Assignment = Assignment*(2.5/total);
            AssTotal+=Assignment;
        }

    }
    public void displayAssignmentMarks(){
        System.out.print("Total Marks of Assignment: "+AssTotal+"\n");
    }
    public void MidTermMarks() {
        System.out.print("Total Marks in Mid Term:");
        double Total=input.nextDouble();
        System.out.print("Marks Obtained in Mid Term:");
        Mid = input.nextDouble();

        Mid=Mid*(25/Total);

    }
    public void displayMidMarks(){

        System.out.println("Obtained Mid-Term Marks"+ Mid+"\n");
    }
    public void finalTermMarks(){
        System.out.print("Enter total marks in Finals :");
        double Total=input.nextDouble();
        System.out.print("Obtained Marks in Finals :");
        finals=input.nextDouble();

        finals=finals*(50/Total);
    }
    public void displayFinalMarks(){
        System.out.print("Total Marks In Final Exam: "+finals+ "\n");
    }
    public void totalMarksObtained() {
        obtained = sumOfQuiz + AssTotal + Mid + finals;
        System.out.print("Obtained Total In Final Exam: "+obtained+ "\n");

    }
    public String checkingStatus(){
        if(obtained<50&&obtained>0)
        {
            setStatus("Fail");


        }
        else if(obtained>50)
        {
            setStatus("Pass");

        }

        return status;
    }

}