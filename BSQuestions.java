public class BSQuestions {
    public static void main(String[] args) {
        // Question 1:Ceiling of a number
        // return the index of smallest no >= target
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);

        // Question 2:Floor of a number
        // return the index of greatest number <=target
        int[] arr2 = {2, 3, 5, 9, 14, 16, 18};
        int target2 = 15;
        int ans2 = flooring(arr2, target2);
        System.out.println(ans2);

        // Question 3:Smallest letter
        // solved in function directly nextgreatestletters

        // Question 4:First and last position
        // solved in function directly searchrange

        // Question 5:find target in infinite array
        int[] arr5 = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target5 = 10;
        System.out.println(ans5(arr5, target5));
    }

    static int ceiling(int[] arr,int target){
        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }

    static int flooring(int[] arr,int target){
        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }

    public char nextgreatestletter(char[] letters,char target){
        int start =0;
        int end = letters.length-1;
        while(start <= end ){
            //find the middle element
            int mid = start+(end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return letters[start%letters.length];
    }

    public int[] searchrange(int[] nums,int target){
        int[] ans = {-1,-1};
        // check for first occurence if target first
        ans[0] = search(nums,target,true);
        if(ans[0] != -1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }
    // this function just returns the index vale of target
    int search(int[] nums,int target,boolean findstartindex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(findstartindex){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    static int ans5(int[]arr,int target){
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end =1;

        //condition for the target to lie in range
        while(target>arr[end]){
            int temp = end+1; // this is my new start
            // double the box vale end = end+sideofbox*2
            end = end+(end-start+1)*2;
            start = temp;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start <= end){
            // find the middle element
            int mid = start+(end-start)/2;

            if(target<arr[mid]){
                end= mid +1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
