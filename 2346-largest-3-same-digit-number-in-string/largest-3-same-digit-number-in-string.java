class Solution {
    public String largestGoodInteger(String num) {
        String max="";
        for(int i=0;i<num.length()-2;i++)
        {
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i) == num.charAt(i+2))
            {
                String s=num.substring(i,i+3);
                if (s.compareTo(max)>0) max=s;
            }

        }
        return max;
    }
}