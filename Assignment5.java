public class Assignment5 {
    //Easy Question of BinarySearch

    // Question 1
    class Solution1 {
        public int mySqrt(int x) {
            // For special cases when x is 0 or 1, return x.
            if (x == 0 || x == 1)
                return x;

            // Initialize the search range for the square root.
            int start = 1;
            int end = x;
            int mid = -1;

            // Perform binary search to find the square root of x.
            while (start <= end) {
                // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.
                mid = start + (end - start) / 2;

                // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
                if ((long) mid * mid > (long) x)
                    end = mid - 1;
                else if (mid * mid == x)
                    // If the square of the middle value is equal to x, we found the square root.
                    return mid;
                else
                    // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
                    start = mid + 1;
            }

            // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
            // However, since we might have been using integer division in the calculations,
            // we round down the value of "end" to the nearest integer to get the correct square root.
            return Math.round(end);
        }
    }

    // Question 2
    public class Solution2 extends GuessGame {
        public int guessNumber(int n) {
            int s = 1;
            int e = n;

            while(s<=e){
                int mid = s + (e-s)/2;
                if(guess(mid)== 0)return mid;
                else if (guess(mid) == 1){
                    s = mid+1;
                }
                else{
                    e = mid - 1;
                }
            }
            return -1;
        }
    }

    // Question 3
    public class Solution3 extends VersionControl {
        public int firstBadVersion(int n) {
            int s = 0;
            int e = n;

            while(s<=e){
                int mid = s + (e-s)/2;
                if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)return mid;
                else if (isBadVersion(mid)==false){
                    s = mid+1;
                }
                else{
                    e = mid - 1;
                }
            }
            return -1;
        }
    }

    // Question 4
    class Solution4 {
        public int[] twoSum(int[] numbers, int target) {
            int l = 0, r = numbers.length - 1;

            while (numbers[l] + numbers[r] != target) {
                if (numbers[l] + numbers[r] < target) l++;
                else r--;
            }

            return new int[] {l+1, r+1};
        }
    }

    // Question 5
    class Solution5 {
        public boolean isPerfectSquare(int num) {
            long start = 0, end = num;
            while (start <= end) {
                long mid = start + (end - start) / 2, square = mid * mid;
                if (square < num) {
                    start = mid + 1;
                } else if (square > num) {
                    end = mid - 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

    // Question 6
    class Solution6 {
        public int arrangeCoins(int n) {
            long left = 0; // we use "long" because we may get an integer overflow
            long right = n;
            while(left <= right){
                long pivot = left + (right - left) / 2;
                long coinsUsed = pivot * (pivot + 1)/2;
                if(coinsUsed == n){
                    return (int)pivot;
                }
                if(n < coinsUsed){
                    right = pivot-1;
                }
                else{
                    left = pivot + 1;
                }
            }
            return (int)right; // cast as an "int" because it was initiliazed as a "long"
        }
    }

    // Question 7
    class Solution7 {
        public char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;

            while(start <= end) {
                // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                int mid = start + (end - start) / 2;

                if (target < letters[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return letters[start % letters.length];

        }
    }

    // Question 8
    class Solution8 {
        public int findKthPositive(int[] arr, int k) {
            int n = arr.length;
            int low=0; int high = n-1;
            while(low<=high){
                int mid = (low+high)/2;
                int missing = arr[mid] - (mid+1);

                if(missing<k){
                    low=mid+1;
                } else{
                    high= mid-1;
                }
            }
            return high+1+k;
        }
    }

    // Question 9
    class Solution9 {
        public int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;

            while (start <= end) {
                int mid = start + (end-start)/2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target) end = mid-1;
                else start = mid+1;
            }

            return start;
        }
    }

    // Question 10
    class Solution10 {
        public int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid+1]) {
                    // you are in dec part of array
                    // this may be the ans, but look at left
                    // this is why end != mid - 1
                    end = mid;
                } else {
                    // you are in asc part of array
                    start = mid + 1; // because we know that mid+1 element > mid element
                }
            }
            return start;
        }
    }

    // Question 11
    class Solution11 {
        public int countNegatives(int[][] grid) {
            int count = 0;
            for(int i = grid.length - 1; i >= 0; i--) {
                for(int j = grid[0].length - 1; j >= 0; j--) {
                    if(grid[i][j] < 0) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            return count;
        }
    }

    // Question 12
    class Solution12 {
        public int[] intersection(int[] nums1, int[] nums2) {
            ArrayList<Integer> arr = new ArrayList<>();

            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0, j = 0;
            while(i<nums1.length && j<nums2.length){
                if(nums1[i]<nums2[j]){
                    i++;
                }else if(nums1[i]>nums2[j]){
                    j++;
                }else{
                    if(!arr.contains(nums1[i])){
                        arr.add(nums1[i]);
                    }
                    i++;j++;
                }
            }

            int[] ans = new int[arr.size()];
            for(int ik=0;ik<ans.length;ik++){
                ans[ik] = arr.get(ik);
            }
            return ans;
        }
    }

    // Question 13
    class Solution13 {
        public int[] intersect(int[] nums1, int[] nums2) {
            if(nums2.length < nums1.length){
                return intersect(nums2, nums1);
            }

            Arrays.sort(nums1);
            Arrays.sort(nums2);

            List<Integer> result = new ArrayList<>();
            int leftIndex = 0;
            for(int num: nums1){
                int index = binarySearch(nums2, num, leftIndex);

                if(index != -1){
                    result.add(num);
                    leftIndex = index + 1;
                }
            }

            return result.stream().mapToInt(Integer::intValue).toArray();
        }

        private int binarySearch(int[] nums, int target, int left){
            int right = nums.length - 1;
            int index = -1;

            while(left <= right){
                int middle = left + (right - left) / 2;

                if(nums[middle] == target){
                    index = middle;

                    right = middle - 1;
                } else if(nums[middle] > target){
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }

            return index;
        }
    }

    // Question 14
    class Solution14 {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int aliceTotal=0;
            int bobTotal=0;
            for (int aa : aliceSizes) {
                aliceTotal += aa;
            }
            for (int bb : bobSizes) {
                bobTotal += bb;
            }
            // Now iterate aliceSize array and then try to find out target so that we can do
            // binary search.

            for (int i = 0; i < aliceSizes.length; i++) {
                // here we will use some mathmatics to find mid value;
                /*
                 * see as previouse example I explained very well. aliceTotal - aliceSizes[i] +
                 * bobSizes[j] = bobTotal - bobSizes[j]+aliceSizes[i] aliceTotal = bobTotal +
                 * aliceSizes[i] + aliceSizes[i] - bobSizes[j]-bobSizes[j] aliceTotal = bobTotal
                 * + 2 * aliceSizes[i] - 2* bobSizes[j];
                 *
                 * 2 bobSizes[j] = bobTotal - aliceTotal + 2 * aliceSizes[i]; bobSizes[j] =
                 * (bobTotal - aliceTotal + 2 * aliceSizes[i])/2
                 */

                /*
                 * Here in this case we will take bobsize array as target to do binar search.
                 * Hence we need to first sort bobsArray
                 */
                int target = (bobTotal - aliceTotal + 2 * aliceSizes[i]) / 2;
                if (binarySearch(bobSizes, target)) {
                    return new int[] { aliceSizes[i], target };
                }
            }

            return new int[0];
        }

        public static boolean binarySearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            int mid = start + (end - start) / 2;
            while (start <= end) {
                if (target > arr[mid])
                    start = mid + 1;
                if (target < arr[mid])
                    end = mid - 1;
                else
                    return true;
            }
            return false;
        }

    }

    // Question 15
    class Solution15 {
        public boolean checkIfExist(int[] arr) {
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if((arr[i]==arr[j]*2) && i!=j){
                        return true;
                    }
                }
            }
            return false;
        }
    }

    // Question 16
    class Solution16 {
        public int specialArray(int[] nums) {
            int left = 0;
            int right = nums.length;
            int ans = -1;
            while(left <= right) {
                int mid = left + (right - left)/2;
                int count = 0;
                for(int i: nums) {
                    if(i >= mid) {
                        count++;
                    }
                }
                if(count == mid) {
                    ans = mid;
                    break;
                }else if(count > mid) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
            return ans;
        }
    }

    // Question 17
    class Solution17 {
        public int search(int[] nums, int target) {
            return binary(nums, target, 0, nums.length-1);
        }
        public int binary(int a[], int x, int s, int e){
            while(s <= e){
                int m = s + (e-s)/2;
                if(a[m] == x){
                    return m;
                }
                if(x < a[m]){
                    e = m-1;
                }
                else {
                    s = m+1;
                }
            }
            return -1;
        }
    }

    // Medium Questions of Binary Search

    // Question 1
    class Solution1 {
        public int[] searchRange(int[] nums, int target) {
            int first = -1,last = -1;
            for(int i =0;i<nums.length;i++){
                if(nums[i] == target){
                    if(first == -1){
                        first = i;
                    }
                    last = i;
                }
            }
            return new int[]{first,last};
        }
    }

    // Question 2
    class Solution2 {
        public int singleNonDuplicate(int[] nums) {
            int n= nums.length;
            int l =0;
            int h= nums.length - 1;
            while(l<=h){
                int mid = l + (h-l)/2;
                if(mid%2==0 && mid+1<n && nums[mid] == nums[mid+1] || mid%2==1 && mid-1>=0 && nums[mid] == nums[mid-1]){
                    l=mid+1;
                }
                else{
                    h = mid-1;
                }
            }
            return nums[l];
        }
    }
}
