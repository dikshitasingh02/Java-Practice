import java.util.Scanner;

public class Conditions_loops {
    public static void main(String[] args) {
        // Q= Find largest of 3 numbers
                Scanner input = new Scanner(System.in);
                System.out.println("Enter First Number");
                int n1 = input.nextInt();
                System.out.println("Enter Second Number");
                int n2 = input.nextInt();
                System.out.println("Enter Third Number");
                int n3 = input.nextInt();
                int max = Math.max(n1, n2);
                if (n3>max){
                    max = n3;
                }
                System.out.println("Largest Number :"+max);

        // Q= Alphabet case check
                Scanner input2 = new Scanner(System.in);
                System.out.println("Enter your Alphabet");
                char ch = input2.next().trim().charAt(0);
                if (ch>='a' && ch<='z'){
                    System.out.println("Alphabet is Lowercase");
                }
                else{
                    System.out.println("Alphabet is Uppercase");
                }

        // Q= Find fibonacci numbers
                Scanner input3 = new Scanner(System.in);
                int n = input3.nextInt();
                int a =0;
                int b = 1;
                int count =2;
                while(count<=n){
                    int temp = b;
                    b = b+a;
                    a = temp;
                    count++;
                }
                System.out.println(b);

        // Q= Count numbers
                Scanner input4 = new Scanner(System.in);
                System.out.println("Enter the Numbers");
                int num = input4.nextInt();
                System.out.println("Number to find");
                int num2 = input4.nextInt();
                int cont =0;
                while(num>0){
                    int rem = num%10;
                    if (rem == num2){
                        cont++;
                    }
                    num= num/10;
                }
                System.out.println("The number "+num2+" has occurred "+cont+" times");

        // Q= Reverse numbers
               Scanner input5 = new Scanner(System.in);
               System.out.println("Enter the Numbers");
                int numb = input5.nextInt();
                int ans = 0;
                while(numb>0) {
                    int rem = numb % 10;
                    numb /= 10;
                    ans = ans * 10 + rem;
                }
                System.out.println("Reverse of number is "+ans);

        // Q= Calculator program
                Scanner input6 = new Scanner(System.in);
                int answ =0;
                while(true){
                    System.out.println("Enter the operator :");
                    char op = input6.next().trim().charAt(0);
                    if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                        System.out.print("Enter two numbers: ");
                        int numb1 = input6.nextInt();
                        int numb2 = input6.nextInt();

                        if (op == '+') {
                            answ = numb1 + numb2;
                        }
                        if (op == '-') {
                            answ = numb1 - numb2;
                        }
                        if (op == '*') {
                            answ = numb1 * numb2;
                        }
                        if (op == '/') {
                            if (numb2 != 0) {
                                answ = numb1 / numb2;
                            }
                        }
                        if (op == '%') {
                            answ = numb1 % numb2;
                        }
                    } else if (op == 'x' || op == 'X') {
                        break;
                    } else {
                        System.out.println("Invalid operation!!");
                    }
                    System.out.println(answ);
                }
    }
}
