public class Problem1614 {
    public int maxDepth(String s) {
        int count = 0;
        int depth = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='('){
                count += 1;
            }
            else if(s.charAt(i)==')'){
                count -= 1;
            }
            depth = Math.max(depth, count);
        }
        return depth;
    }
    
    public static void main(String[] args) {
        Problem1614 p = new Problem1614();
        int res = p.maxDepth("He(ll)0");
        System.out.println(res);
    }
}
