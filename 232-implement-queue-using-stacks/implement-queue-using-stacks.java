class MyQueue {

    public MyQueue() {
       
        
    }
     Stack<Integer> st = new Stack<>();
      Stack<Integer> st2 = new Stack<>();
    public void push(int x) {
      
       st.push(x);
    }
    
    public int pop() {
        int rem=0;
    
        while(!st.isEmpty()){
            st2.push(st.pop());
        
        }
        int removed = st2.pop();

        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        return removed;
    }
    
    public int peek() {
     int peeked=0;
    
        while(!st.isEmpty()){
            st2.push(st.pop());
        
        }
        peeked = st2.peek();

        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        return peeked;
    }
    
    public boolean empty() {
    
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */