class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int max = candies[0];
        List<Boolean> result = new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        for(int i=0;i<candies.length;i++){
            candies[i] = candies[i] + extraCandies;
            if(candies[i]>=max){
                result.add(true);
            }
            else result.add(false);
          
        }
        return result;
    }
}
