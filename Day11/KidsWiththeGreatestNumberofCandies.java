import java.util.ArrayList;

class KidsWiththeGreatestNumberofCandies{
    public static void main(String[] args) {
        

        
    }
    public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList booleanList = new ArrayList<>();
        int max = 0;

	for (int i = 0; i < candies.length; i++) {
		if (candies[i] > max) {
			max = candies[i];
		}
	}
	for (int i = 0; i < candies.length; i++) {
		if ((candies[i] + extraCandies) >= max) {
			booleanList.add(true);
		} else booleanList.add(false);
	}
	return booleanList;
    }
}