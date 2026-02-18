class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    static void mergeSort(int[] arr,int st,int end)
    {
        if(st<end)
        {
            int mid=st+(end-st)/2;
            mergeSort(arr,st,mid);
            mergeSort(arr,mid+1,end);

            merge(arr,st,mid,end);
        }
    }
    static void merge(int[] arr,int st,int mid,int end)
    {
        int[] temp=new int[end-st+1];
        int i=st,j=mid+1,k=0;

        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(int idx=0;idx<temp.length;idx++){
            arr[idx+st]=temp[idx];
        }
    }
}
