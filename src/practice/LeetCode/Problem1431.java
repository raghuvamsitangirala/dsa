import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> maxCandiesChild = new ArrayList();
		int gCandies = 0;
		int maxCandies = Arrays.stream(candies).max().getAsInt();
		for (int i = 0; i < candies.length; i++) {
			gCandies = candies[i] + extraCandies;
			if (gCandies >= maxCandies) {
				maxCandiesChild.add(true);
			} else {
				maxCandiesChild.add(false);
			}
		}
		return maxCandiesChild;
    }

    public static void main(String[] args) {
        Problem1431 p = new Problem1431();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = p.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}
