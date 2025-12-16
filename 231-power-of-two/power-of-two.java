class Solution {
    public boolean isPowerOfTwo(int n) {
        int x=0;
        if(n==1)
        return true;
        else if(n==0)
        return false;
        else if(n%2==0)
        {
            x=n/2;
        return isPowerOfTwo(x);
        }
        else
        return false;
    }
}