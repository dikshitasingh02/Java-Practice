import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    static int g = 90;//this will be shadowed at line 42
    public static void main(String[] args) {
        // Passing Example
        String man = "Iron Man";
        greet (man);

        // Greeting
        greeting();

        // Change value
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

        // Overloading
        fun(19);
        fun("Have Fun");
        int ans = sum(5,6,7);
        System.out.println(ans);

        // Scope
        int d = 10;
        int e = 9;
        String names = "Ram";
        {
           // int d = 50; // already initialized outside in the same method, hence you cannot initialize it again
            d = 20; // reassign the origin ref variable to some other value
            System.out.println(d);
            int f = 80;
            names = "Shyam";
            System.out.println(names);
            // values initialised in this block,will remain in block
        }

        // Shadowing
        System.out.println(g);
        //scope will begin when value is initialized
        int g = 95;//the line is shadowed
        System.out.println(g);
        fun2();

        // VarArgs
        // int he methods (int ...v) for any no of variable argument to be added

        //Questions
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean answ= isPrime(n);
        System.out.println(ans);

        for(int i = 100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    static void greet(String naam){
        System.out.println(naam);
    }

    static void greeting(){
        System.out.println("Hello World");
    }

    static void change(int[] nums){
        nums[0] = 90; // change to the object via this ref variable,same object will be changed.
    }

    static void fun(int x){
        System.out.println("first one");
        System.out.println(x);
    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }

    static int sum(int a ,int b){
        return a+b;
    }
    static int sum(int a ,int b,int c){
        return a+b+c;
    }

    static void fun2(){
        System.out.println(g);
    }

    //print all the 3 digit armstrong numbers
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n=n/10;
            sum = sum+rem*rem*rem;
        }
        return sum == original;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
