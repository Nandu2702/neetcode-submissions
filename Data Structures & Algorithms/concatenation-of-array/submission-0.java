import java.util.Scanner;

public class Solution{
    public int[] getconcatenation(int[] nums){

        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i =0;i<n;i++){

            ans[i]= ans[i+n]= nums[i];
        }
    }return ans;
}
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.Out.println("Enter the size of array:");
        int n = sc.nextInt();

        System.Out.println("Enter the elements of array:");
        for(i=0;i<n;i++){
            int[] nums = nums[i];
        }int[] nums =sc.nextInt();

        Solution obj = new Solution();

        System.out.println("the concatinated array is:"+getconcatenation);
    }
}