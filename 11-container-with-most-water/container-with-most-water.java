class Solution {
    public int maxArea(int[] height) {
        int p=0,q=height.length-1,max=0;
        while(p<q){
            if(height[p]<=height[q]){
                if(height[p]*(q-p)>max)
                max=height[p]*(q-p);
                p++;
            }
            else{
                if(height[q]*(q-p)>max)
                max=height[q]*(q-p);
                q--;
            }
        }
        return max;
    }
}