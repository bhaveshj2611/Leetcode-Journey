class Solution {
    public int totalFruit(int[] fruits) {
           if(fruits.length <= 2){
            return fruits.length;
        }
        int i=0;int j=0;
        HashMap<Integer,Integer> map = new HashMap<>();
     
        int m = 0;
        while(j<fruits.length){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            // maxF = maxF + fruits[j];
            if(map.size()<2){
                m = Math.max(m,j-i+1);
                j++;
            }
            else if(map.size()==2){
                m = Math.max(m,j-i+1);
                j++;
            }
            else{
                while(map.size()>2){
                    int f = fruits[i];
                    if(map.get(f)<=1){
                         map.remove(f);
                    }
                    else{
                        map.put(f,map.get(f)-1);
                    }
            
                    i++;
                    
                
                    
                }
                m = Math.max(m,j-i+1);
                j++;
            }
        }
        return m;
    }
}