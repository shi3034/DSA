class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length(),i=0,j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(isPalindrome(s.substring(i,j)) || isPalindrome(s.substring(i+1,j+1)))
                return true;
                else 
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}