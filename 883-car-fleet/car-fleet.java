class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        float[] carTime=new float[target+1];
        for(int i=0;i<n;i++)
        {
            carTime[position[i]]=(float)(target-position[i])/speed[i];
        }
        int fleets=0;
        float currentTime=carTime[target];
        for(int i=target-1;i>=0;i--)
        {
            if(carTime[i]>currentTime)
            {
                fleets++;
                currentTime=carTime[i];
            }
        }
        return fleets;

    }
}