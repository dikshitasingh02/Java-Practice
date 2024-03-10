import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        // Question 1
              Scanner input = new Scanner(System.in);
              System.out.println("Enter your Number:");
              int num = input.nextInt();
              if(num%2 ==0){
                  System.out.println(num+" is Even");
              }
              else{
                  System.out.println(num+" is Odd");
              }

        // Question 2
              Scanner input2 = new Scanner(System.in);
              System.out.println("Enter your name:");
              String name = input2.next();
              System.out.println("Hi "+name+",we're experiencing some technical difficulties at the moment. We're working on a fix and will update you as soon as possible. ");

        // Question 3
              Scanner input3 = new Scanner(System.in);
              System.out.println("Enter Principal:");
              int p = input3.nextInt();
              System.out.println("Enter Time:");
              int t = input3.nextInt();
              System.out.println("Enter Rate:");
              int r = input3.nextInt();
              int si =  (p*r*t)/100;
              System.out.println("Simple Interest is : "+si);

        // Question 4
              Scanner input4 = new Scanner(System.in);
              System.out.println("Enter First Number :");
              int n1 = input4.nextInt();
              System.out.println("Enter Second Number :");
              int n2 = input4.nextInt();
              System.out.println("Enter Operator :");
              char opr = input4.next().charAt(0);
              int ans=0;
              if (opr == '+') {
                  ans = n1 + n2;
              }
              if (opr == '-'){
                  ans= n1-n2;
              }
              if (opr == '*'){
                  ans= n1*n2;
              }
              if (opr == '/'){
                  ans= n1/n2;
              }
              else{
                 System.out.println("Invalid Operator");
              }
              System.out.println("Ans :"+ans);

        // Question 5
              Scanner input5 = new Scanner(System.in);
              System.out.println("Enter First Number :");
              int nu1 = input5.nextInt();
              System.out.println("Enter Second Number :");
              int nu2 = input5.nextInt();
              if (n1>n2){
                  System.out.println("Largest Number is :"+nu1);
              }
              else {
                  System.out.println("Largest Number is :"+nu2);
              }

        // Question 6
               Scanner input6 = new Scanner(System.in);
               System.out.println("Enter Indian Currency :");
               float ne1 = input6.nextFloat();
               double ne2 = n1/82.7523 ;
               System.out.println("USD :"+ne2);

        // Question 7
               Scanner input7 = new Scanner(System.in);
               int nm1=0,nm2=1,nm3;
               System.out.println("Enter Number :");
               int numb = input7.nextInt();
               System.out.print(nm1+" "+nm2);
               for(int n=2;n<numb;++n){
                   nm3=nm1+nm2;
                   System.out.print(" "+nm3);
                   nm1=nm2;
                   nm2=nm3;
               }

        // Question 8
               Scanner input8 = new Scanner(System.in);
               System.out.println("Enter String :");
               String str = input8.next().toLowerCase();
               boolean flag = true;
               for(int i = 0; i < str.length()/2; i++){
                    if(str.charAt(i) != str.charAt(str.length()-i-1)){
                        flag = false;
                        break;
                    }
               }
               if(flag=true) {
                   System.out.println("Given string is palindrome");
               }
               else {
                   System.out.println("Given string is not a palindrome");
               }
        // Question 9
              Scanner input9 = new Scanner(System.in);
              System.out.println("Enter First Number :");
              int nb1 = input9.nextInt();
              System.out.println("Enter Second Number :");
              int nb2 = input9.nextInt();
                for (int i = nb1; i<nb2; i++){
                    int check, rem, sum = 0;
                    check = i;
                    while(check != 0) {
                        rem = check % 10;
                        sum = sum + (rem * rem * rem);
                        check = check / 10;
                    }
                    if(sum == i){
                        System.out.println(i+" is an Armstrong number.");
                    }
                }
    }
}
