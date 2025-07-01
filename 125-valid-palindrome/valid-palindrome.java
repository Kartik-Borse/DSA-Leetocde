import java.util.*;

class Solution {

    public static boolean isAlphaNum(char ch) {
        
        if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        int st = 0, end = s.length() - 1;
        s = s.toLowerCase();
        while (st < end) {
            char startChar = s.charAt(st);
            char endChar = s.charAt(end);

            if (!isAlphaNum(startChar)) {
                st++;
                continue;
            }

            if (!isAlphaNum(endChar)) {
                end--;
                continue;
            }

            if (startChar != endChar) {
                return false;
            }

            st++;
            end--;
        }

        return true;
    }
}
