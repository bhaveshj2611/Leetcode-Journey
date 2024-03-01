class Solution {

     private class MyPair{
        private int first;
        private int second;
        public MyPair(int first, int second) {
            this.first = first;
            this.second = second;
        }
	}

    public int[] dailyTemperatures(int[] temperatures) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = temperatures.length;
    
        Stack<MyPair> st = new Stack<>();
       
        for(int i = n - 1;i>=0;i--){
            if(st.isEmpty()){
                list.add(-1);
            }
            else if(!st.isEmpty() && st.peek().first > temperatures[i]){
                list.add(st.peek().second);
            }
            else{
                if(st.isEmpty()){
                    list.add(-1);
                }
                else{
                    while(!st.isEmpty() && st.peek().first <= temperatures[i]){
                        st.pop();
                    }
                    if(st.isEmpty()){
                        list.add(-1);
                    }
                    else{
                        list.add(st.peek().second);
                    }
                }
                
            }

           
                 st.push(new MyPair(temperatures[i],i));
         
            
        // System.out.println("Stack after this iteration: " + st);
            // System.out.println("List after " + i + " iteration: " + list);
        }

        Collections.reverse(list);
        System.out.println(list);

        int[] ans = new int[n];

        for(int k=0;k<ans.length;k++){
            if(list.get(k) != -1){
                ans[k] = Math.abs(k - list.get(k));
            }
            else{
                ans[k] = 0;
            }
        }
        return ans;
    }
}