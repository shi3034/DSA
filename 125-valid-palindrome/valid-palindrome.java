class Solution {
   
    public static boolean isPalindrome(String s) 
    {
        StringBuilder sb = new StringBuilder(s);
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        String reversed = new StringBuilder(s).reverse().toString();
        if(reversed.equals(s))
        return true;
        else
        return false;
    }
}