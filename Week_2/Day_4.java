import java.util.*;
public class Day_4{

    // Question 1
    // Reverse Words in a String III
    // https://leetcode.com/problems/reverse-words-in-a-string-iii/
    // Time Complexity = O(n)    
    // Space Complexiy = O(n) 
    public String reverseWords(String s) {
        int i=0, j=0;
        StringBuilder res = new StringBuilder("");
        while(i<=j && j<s.length()){
            if(s.charAt(j) == ' '){
                for(int v=j-1; v>=i; v--){
                    res.append(s.charAt(v));
                }
                res.append(" ");
                i=j+1;
              
            }
            j++;
            
        }
        for(int v=j-1; v>=i; v--){
                res.append(s.charAt(v));
        }
        
        return res.toString();
    }

    // Question 2
    // Decode String
    // https://leetcode.com/problems/decode-string/
    // Time Complexity = O(m)    
    // Space Complexiy = O(m)
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> strStack = new Stack<>();

        String currStr = "";
        int currNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currNum = currNum * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                count.push(currNum);
                strStack.push(currStr);

                currNum = 0;
                currStr = "";
            } 
            else if (ch == ']') {
                int repeat = count.pop();
                String prevStr = strStack.pop();

                StringBuilder temp = new StringBuilder(prevStr);
                for (int i = 0; i < repeat; i++) {
                    temp.append(currStr);
                }

                currStr = temp.toString();
            } 
            else {
                currStr += ch;
            }
        }

        return currStr;
    }


    // Question 3
    // Generate Parentheses
    // https://leetcode.com/problems/generate-parentheses/
    // Time Complexity = O(Cn × n)
    // Space Complexiy = O(Cn × n)
    public void recurse(List<String> res, int l, int r, String str, int n) {
        if (str.length() == n * 2) {
            res.add(str);
            return;
        }
        
        if (l < n) {
            recurse(res, l + 1, r, str + "(", n);
        }
        
        if (r < l) {
            recurse(res, l, r + 1, str + ")", n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }
    public static void main(String[] args) {
        
    }
}