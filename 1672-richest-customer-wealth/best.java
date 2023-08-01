class Solution {
    public int maximumWealth(int[][] accounts) {
         
         int max =0;
            int [] sumArr = new int [accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum = sum + accounts[i][j];
                  
                }
                sumArr[i] = sum;  
            

            max = Math.max(max,sumArr[i]);
        }
           return max;  
        }
       
    }
