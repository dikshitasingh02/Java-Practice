import com.sun.org.apache.xerces.internal.impl.dv.XSFacets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
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
            public int[] createTargetArray(int[] nums, int[] index) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < nums.length; i++)
                    ans.add(index[i], nums[i]);
                return ans.stream().mapToInt(Integer::intValue).toArray();
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

    }
}
