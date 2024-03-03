class StockSpanner {

    public StockSpanner() {
        
    }
    Stack<int[]> st = new Stack();
   
    public int next(int price) {
       int c = 1;
      
     
              while(!st.isEmpty() && price >= st.peek()[0]){
                 c = c + st.peek()[1];
                st.pop();
            }

           
        
        
          
        

        st.push(new int[]{price,c});
       
        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */