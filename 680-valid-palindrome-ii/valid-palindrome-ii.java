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
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        rev+=str.charAt(i);
        if(str.equals(rev))
        return true;
        else
        return false;
    }
}