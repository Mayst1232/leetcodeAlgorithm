import java.util.*;

class Solution {

    List<String> answer = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        recursive(n, "", 0, 0);

        return answer;
    }

    public void recursive(int n, String s, int open, int close) {
        if(close == n) {
            answer.add(s);
            return;
        }

        if(open == 0 || open == close) {
            recursive(n, s + "(", open + 1, close);
        }

        if(open > close) {
            if(open < n) {
                recursive(n, s + "(", open + 1, close);
            }

            recursive(n, s + ")", open, close + 1);
        }
    }
}