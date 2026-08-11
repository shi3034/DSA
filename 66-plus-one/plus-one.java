class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
            int c=1;
            for(int i=n-1;i>=0;i--)
            {
                if(c==0)
                break;
            if(digits[i]==9)
            {
                digits[i]+=c;
                digits[i]=0;
            }
            else
            {
                digits[i]+=c;
                c=0;
            } 
            }
            if(c==1)
            {
                int[] ans=new int[n+1];
                ans[0]=1;
                for(int i=0;i<n;i++)
                {
                    ans[i+1]=digits[i];
                }
                return ans;
            }
        return digits;
    }
}