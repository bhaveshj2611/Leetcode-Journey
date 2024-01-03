class Solution {
    public String intToRoman(int num) {
        // HashMap<Integer,String> map = new HashMap<>();
        // map.put(1,"I");
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String s = "";
        int i=0;
        while(num>0){
            if(num>=nums[i]){
                num = num - nums[i];
                s = s + roman[i];
            }
            else i++;
        }
        return s;
    }
}