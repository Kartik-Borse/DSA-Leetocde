class Solution {
    public int subarraySum(int nums[], int k) {
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {   int currSum=0;
            for(int j=i;j<nums.length;j++)
            {   
                currSum+=nums[j];
                if(currSum==k)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}