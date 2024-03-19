public class LSQuestions {
    public static void main(String[] args) {
        // Question 1:search in string
        String name = "Dikshita";
        char target ='t';
        System.out.println(search(name,target));

        // Question 2:search in range
        int[] arr = {16,18,19,27,7,3};
        int target2 = 7;
        System.out.println(rangesearch(arr,target,1,4));

        // Question 3:search in 2d array
        int[][] arr2 = {
                {23, 4, 1},
                {19, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target3 =19;
        int[] ans = search2(arr2,target); // format of return value{row,col}
        System.out.println((ans));
        System.out.println(max(arr2));
        System.out.println(Integer.MIN_VALUE);

        // Question 4:find min
        int[] arr3 = {18, 12, 7, 3, 14, 28};
        System.out.println(min(arr));

        // Question 5:even digits
        int[] nums = {12,345,2,6,7896};
//        System.out.println(findNumbers(nums));
        System.out.println(digits2(-345678));

        // Question 6:max wealth

    }

    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static int rangesearch(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        //run a for loop
        for(int i = start;i<=end;i++){
            //check for element at every index if it is = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }

    static int[] search2(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int findnumbers(int[] nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    // count number of digits in a number
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }

    public int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
