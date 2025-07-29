class Solution {
    static List<String> list;

    public void generate(int open, int close, int n, String s) {
        if (s.length() == 2 * n) {
            list.add(s);
            return;
        }
        if (open < n)
            generate(open + 1, close, n, s + "(");
        if (close < open)
            generate(open, close + 1, n, s + ")");
    }

    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        generate(0, 0, n, "");
        return list;
    }
}