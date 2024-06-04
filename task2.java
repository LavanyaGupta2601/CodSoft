import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("---------WELCOME---------");
        System.out.println("-STUDENT GRADE CALCULATOR-");
    
        String[] subjects={"Hindi","English","Maths","Science","SocialScience","Computer"};
        int totalSubjects=subjects.length;

        int marks[]= new int[totalSubjects];
        int totalMarks=0;

        System.out.println("Enter marks of each subject(out of 100)");

        for(int i=0;i<totalSubjects;i++){
            System.out.print("Enter marks of "+subjects[i]+" : ");
            marks[i]=sc.nextInt();
            totalMarks += marks[i];
        }
    
        double avgPercentage=(double)totalMarks/totalSubjects;

        char grade;

        if(avgPercentage>=90){
            grade='A';
        }
        else if(avgPercentage>=80){
            grade='B';
        }
        else if(avgPercentage>=70){
            grade='C';
        }
        else if(avgPercentage>=50){
            grade='D';
        }
        else if(avgPercentage>=40){
            grade='E';
        }
        else{
            grade='F';
        }
       
        System.out.println("--REPORT CARD-");
        System.out.println("Total Marks(out of 600):"+ totalMarks );
        System.out.println("Average Percentage:"+ avgPercentage);
        System.out.println("Grade:"+ grade);
         
        
       sc.close();
    }
}
