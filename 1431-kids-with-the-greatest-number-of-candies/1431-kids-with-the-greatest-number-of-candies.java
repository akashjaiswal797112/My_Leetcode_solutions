class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
                int large=0;
        for (int i = 0; i < candies.length; i++) {
            if(large<candies[i]){
                large= candies[i];
            }
        }
       
        List<Boolean> arr = new ArrayList<Boolean>();

        for (int j = 0; j < candies.length; j++) {
            arr.add( candies[j] + extraCandies >= large);

        }

            return arr;              
    }
}