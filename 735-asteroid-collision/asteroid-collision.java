class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        int[] st=new int[n];
        int top=-1;
        for(int i=0;i<n;i++){
            if(asteroids[i]>0)
            st[++top]=asteroids[i];
            else
            {
                while(top>=0 && st[top]>0 && st[top]<Math.abs(asteroids[i]))
                top--;
                if(top>=0 && st[top]>0 && st[top]==Math.abs(asteroids[i]))
                top--;
                else if(top==-1 || st[top]<0)
                st[++top]=asteroids[i];
            }
        }
        int[] ans=new int[top+1];
        for(int i=0;i<ans.length;i++)
        ans[i]=st[i];
        return ans;
    }
}