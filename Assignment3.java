
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        // Question 1
                Scanner in = new Scanner(System.in);
                System.out.println("Enter First No. :");
                int n1 = in.nextInt();
                System.out.println("Enter Second No. :");
                int n2 = in.nextInt();
                System.out.println("Enter Third No. :");
                int n3 = in.nextInt();
                int max = max(n1,n2,n3);
                System.out.println("Maximum of three Numbers is :"+max);
                int min = min(n1,n2,n3);
                System.out.println("Minimum of three Numbers is :"+min);

        // Question 2
                Scanner in2 = new Scanner(System.in);
                System.out.println("Enter your number:");
                int n = in2.nextInt();
                odev(n);

        // Question 3
                Scanner in3 = new Scanner(System.in);
                System.out.println("Enter your Age:");
                int a = in3.nextInt();
                age(a);

        // Question 5
                Scanner in4 = new Scanner(System.in);
                System.out.println("Enter First No. :");
                int nu1 = in4.nextInt();
                System.out.println("Enter Second No. :");
                int nu2 = in4.nextInt();
                int product = product(nu1,nu2);
                System.out.println("Product of two no. is :"+product);

        // Question 6
                Scanner in5 = new Scanner(System.in);
                System.out.println("Enter the radius of circle :");
                float r = in5.nextFloat();
                double area = area(r);
                System.out.println("Area of Circle :"+area);
                double peri = peri(r);
                System.out.println("Circumference pf Circle :"+peri);

        // Question 7
                Scanner in6 = new Scanner(System.in);
                System.out.println("Enter the number:");
                int nu = in6.nextInt();
                prime(nu);

        // Question 8
                Scanner in7 = new Scanner(System.in);
                System.out.println("Enter your marks out of 100:");
                int m = in7.nextInt();
                String marks = marks(m);
                System.out.println("Your Grade is :"+marks);

        // Question 9
                Scanner in8 = new Scanner(System.in);
                System.out.println("Enter number :");
                int ne = in8.nextInt();
                int fact = fact(ne);
                System.out.println("Factorial of "+ne+" is :"+fact);

        // Question 10
                Scanner in9 = new Scanner(System.in);
                System.out.println("Enter Number :");
                int ne2 = in9.nextInt();
                palindrome(ne2);

        // Question 12
                Scanner in10 = new Scanner(System.in);
                System.out.println("Enter first Side :");
                int s1 = in10.nextInt();
                System.out.println("Enter second Side :");
                int s2 = in10.nextInt();
                System.out.println("Enter third Side :");
                int s3 = in10.nextInt();
                phy(s1,s2,s3);

        // Question 13
                Scanner in11 = new Scanner(System.in);
                System.out.println("Enter number :");
                int num = in11.nextInt();
                int sum = sum(num);
                System.out.println("The sum is :"+sum);
    }

    static int max(int n1,int n2,int n3) {
        int max = n1;
        if (n2 > max) {
           max = n2;
        }
        if(n3 > max){
            max = n3;
        }
        return max;
    }
    static int min(int n1,int n2,int n3) {
        int min = n1;
        if (n2 < min) {
            min = n2;
        }
        if(n3 < min){
            min = n3;
        }
        return min;
    }
    static void odev(int n){
        if(n%2 ==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
      static void age(int a){
          if(a>18){
            System.out.println("You are eligible for Voting.");
        }
        else{
            System.out.println("You are not eligible for Voting.");
        }
      }
    static int product(int nu1,int nu2){
        return nu1*nu2;
    }
    static double area(float r){
        return 3.14*r*r;
    }
    static double peri(float r){
        return 2*3.14*r;
    }
    static void prime(int nu){
        if(nu<=1){
            System.out.println("Not Prime");
        }
        else {
            for (int i = 2; i <= nu / 2; i++) {
                if (nu % i == 0) {
                    System.out.println("Not Prime");
                } else {
                    System.out.println("Is Prime Number");
                }
            }
        }
    }
    static String marks(int m){
        String marks;
        if(m<=100 && m>=91){
           marks = "AA";
        }
        else if(m<=90 && m>=81){
            marks = "AB";
        }
        else if(m<=80 && m>=71){
            marks = "BB";
        }
        else if(m<=70 && m>=61){
            marks = "BC";
        }
        else if(m<=60 && m>=51){
            marks = "CD";
        }
        else if(m<=50 && m>=41){
            marks = "DD";
        }
        else {
            marks = "Fail";
        }
        return marks;
    }
    static int fact(int ne){
        int fact=1;
        if(ne==0 || ne == 1){
            fact = 1;
        }
        else{
            for (int i = 2; i <=ne ; i++) {
                fact*=i;
            }
        }
        return fact;
    }
    static void palindrome(int ne2){
        int reverse = 0;
        int temp = ne2;
        while(temp>0){
            int lastdigit = temp%10;
            reverse = reverse*10+lastdigit;
            temp = temp/10;
        }
        if(ne2 == reverse){
            System.out.println("Is a Palindrome number.");
        }
        else{
            System.out.println("Not a Palindrome number");
        }
    }
    static Void phy(int s1,int s2,int s3){
        int x = s1*s1;
        int y = s2*s2;
        int z = s3*s3;
        if (x == y+z || y == x+z || z == x+y){
            System.out.println("It is a Pythagorean Triplet. ");
        }
        return null;
    }
    static int sum(int num){
        int sum =0;
        for (int i = 1; i <= num ; i++) {
            sum = sum +i;
        }
        return sum;
    }

}
