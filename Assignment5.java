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
}
