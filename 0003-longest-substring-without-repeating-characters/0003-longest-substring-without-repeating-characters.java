import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> noRepeats = new HashSet<Character>();
        //holds the starting position
        int left = 0;
        //holds the longest streak 
        int longest = 0;
        for(int right = 0; right < s.length(); right++){
            //while the character is in the current substring
            while(noRepeats.contains(s.charAt(right))){
                //remove the left character
                noRepeats.remove(s.charAt(left));
                //have it move positions
                left++;
            }
            //add to the HashSet
            noRepeats.add(s.charAt(right));
            //check if the current streak is longer
            if(noRepeats.size() > longest){
                longest = noRepeats.size();
            }
        }
        //return the biggest streak
        return longest;
    }
}