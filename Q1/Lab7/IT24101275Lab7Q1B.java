import java.util.Scanner;
public class IT24101275Lab7Q1B
{
       public static void main(String[] args)
       {

       Scanner input = new Scanner(System.in);

       int i;
       int mark1 ,mark2 ,mark3 ,mark4;
       double average;

       for(i = 1; i <= 3; i = i + 1)
       {
           System.out.println("Student" + i);
           System.out.print("Enter marks :" + " ");
           mark1 = input.nextInt();
           mark2 = input.nextInt();
           mark3 = input.nextInt();
           mark4 = input.nextInt();
           
           average = (mark1 + mark2 + mark3 + mark4) / 4.0;

           System.out.println("Average is :" + average);
           
           if(average <= 100 && average >= 75)
           {
              System.out.println("Overall Grade is : Distinction");
           }

           else if(average <= 74 && average >= 50)
           {
              System.out.println("Overall Grade is : Credit");  
           }

           else 
           {
              System.out.println("Overall Grade is : Fail");
           }

           System.out.println("\n");
       
       }

       }

}