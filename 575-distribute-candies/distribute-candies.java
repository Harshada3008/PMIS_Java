
import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candyType) {

        HashSet<Integer> types = new HashSet<>();

        for (int candy : candyType) {
            types.add(candy);
        }

        return Math.min(types.size(), candyType.length / 2);
    }
}
