class Solution {
    public boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch == 'A'||ch=='E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int length=s.length();
        int st=0;
        int end=length-1;
        char ch[]=s.toCharArray();
        while(st<end)
        {
            if(!isVowel(ch[st]))
            {
                st++;
            }
            else if(!isVowel(ch[end]))
            {
                end--;
            }
            else
            {
                char temp=ch[st];
                ch[st]=ch[end];
                ch[end]=temp;
                st++;
                end--;
            }
        }
        return new String(ch);
    }
}
