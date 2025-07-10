class Solution {
    public int compress(char chars[]) {
       StringBuilder sb=new StringBuilder("");
        for(int i=0;i<chars.length;i++)
        {   int count=1;
            while(i<chars.length-1 && chars[i]==chars[i+1])
            {
                count++;
                i++;
            }
            sb.append(chars[i]);
            if(count>1)
            {
                sb.append(count);

            }
        }
         String result = sb.toString();
        for (int i = 0; i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }

        return result.length();
    
    }
}