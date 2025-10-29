class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        int rev=0;
        int n=0;
        while(x>0)
        {
            n=x%10;
            rev=(rev*10)+n;
            x=x/10;
        }
        if(org==rev)
        return true;
        else
        return false;
    }
}