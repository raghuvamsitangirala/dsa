public class Problem1512 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
                // else{
                //     i++;
                // }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Problem1512 p = new Problem1512();
        int[] nums = {1,2,3,1,1,3};
        int result = p.numIdenticalPairs(nums);
        System.out.println(result);
    }
}