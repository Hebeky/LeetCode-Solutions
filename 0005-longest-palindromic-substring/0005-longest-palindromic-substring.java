class Solution {
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
        int longest = 0;
        int bestStart = 0;
        //iterate through different possible centers
        for(int center = 0; center < s.length(); center++){
            //check both odd and even centers
            for(int offset = 0; offset <=1;offset++){
                left = center;
                right = center + offset;
                //keep expanding while both positions are valid and their characters match
                while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                    int currentLength = right - left +1;
                    //is this the longest palindrome we've had? 
                    if(currentLength > longest){
                        longest = currentLength;
                        bestStart = left;
                    }
                    //move left and right outward to check the next pair
                    left--;
                    right++;
                }
            }
        }
        return s.substring(bestStart, bestStart + longest);
    }
}