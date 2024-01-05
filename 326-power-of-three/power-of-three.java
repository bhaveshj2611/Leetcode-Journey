class Solution {
    public boolean isPowerOfThree(int n) {
        //  System.out.println(n);
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        if(n%3!=0){
            return false;
        }
       
        return isPowerOfThree(n/3);
    }
}