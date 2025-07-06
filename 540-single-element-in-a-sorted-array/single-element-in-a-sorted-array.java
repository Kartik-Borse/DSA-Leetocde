class Solution {
    public int singleNonDuplicate(int[] nums) {
        int Num=nums[0];
        int n=nums.length;
        for(int i=1;i<nums.length-1;i++)
        {    if(nums[n-1]!=nums[n-2])
            {
               return nums[n-1]; 
            }
            if((nums[i]!=nums[i+1])&&(nums[i-1]!=nums[i]))
            {  
                Num=nums[i];
            }
        }
        return Num;
    }
    
}