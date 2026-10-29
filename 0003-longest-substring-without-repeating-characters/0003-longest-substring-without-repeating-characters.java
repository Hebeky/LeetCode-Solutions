import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> noRepeats = new HashSet<Character>();
        int current = noRepeats.size();
        int longest = 0;
        for(int i = 0; i < s.length(); i++){
            noRepeats.clear();
            for(int j = i; j < s.length(); j++ ){
                if(noRepeats.contains(s.charAt(j))){
                    break;
                }
                else{
                    noRepeats.add(s.charAt(j));
                    current = noRepeats.size();
                    if(current > longest){
                        longest = current; 
                    }
                }
            }
        }
        return longest;
    }
}