class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (digits(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int digits(int num) {
        // if(num<0)
        // {
        //     num*=(-1);
        // }
        // int d = 0;
        // while (num > 0) {
        //     num /= 10;
        //     d++;
        // }
        // return d;
        return(int)(Math.log10(num)+1);
    }
}