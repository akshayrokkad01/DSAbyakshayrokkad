class Solution {
    public int minEatingSpeed(int[] piles, int h)
     {
        int minSpeed=1;
        int maxSpeed=0;
        for(int p:piles) // find biggest
        {
            maxSpeed=Math.max(maxSpeed,p);
        }
        while(minSpeed<maxSpeed)
        {
            int mid=minSpeed+(maxSpeed-minSpeed)/2;
            int hrs=0;
            for(int p:piles)
            {
                hrs+=(int)Math.ceil((double) p/mid);
            }
            if(hrs<=h)
            {
                maxSpeed=mid;
            }else{
                minSpeed=mid+1;
            }
        }
        return maxSpeed;
    }
}