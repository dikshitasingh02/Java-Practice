import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Basic{
    public static void main(String[] args) {
        //inputs in java
          Scanner input = new Scanner(System.in);
        //int input
          int rollno = input.nextInt();
          System.out.println(rollno);
         // Q sum of two numbers
           System.out.println("Enter First Number");
           int num1 = input.nextInt();
           System.out.println("Enter Second Number");
           int num2 = input.nextInt();
           int sum = num1+num2;
           System.out.println("Sum ="+sum);
          // example of type promotion
           byte b =42;
           char d = 't';
           short s = 2024;
           int i = 70000;
           float f =6.57f;
           double c = 0.3214;
           double result = (f*b)+(i/d)-(c*s);
           System.out.println((f*b)+" "+(i/d)+" "+(c*s));
           System.out.println(result);
           //
        }
    }
