// class Solution {
//     public boolean searchMatrix(int matrix[][], int target) {
        
//        for(int i=0;i<matrix.length;i++)
//        {
//         int st=0;
//         int end=matrix[0].length-1;
//         while(st<=end)
//         {
//         int mid=(st+end)/2;
//         if(matrix[i][mid]==target)
//         {
//             return true;
//         }
//         else if(matrix[i][mid]<target)
//         {
//             st=mid+1;
//         }
//         else
//         {
//             end=mid-1;
//         }
//        }
//        }
//        return false;
//     }
// }
class Solution {
    public boolean searchMatrix(int matrix[][], int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<=matrix.length-1 && col>=0)
        {
        if(target==matrix[row][col])
        {
            return true;
        }
        else if(target < matrix[row][col])
        {
            col--;
        }
        else{
            row++;
        }
        }
        return false;
    }
}