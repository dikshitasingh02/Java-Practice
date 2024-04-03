import java.util.ArrayList;
import java.util.List;

public class Assignment4 {

        //Easy Questions
        // Question 1
        class Solution1 {
            public int[] buildArray(int[] nums) {
                int n = nums.length;
                for(int i=0;i<n;i++){
                    nums[i]=n*(nums[nums[i]]%n)+nums[i];
                }
                for(int i=0;i<n;i++){
                    nums[i]=nums[i]/n;
                }
                return nums;
            }
        }

        class Solution2 {
            public int[] getConcatenation(int[] nums) {
                final int n = nums.length;
                int[] ans = new int[n*2];
                for (int i = 0; i <nums.length ; i++) {
                    ans[i] = nums[i];
                    ans[i+n] = nums[i];
                }
                return ans;
            }
        }

        class Solution3 {
            public int[] runningSum(int[] nums) {
                int[] ans = new int[nums.length];
                ans[0] = nums[0];
                for (int i = 1; i < nums.length; i++)
                    ans[i] = ans[i-1] + nums[i];
                return ans;
            }
        }

        class Solution4 {
            public int maximumWealth(int[][] accounts) {
                int max =0;
                int sum =0;
                for(int i = 0;i<accounts.length;i++){
                    for(int j=0;j<accounts[0].length;j++){
                        sum+=accounts[i][j];
                    }
                    if(sum>max)
                        max=sum;
                    sum=0;

                }
                return max;
            }
        }

        class Solution5 {
            public int[] shuffle(int[] nums, int n) {
                int[] ans = new int [n<<1];
                for(int i=0,j=0;i<n;++i){
                    ans[j++] = nums[i];
                    ans[j++] = nums[i+n];
                }
                return ans;
            }
        }

