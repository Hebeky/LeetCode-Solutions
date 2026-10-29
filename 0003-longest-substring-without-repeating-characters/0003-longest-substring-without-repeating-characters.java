import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> noRepeats = new HashSet<Character>();
        int left = 0;
        int longest = 0;
        for(int right = 0; right < s.length(); right++){
            while(noRepeats.contains(s.charAt(right))){
                noRepeats.remove(s.charAt(left));
                left++;
            }
            noRepeats.add(s.charAt(right));
            if(noRepeats.size() > longest){
                longest = noRepeats.size();
            }
        }
        return longest;
    }
}