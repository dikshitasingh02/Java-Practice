import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // About Arrays
        /*
        Syntax
        datatype[] variable_name = new datatype[size];
        or directly
        int[] rnos = {2,3,4,5};
         */
        int[] ros;// declaration of array ros is getting defined in the stack
        ros = new int[5]; // initialisation here object is being created in the memory (heap)

        // input
        // first simple way
        int[] arr = new int[3];
        arr[0] =23;
        arr[1] =50;
        arr[2] =25;

        // input using loop
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
       // System.out.println(Array.toString(arr)); to print array
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i] + " ");;
        }
        for(int num : arr){ // for every element in array,print the element
            System.out.println(num + " "); // here num represents elements of the row
        }

        // multidimensional array
        /*
        syntax
        int[][] arr = new int [3][];
        or directly
        int[][] arr = {
                 {1,2,3} // 0 index
                 {4,5} // 1st index
                 {6,7,8,9} // 2nd index -> arr[2] = {6,7,8,9}
             };
         */
        // input
        int[][] arra = new int[3][3];
        System.out.println(arr.length);
        for (int row = 0; row < arra.length; row++) {
            // for each col in every row
            for (int col = 0; col < arra[row].length; col++) {
                arra[row][col] = in.nextInt();
            }
        }

        // output
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

            for(int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }

        // col not fixed
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // arraylist
        /*
        syntax
        ArrayList<Integer> list = new ArrayList<>(5);
         */
        //input
        for(int i =0;i<5;i++){
            list.add(in.nextInt());
        }

        // get item at any index
        for(inti =0;i<5;i++){
            System.out.println(list.get(i)); // pass index here,list[index] syntax will not work here
        }
        System.out.println(list);

        //initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);

        // Questions
        //question 1-2
        int[] arr = {1, 3, 23, 9, 18, 56};
//        swap(arr, 0, 4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        //question3
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(maxRange(arr, 1, 3));
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {

        if (start > end) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
