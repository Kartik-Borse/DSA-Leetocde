class Solution {
    public List<Integer> spiralOrder(int matrix[][]) {
        List<Integer>result=new ArrayList<>();
        int strow=0;
        int endrow=matrix.length-1;
        int stcol=0;
        int endcol=matrix[0].length-1;
        while(strow <=endrow && stcol<=endcol)
        {
            for(int j=stcol;j<=endcol;j++)
            {
                result.add(matrix[strow][j]);
            }
            for(int i=strow+1;i<=endrow;i++)
            {
                result.add(matrix[i][endcol]);
            }
            for(int j=endcol-1;j>=stcol;j--)
            {   
                if(strow==endrow)
                {
                    break;
                }
                result.add(matrix[endrow][j]);
            }
            for(int i=endrow-1;i>strow;i--)
            {   
                if(stcol==endcol)
                {
                    break;
                }
                result.add(matrix[i][stcol]);
            }
            strow++;
            endrow--;
            stcol++;
            endcol--;
            
        }
        return result;
    }
}