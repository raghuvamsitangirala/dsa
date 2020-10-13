public class Problem88{

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i = 0; i < n ; i++){
        //     nums1[i + n] = nums2[i];
        // }
        // for(int i = 0; i < m; i++){
        //     System.out.println(nums1[i]);
        // }
        while(m > 0 && n > 0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[m+n-1] = nums1[m-1];
                m--;
            }else{
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
        }
 
        while(n > 0){
            nums1[m+n-1] = nums2[n-1];
            n--;
        }
    }

    public static void main(String[] args) {
        Problem88 p = new Problem88();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {4,5,6};
        int m = nums1.length;
        int n = nums2.length;
        p.merge(nums1, m, nums2, n);
    }
}