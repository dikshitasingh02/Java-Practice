import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Basic{
    public static void main(String[] args) {
        //inputs in java
          Scanner input = new Scanner(System.in);
        //int input
          int roll = input.nextInt();
          System.out.println(roll);
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
           // Q celcius to fahranheit program
           float tempC = input.nextFloat();
           float tempF = (tempC*9/5)+32;
           System.out.println(tempF);
           // example of if statement
           int a = 10;
           if (i==10){
               System.out.println("Hello");
           }
           // example of while loop
            a =1;
            while (i==10){
                System.out.println(i);
                a++;
            }
            // example of for loop
             for (int g=1;g==10;g++){
                 System.out.println(c);
             }
        }
    }
