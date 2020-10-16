public class Problem1528 {
    public String restoreString(String s, int[] indices) {
        char[] restored = new char[indices.length];
        
        for (int i = 0; i < s.length(); i++) {
           restored[indices[i]] = s.charAt(i);
        }
        
        return new String(restored);
    }

    public static void main(String[] args) {
        Problem1528 p = new Problem1528();
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String result = p.restoreString(s, indices);
        System.out.println(result);
    }
}
