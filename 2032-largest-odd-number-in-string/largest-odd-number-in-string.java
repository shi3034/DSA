class Solution {
    public String largestOddNumber(String num) {
        int ptr=num.length()-1;
        while(ptr>=0){
        if(num.charAt(ptr)%2!=0)
            return num.substring(0,ptr+1);
        ptr--;
        }
        return "";
    }
}