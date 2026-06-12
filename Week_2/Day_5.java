import java.util.*;
public class Day_5{

    // Question 1
    // Group Anagrams
    // https://leetcode.com/problems/group-anagrams/
    // Time Complexity = O(n·k log k)   
    // Space Complexiy = O(nk) 
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(i);

        }
        int idx=-1;
        List<List<String>> res = new ArrayList<>();
        for (String k : map.keySet()) {
            List<Integer> a = map.get(k);
            if(a.size() >0){
                res.add(new ArrayList<>());
                idx++;
                for(int i=0; i<a.size(); i++){
                    res.get(idx).add(strs[a.get(i)]);
                }
            }
            
        }
        return res;
    }

    // Question 2
    // String Compression
    // https://leetcode.com/problems/string-compression/
    // Time Complexity = O(n)    
    // Space Complexiy = O(1)
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0, read = 0;
        
        while (read < n) {
            char curr = chars[read];
            int count = 0;
            
            // Count the number of contiguous occurrences.
            do {
                read++;
                count++;
            } while (read < n && chars[read] == curr);
            
            // Write the current character.
            chars[write++] = curr;
            
            // If count is greater than 1, write its digits.
            if (count > 1) {
                int start = write;
                while (count > 0) {
                    chars[write++] = (char) ('0' + count % 10);
                    count /= 10;
                }
                // Reverse the digits which were written in reverse order.
                int end = write - 1;
                while (start < end) {
                    char temp = chars[start];
                    chars[start++] = chars[end];
                    chars[end--] = temp;
                }
            }
        }
        return write;
    }


    // Question 3
    // Longest Palindromic Substring
    // https://leetcode.com/problems/longest-palindromic-substring/
    // Time Complexity = O(n*n)
    // Space Complexiy = O(n*n)
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        int start = 0;
        int end = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); ++i) {
            dp[i][i] = true;
            for (int j = 0; j < i; ++j) {
                if (s.charAt(j) == s.charAt(i) && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    if (i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }
    public static void main(String[] args) {
        
    }
}