class Solution {
    public int reverse(int x) {
        //create the int that will hold the result
        int reversed = 0; 
        //as long as x isn't 0
        while (x != 0){
            // example: x = 123 % 10 = 3
            int digit = x % 10;
            // would multiplying by 10 and adding a digit put us outside the range?
            if(reversed > Integer.MAX_VALUE/10 
            || (reversed == Integer.MAX_VALUE/10 && digit > 7)
            || reversed < Integer.MIN_VALUE/10
            || (reversed == Integer.MIN_VALUE/10 && digit < -8)){
                // yes? return 0 
                return 0;
            }
            // we add it to the result, multiply by 10 to make room, then add the new digit
            // example: 3 * 10 + 2 = 32
            reversed = reversed * 10 + digit;
            //since it's an int, division drops whatever is after the decimal point
            // example: 123/10 = 12
            x /= 10;
        }
        //return our solution
        return reversed;
    }
}