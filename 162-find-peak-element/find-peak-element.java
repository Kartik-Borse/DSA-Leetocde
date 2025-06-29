import java.util.*;
class Solution {
    int max=Integer.MIN_VALUE;
    int maxIndex=0;
    public int findPeakElement(int nums[]) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
               max=nums[i];
               maxIndex=i;
            }
        }
        return maxIndex;

    }
}