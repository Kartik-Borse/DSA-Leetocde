import java.util.*;

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = Integer.MIN_VALUE;
        int maxArea = 0;

        for (int i = 0; i < dimensions.length; i++) {
            int width = dimensions[i][0];
            int height = dimensions[i][1];

            int currDiagonal = width * width + height * height;
            int area = width * height;

            if (currDiagonal > maxDiagonal || (currDiagonal == maxDiagonal && area > maxArea)) {
                maxDiagonal = currDiagonal;
                maxArea = area;
            }
        }

        return maxArea;
    }
}
