public class Day_1{

    // Question 1
    // Valid Anagram
    // https://leetcode.com/problems/valid-anagram/
    // Time Complexity = O(n)    
    // Space Complexiy = O(26) ~ O(1) 
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i =0 ; i<s.length() ; i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i =0 ; i<t.length() ; i++){
            arr[t.charAt(i)-'a']--;
        }
        for(int i =0 ; i<26 ; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }

    // Question 2
    // First Unique Character in a String
    // https://leetcode.com/problems/first-unique-character-in-a-string/
    // Time Complexity = O(n)      
    // Space Complexiy = O(26) ~ O(1)
    public int firstUniqChar(String s) {
        int ch[] = new int[26];
        for(int i=0; i<s.length(); i++){
            ch[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(ch[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }


    // Question 3
    // Ransom Note
    // https://leetcode.com/problems/ransom-note/
    // Time Complexity = O(n+m)
    // Space Complexiy = O(26) ~ O(1)
    public boolean canConstruct(String ransomNote, String magazine) {
        int ch[] = new int[26];
        for(int i=0; i<magazine.length(); i++){
            ch[magazine.charAt(i)-'a']++;
        }
        
        for(int i=0; i<ransomNote.length(); i++){
            if(ch[ransomNote.charAt(i)-'a'] == 0){
                return false;
            }
            ch[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}