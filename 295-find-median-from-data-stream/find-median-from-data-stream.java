class MedianFinder {
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
      
    PriorityQueue<Integer> right = new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
         if(right.size()>0 && num > right.peek()){
            right.add(num);
        }
        else{
            left.add(num);
        }

        if(left.size()-right.size() == 2){
            right.add(left.remove());
        }
        else if(right.size()-left.size() == 2){
            left.add(right.remove());
        }
    }
    
    public double findMedian() {
        if(left.size()+right.size()==0){
            return -1.0;
        }
        else if(left.size()==right.size()){
            return (double)(left.peek()+right.peek())/2;
        }
        else if(left.size()>right.size()){
            return (double)left.peek();
        }
        else{
            return (double)right.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */