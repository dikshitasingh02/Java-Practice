import java.util.Objects;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        //Basic Programs
        // Question1-7
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the shape of which you want area :");
                String shape = input.next();
                double area;
                if(shape.equals("circle")){
                    System.out.println("Enter Radius :");
                    float r = input.nextInt();
                    area = 3.14*r*r;
                    System.out.println("Area of Circle is :"+area);
                }
                if(shape.equals("triangle")){
                    System.out.println("Enter Height :");
                    float h = input.nextInt();
                    System.out.println("Enter Base :");
                    float b = input.nextInt();
                    area = (double) 1 /2*b*h;
                    System.out.println("Area of Triangle is :"+area);
                }
                if(shape.equals("rectangle")){
                    System.out.println("Enter Length :");
                    float l = input.nextInt();
                    System.out.println("Enter Breadth :");
                    float br = input.nextInt();
                    area = l*br;
                    System.out.println("Area of Rectangle is :"+area);
                }
                if(shape.equals("rhombus")){
                    System.out.println("Enter diagonal1 :");
                    float d1 = input.nextInt();
                    System.out.println("Enter diagonal2 :");
                    float d2 = input.nextInt();
                    area = (double) 1 /2*d1*d2;
                    System.out.println("Area of Rhombus is :"+area);
                }
                if(shape.equals("equilateral triangle")){
                    System.out.println("Enter oneside :");
                    float a = input.nextInt();
                    area = 0.8660*a*a;
                    System.out.println("Area of Equilateral Triangle is :"+area);
                }
                else{
                    System.out.println("Invalid shape");
                }
        // Question 8-13
                Scanner input2 = new Scanner(System.in);
                System.out.println("Enter the shape of which you want Perimeter :");
                String shapes = input2.next();
                double peri;
                if(shapes.equals("circle")){
                    System.out.println("Enter Radius :");
                    float r = input2.nextInt();
                    peri = 2*3.14*r;
                    System.out.println("Perimeter of Circle is :"+peri);
                }
                if(shapes.equals("equilateral triangle")){
                    System.out.println("Enter side :");
                    float s = input2.nextInt();
                    peri = 3*s;
                    System.out.println("Perimeter of Equilateral Triangle is :"+peri);
                }
                if(shapes.equals("parallelogram")){
                    System.out.println("Enter Height :");
                    float h = input2.nextInt();
                    System.out.println("Enter Breadth :");
                    float b = input2.nextInt();
                    peri = 2*(h*b);
                    System.out.println("Perimeter of Parallelogram is :"+peri);
                }
                if(shapes.equals("square")){
                    System.out.println("Enter side :");
                    float s = input2.nextInt();
                    peri = 4*s;
                    System.out.println("Perimeter of Square is :"+peri);
                }
                else{
                    System.out.println("Invalid shape");
                }
        // Question 14-18
        //Volume od prism,cylinder,sphere,pyramid

        // Question 24
                Scanner input3 = new Scanner(System.in);
                int sum = 0;
                int x=0;
                while (x >=0) {
                    System.out.println("Enter a number :");
                     x = input3.nextInt();
                    if (x >0) {
                        sum = sum + x;
                        System.out.println(sum);
                    }
                    else {
                        System.out.println("terminated");
                        break;
                    }
                    System.out.println("Sum of entered Number is :"+sum);
                }

        // Question 25
                Scanner input4 = new Scanner(System.in);
                int max =0;
                while(true){
                    System.out.println("Enter the Number :");
                    int n= input4.nextInt();
                    if (n>max) {
                       max = n;
                    }
                    if (n == 0  ) {
                        break;
                    }
                    System.out.println("Maximum Number is :"+max);
                }

        // Intermediate Programs
        // Question 2
                Scanner input5 = new Scanner(System.in);
                System.out.println("Enter your Consumption in kwh");
                float e=input5.nextFloat();
                float bill = e*6;
                System.out.println("Your Electricity Bill is Rs."+bill);

        // Question 3
                Scanner input6 = new Scanner(System.in);
                int n,count =1;
                float y,average,sums =0;
                System.out.println("Enter value of n ");
                n = input6.nextInt();
                while(count<=n){
                    System.out.println("enter the "+count+"number");
                    y = input6.nextInt();
                    sums += y;
                    ++count;
                }
                average = sums/n;
                System.out.println("the average is :"+average);

        // Question 19
                Scanner input7 = new Scanner(System.in);
                int hcf=0;
                System.out.println("Enter your first number:");
                int a = input7.nextInt();
                System.out.println("Enter your second number:");
                int b = input7.nextInt();
                for (int i=0;i<=a || i <=b;i++){
                    if(a%i == 0 && b%i ==0)
                        hcf = i;
                }
                System.out.println("HCF of given two numbers is: "+hcf);

        // Question 20
                Scanner input8 = new Scanner(System.in);
                int gcd =1;
                System.out.println("Enter your first number:");
                int a1 = input8.nextInt();
                System.out.println("Enter your second number:");
                int b1 = input8.nextInt();
                for (int i = 1;i<=a1 && i<=b1;++i){
                    if (a1%i == 0 && b1%i == 0){
                        gcd =i;
                    }
                }
                int lcm = (a*b)/gcd;
                System.out.println("The LCM of "+a1+" and "+b1+" numbers is :"+lcm);

        // Question 26
                Scanner input9 = new Scanner(System.in);
                int nsum = 0; int esum = 0;int osum = 0;
                System.out.println("Enter Numbers:");
                while(true){
                    int n1 = input9.nextInt();
                    if(n1 == 0){
                        break;
                    }
                    if (n1<0){
                        nsum+=n1;
                    }
                    else if (n1%2 == 0){
                        esum+=n1;
                    }
                    else{
                        osum+=n1;
                    }
                }
                System.out.println("Negative No. Sum = "+nsum);
                System.out.println("Positive Even No. Sum = "+esum);
                System.out.println("Posiive Odd No. Sum = "+osum);
    }
}
