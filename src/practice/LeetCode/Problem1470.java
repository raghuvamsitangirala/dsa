import java.util.Arrays;

public class Problem1470 {
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

    public static void main(String[] args) {
        Problem1470 p = new Problem1470();
        int[] nums = {1,2,3,4,5,6};
        int n = 3;
        int[] result = p.shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }
}
