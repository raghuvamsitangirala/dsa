import java.util.Scanner;

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1; j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					arr[0] = i;
					arr[1] = j;
  				}
			}
		}
		return arr;	
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] nums = {2,7,11,15};
        p.twoSum(nums, target);
        sc.close();
    }
}
