import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3,4,5,6};
        int[] result = s.shuffle(nums, 3);
        System.out.println(Arrays.toString(result));
    }


    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int i = 0;
        int j = n;
        int curr = 0;
        while (i < n) {
            res[curr] = nums[i];
            curr++;
            i++;
            res[curr] = nums[j];
            curr++;
            j++;
        }
        return res;
    }
}