        class Solution6 {
            public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
                int maxcandies =0;
                for(int i =0;i<candies.length;i++){
                    if(candies[i]>maxcandies){
                        maxcandies=candies[i];
                    }
                }
                List<Boolean> ans = new ArrayList<>();
                for(int i = 0;i<candies.length;i++){
                    if(candies[i]+extraCandies>=maxcandies){
                        ans.add(true);
                    }
                    else{
                        ans.add(false);
                    }
                }
                return ans;
            }
        }

        class Solution7 {
            public int numIdenticalPairs(int[] nums) {
                int[] cnt = new int[101];
                for (int x : nums) {
                    ++cnt[x];
                }
                int ans = 0;
                for (int v : cnt) {
                    ans += v * (v - 1) / 2;
                }
                return ans;
            }
        }

        class Solution8 {
            public int[] smallerNumbersThanCurrent(int[] nums) {
                final int kMax = 100;
                int[] ans = new int[nums.length];
                int[] count = new int[kMax + 1];

                for (final int num : nums)
                    ++count[num];

                for (int i = 1; i <= kMax; ++i)
                    count[i] += count[i - 1];

                for (int i = 0; i < nums.length; ++i)
                    ans[i] = nums[i] == 0 ? 0 : count[nums[i] - 1];

                return ans;

            }
        }

        class Solution9 {
            public Object[] createTargetArray(int[] nums, int[] index) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < nums.length; i++)
                    ans.add(index[i], nums[i]);
                return ans.toArray();
            }
        }

        class Solution10 {
            public boolean checkIfPangram(String sentence) {
                boolean[] vis = new boolean[26];
                for (int i = 0; i < sentence.length(); ++i) {
                    vis[sentence.charAt(i) - 'a'] = true;
                }
                for (boolean v : vis) {
                    if (!v) {
                        return false;
                    }
                }
                return true;
            }
        }

        class Solution11 {
            public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
                int count=0;

                for(int i =0;i<items.size();i++){

                    if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)){
                        count++;
                    }
                    else if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)){
                        count++;
                    }
                    else if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)){
                        count++;
                    }
                }

                return count;
            }
        }

        class Solution12 {
            public int largestAltitude(int[] gain) {
                int maxalt = 0;
                int alt =0;
                for(int i=0;i<gain.length;i++){
                    alt= alt+gain[i];
                    maxalt=Math.max(maxalt,alt);
                }
                return maxalt;
            }
        }

        class Solution13 {
            public int[][] flipAndInvertImage(int[][] image) {
                int l = image[0].length;
                for(int i=0;i<image.length;i++){
                    for(int j=0;j<l/2;j++){
                        int temp=image[i][j];
                        image[i][j]=image[i][l-1-j];
                        image[i][l-1-j]=temp;
                    }
                }
                for(int i=0;i<image.length;i++){
                    for(int j=0;j<image[i].length;j++){
                        if(image[i][j]==0){
                            image[i][j]=1;
                        }
                        else if(image[i][j]==1){
                            image[i][j]=0;
                        }
                    }
                }
                return image;
            }
        }

        class Solution14 {
            public int oddCells(int m, int n, int[][] indices) {
                int ans[][]= new int[m][n];
                for(int i =0;i<indices.length;i++){
                    int rowidx = indices[i][0];
                    int colidx = indices[i][1];
                    for(int j=0;j<n;j++){
                        ans[rowidx][j] +=1;
                    }
                    for(int j=0;j<m;j++){
                        ans[j][colidx] +=1;
                    }
                }
                int count = 0;
                for(int i=0;i<m;i++)
                    for(int j=0;j<n;j++)
                    {
                        if(ans[i][j] % 2!= 0){
                            count++;
                        }
                    }
                return count;
            }
        }

        class Solution15 {
            public int diagonalSum(int[][] mat) {
                int sum =0;
                for(int i =0;i < mat.length; i++) {
                    for(int j = 0; j < mat[i].length; j++ ) {
                        if(i==j || i+j==mat.length-1)
                            sum+=mat[i][j];
                    }
                }
                return sum;
            }
        }

        class Solution16 {
            public int findNumbers(int[] nums) {
                int ans =0;
                for(int i =0;i<nums.length;i++){
                    int count=0;
                    while(nums[i]!=0){
                        nums[i]=nums[i]/10;
                        ++count;
                    }
                    if(count%2==0){
                        ++ans;
                    }
                }
                return ans;
            }
        }

        class Solution17 {
            public int[][] transpose(int[][] matrix) {
                int[][] temp=new int[matrix[0].length][matrix.length];
                for(int i=0;i<matrix.length;i++){
                    for(int j =0;j<matrix[0].length;j++){
                        temp[j][i]=matrix[i][j];
                    }
                }
                return temp;
            }
        }

        class Solution18 {
            public List<Integer> addToArrayForm(int[] num, int k) {
                List<Integer> l1 = new ArrayList<>();
                List<Integer> l2 = new ArrayList<>();
                while(k>0){
                    l2.add(0,k%10);
                    k/=10;
                }
                int ind1 = num.length - 1;
                int ind2 = l2.size() - 1;
                int carry = 0;
                while(ind1>=0 && ind2>=0){
                    int sum = num[ind1] + l2.get(ind2) + carry;
                    ind1 = ind1-1;
                    ind2 = ind2-1;
                    if(sum>9){
                        l1.add(0,sum%10);
                        carry = sum/10;
                    }
                    else{
                        l1.add(0,sum);
                        carry = 0;
                    }
                }
                while(ind1>=0){
                    int sum = num[ind1--] + carry;
                    if(sum>9){
                        l1.add(0,sum%10);
                        carry = sum/10;
                    }
                    else{
                        l1.add(0,sum);
                        carry = 0;
                    }
                }
                while(ind2>=0){

                    int sum = l2.get(ind2--) + carry;
                    if(sum>9){
                        l1.add(0,sum%10);
                        carry = sum/10;
                    }
                    else{
                        l1.add(0,sum);
                        carry = 0;
                    }
                }
                if(carry>0){
                    l1.add(0,carry);
                }

                return l1;

            }
        }

        class Solution19 {
            public int maximumPopulation(int[][] logs) {
                int[] population=new int[101];
                for(int i=0;i<logs.length;i++){
                    int x=logs[i][0]-1950;
                    int y=logs[i][1]-1950;
                    for(int a=x;a<y;a++){
                        population[a]++;
                    }
                }
                int populationcount=0,maxyear=0;
                for(int i=0;i<101;i++){
                    if(population[i]>populationcount){
                        populationcount=population[i];
                        maxyear=i+1950;
                    }
                }
                return maxyear;
            }
        }

        class Solution20 {
            public boolean findRotation(int[][] mat, int[][] target) {
                for(int i = 0; i < 4; i++){
                    if(Arrays.deepEquals(mat,target)) return true;
                    matrix_90D(mat);
                }
                return false;
            }


            public static void matrix_90D(int[][] matrix){
                int n = matrix.length;
                for(int i = 0 ; i < n-1 ; i++){
                    for(int j = i+1 ; j < n ; j++){
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = temp;
                    }
                }

                for(int i = 0 ; i < n ; i++){
                    for(int j = 0 ; j < n/2 ; j++){
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][n-1-j];
                        matrix[i][n-1-j] = temp;
                    }
                }
            }
        }

        class Solution21 {
            public int[] twoSum(int[] nums, int target) {
                int n = nums.length;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (nums[i] + nums[j] == target) {
                            return new int[]{i, j};
                        }
                    }
                }
                return new int[]{};
            }
        }

        class Solution22 {
            public int[] sumZero(int n) {
                int arr[] = new int[n];
                int d=-(n/2);
                if(n%2!=0)
                {
                    for(int i=0;i<n;i++)
                    {
                        arr[i]=d;
                        d=d+1;
                    }
                }
                else
                {
                    for(int i=0;i<n;i++)
                    {
                        if(d==0)
                            d=d+1;

                        arr[i]=d;
                        d+=1;

                    }
                }

                return arr;
            }
        }

        class Solution23 {
            public List<Integer> luckyNumbers (int[][] matrix) {
                ArrayList<Integer> s1 = new ArrayList<>();

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (checkLucky(matrix, i, j)) {
                            s1.add(matrix[i][j]);
                        }
                    }
                }
                return s1;
            }

            public boolean checkLucky(int[][] matrix, int row, int col) {
                int element = matrix[row][col];

                // Check if element is the smallest in its row
                for (int j = 0; j < matrix[row].length; j++) {
                    if (matrix[row][j] < element && j != col) {
                        return false;
                    }
                }

                // Check if element is the largest in its column
                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[i][col] > element && i != row) {
                        return false;
                    }
                }

                return true;
            }
        }

        class Solution24 {
            public List<Integer> luckyNumbers (int[][] matrix) {
                ArrayList<Integer> s1 = new ArrayList<>();

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (checkLucky(matrix, i, j)) {
                            s1.add(matrix[i][j]);
                        }
                    }
                }
                return s1;
            }

            public boolean checkLucky(int[][] matrix, int row, int col) {
                int element = matrix[row][col];

                // Check if element is the smallest in its row
                for (int j = 0; j < matrix[row].length; j++) {
                    if (matrix[row][j] < element && j != col) {
                        return false;
                    }
                }

                // Check if element is the largest in its column
                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[i][col] > element && i != row) {
                        return false;
                    }
                }

                return true;
            }
        }

        class Solution25 {
            public int[][] matrixReshape(int[][] mat, int r, int c) {
                int[][] s = new int[r][c];
                int x = 0;
                int y = 0;
                if(mat.length * mat[0].length == r * c){
                    for(int i =0; i<mat.length; i++){
                        for(int j = 0; j<mat[0].length; j++){
                            if(y==c){
                                x++;
                                y = 0;
                            }
                            s[x][y] = mat[i][j];
                            y++;
                        }
                    }
                    return s;
                }
                return mat;
            }
        }

        class Solution26 {
            public int[] plusOne(int[] digits) {
                for (int i = digits.length - 1; i >= 0; i--) {
                    if (digits[i] < 9) {
                        digits[i]++;
                        return digits;
                    }
                    digits[i] = 0;
                }

                digits = new int[digits.length + 1];
                digits[0] = 1;
                return digits;
            }
        }

        class Solution27 {
            public int removeDuplicates(int[] nums) {
                int j = 1;
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] != nums[i - 1]) {
                        nums[j] = nums[i];
                        j++;
                    }
                }
                return j;
            }
        }

        class Solution28 {
            public int minCostToMoveChips(int[] position) {
                int even = 0;
                int odd = 0;

                for(int chips : position) {
                    if(chips % 2 == 0) {
                        even++;
                    }
                    else {
                        odd++;
                    }
                }
                return Math.min(even, odd);
            }
        }

        // Medium

        class Solution1 {
            public List<Integer> spiralOrder(int[][] matrix) {
                List<Integer> res = new ArrayList<>();
                int n = matrix.length, m = matrix[0].length;
                int left = 0, up = 0, right = m - 1, down = n - 1;

                while(res.size() < n * m){
                    for(int i = left; i <= right && res.size() < n * m; i++) res.add(matrix[up][i]);
                    for(int i = up + 1; i < down && res.size() < n * m; i++) res.add(matrix[i][right]);
                    for(int i = right; i >= left && res.size() < n * m; i--) res.add(matrix[down][i]);
                    for(int i = down - 1; i > up && res.size() < n * m; i--) res.add(matrix[i][left]);

                    left++; right--; up++; down--;
                }

                return res;
            }
        }

        class Solution2 {
            public int[][] generateMatrix(int n) {
                int rowSt = 0, rowEnd = n - 1, colSt = 0, colEnd = n - 1;
                int[][] arr =  new int[n][n];
                int val = 1;
                while(val <= n * n){
                    //To fill first row
                    for(int i = colSt; i <= colEnd; i++){
                        arr[rowSt][i] = val++;
                    }
                    //To fill last col
                    for(int i = rowSt + 1; i <= rowEnd; i++){
                        arr[i][colEnd] = val++;
                    }
                    //TO fill last row
                    if(rowEnd != rowSt){
                        for(int i = colEnd - 1; i >= colSt; i--){
                            arr[rowEnd][i] = val++;
                        }
                    }
                    //TO fill first col
                    if(colEnd != colSt){
                        for(int i = rowEnd - 1; i > rowSt; i--){
                            arr[i][colSt] = val++;
                        }
                    }
                    rowSt++;
                    rowEnd--;
                    colSt++;
                    colEnd--;
                }
                return arr;

            }
        }

        class Solution3 {
            public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
                int[][] res = new int[rows * cols][];
                int k = 0;
                res[k++] = new int[]{rStart, cStart};
                int[] direction = {0, 1, 0, -1, 0};
                int d = 0;
                int len = 0;
                while(k < rows * cols){
                    if(d == 0 || d == 2){
                        len++;
                    }
                    for(int i = 0; i < len; i++){
                        rStart += direction[d];
                        cStart += direction[d+1];

                        if(rStart > -1 && rStart < rows && cStart > -1 && cStart < cols){
                            res[k++] = new int[]{rStart, cStart};
                        }
                    }
                    d = ++d % 4;
                }
                return res;
            }
        }

        class Solution4 {
            public void setZeroes(int[][] matrix) {
                boolean fr = false,fc = false;
                for(int i = 0; i < matrix.length; i++) {
                    for(int j = 0; j < matrix[0].length; j++) {
                        if(matrix[i][j] == 0) {
                            if(i == 0) fr = true;
                            if(j == 0) fc = true;
                            matrix[0][j] = 0;
                            matrix[i][0] = 0;
                        }
                    }
                }
                for(int i = 1; i < matrix.length; i++) {
                    for(int j = 1; j < matrix[0].length; j++) {
                        if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                            matrix[i][j] = 0;
                        }}
                }
                if(fr) {
                    for(int j = 0; j < matrix[0].length; j++) {
                        matrix[0][j] = 0;
                    }
                }
                if(fc) {
                    for(int i = 0; i < matrix.length; i++) {
                        matrix[i][0] = 0;
                    }
                }
            }
        }

        class Solution5 {
            public int[] productExceptSelf(int[] nums) {
                int n = nums.length;
                int[] ans = new int[n];
                Arrays.fill(ans, 0);
                int product = 1;
                int zeros = 0;

                for (int num : nums) {
                    if (num == 0) {
                        zeros++;
                        continue;
                    }
                    product *= num;
                }

                if (zeros == 1) {
                    for (int i = 0; i < n; i++) {
                        ans[i] = nums[i] == 0 ? product : 0;
                    }
                } else if (zeros == 0) {
                    for (int i = 0; i < n; i++) {
                        ans[i] = product / nums[i];
                    }
                }

                return ans;
            }
        }

        class Solution6 {
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

        class Solution7 {
            public boolean canJump(int[] nums) {
                int reachable = 0;
                for(int i = 0;i<nums.length;i++){
                    if(i>reachable)return false;
                    reachable = Math.max(reachable,i+nums[i]);
                }
                return true;
            }
        }

        class Solution8 {
            public void rotate(int[] nums, int k) {
                k = k % nums.length;
                if(k < 0){
                    k += nums.length;
                }
                reverse(nums, 0, nums.length - k - 1);
                reverse(nums, nums.length - k, nums.length - 1);
                reverse(nums, 0, nums.length - 1);
            }
            public static void reverse(int nums[], int i, int j){
                int li = i;
                int ri = j;

                while(li < ri){
                    int temp = nums[li];
                    nums[li] = nums[ri];
                    nums[ri] = temp;

                    li++;
                    ri--;
                }
            }
        }

        class Solution9
        {
            public void sortColors(int[] nums) {
                int l = 0;
                int r = nums.length - 1;

                for (int i = 0; i <= r;)
                    if (nums[i] == 0)
                        swap(nums, i++, l++);
                    else if (nums[i] == 1)
                        ++i;
                    else
                        swap(nums, i, r--);
            }

            private void swap(int[] nums, int i, int j) {
                final int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            }
        }

        class Solution10 {
            public int rob(int[] nums) {
                int rob = 0;
                int norob = 0;
                for (int i = 0; i < nums.length; i ++) {
                    int newRob = norob + nums[i];
                    int newNoRob = Math.max(norob, rob);
                    rob = newRob;
                    norob = newNoRob;
                }
                return Math.max(rob, norob);
            }
        }


}
