class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int range = max - min + 1;
        int[] count = new int[range];
        for (int num : nums) {
            count[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) {
                nums[index++] = i + min;
            }
        }

        return nums;
    }
}
