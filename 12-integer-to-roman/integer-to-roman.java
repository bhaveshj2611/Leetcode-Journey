class Solution {
    public String intToRoman(int num) {

        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        HashMap<String,Integer> map = new HashMap<>();
        map.put("M",1000);
        map.put("M",1000);
        map.put("M",1000);
        map.put("M",1000);
        map.put("M",1000);
        map.put("M",1000);
        String s = "";
        int i=0;
        while(num>0){
            if(num>=values[i]){
                s = s + romans[i];
                num = num - values[i];
            }
            else i++;
        }
        return s;
    }
}