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

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    nums[i] = sc.nextInt();
                }
            }

            Solution obj = new Solution();
            int[] result = obj.getConcatenation(nums);
            System.out.println(Arrays.toString(result));
        }

        sc.close();
    }
}