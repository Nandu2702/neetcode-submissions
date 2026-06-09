import java.util.Scanner;
import java.util.Arrays;

class Solution {

    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of array:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        int[] result = obj.getConcatenation(nums);

        System.out.println("The concatenated array is: " + Arrays.toString(result));

        sc.close();
    }
}