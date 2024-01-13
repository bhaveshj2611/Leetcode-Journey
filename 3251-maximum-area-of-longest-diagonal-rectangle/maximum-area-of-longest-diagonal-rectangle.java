class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
      
        double maxD = 0;
        int maxA = 0;
       for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int b=dimensions[i][1];
            double diagonal = Math.sqrt(l*l+b*b);
            int area = l*b;
            if(diagonal>maxD){
                maxD = diagonal;
                maxA = area;
            }
            else if(maxD == diagonal && area> maxA){
                maxA = area;
            }
            
       }
       return maxA;
    }
}