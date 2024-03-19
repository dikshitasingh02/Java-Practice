public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {20,23,1,2,19,-3,-11};
        int target = 19;
        int ans = linearSearch(nums,target);
    }

    // search in the array:return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        //this line execute if none statement above returns
        //target not found
        return -1;
    }

    //search the target and return the element
    static int linearsearch2(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return Integer.MAX_VALUE;
    }

    //search the target and return true or false
    static boolean linearsearch3(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }

        //run a for loop
        for(int element : arr){
            if(element == target){
                return true;
            }
        }
        //this line will execute if none of the return statements above have executed
        return false;
    }
}
