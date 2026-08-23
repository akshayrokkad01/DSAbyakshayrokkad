class Solution {
    public boolean isHappy(int n)
     {
        HashSet<Integer> usedSet=new HashSet<Integer>();
        while(true)
        {
            //find squr for number
            int sum=0;
            while(n!=0){
                sum+=Math.pow(n%10,2.0);
                n=n/10;
            }
            //if sum =1 happy
            if(sum==1)
            {
                return true;
            }
             n=sum;
             // check in  set
            if(usedSet.contains(n))
            {
                return false;
            }
            usedSet.add(n);
        }
    }
}