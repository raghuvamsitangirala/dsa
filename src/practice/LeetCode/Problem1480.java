import java.util.Arrays;

public class Problem1480 {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Problem1480 p = new Problem1480();
        int[] nums = {1,2,3,4};
        int[] result = p.runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}