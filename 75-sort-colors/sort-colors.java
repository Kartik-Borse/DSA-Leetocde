class Solution {
    public void sortColors(int nums[]) {
        int maxx=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            maxx=Math.max(maxx,nums[i]);
        }
        int count[]=new int[maxx+1];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
         int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                nums[j]=i;
                j++;
                count[i]--;
            }
        }
    }
}