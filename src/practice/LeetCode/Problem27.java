public class Problem27 {

    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
     
        while(j < nums.length){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++; 
            }
     
            j++;
        }
     
        return i;
    }

    public static void main(String[] args) {
        Problem27 p = new Problem27();
        int[] nums = {3,2,2,3};
        p.removeElement(nums, 3);
    }
}