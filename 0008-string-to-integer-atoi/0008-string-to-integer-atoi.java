class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1; // assume positive unless we find a '-'
        long value = 0; // use a long so we can check if the result goes outside the int range

        // skip leading spaces, checking that i is still inside the string first
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // read at most one sign before we start reading digits
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            // move past either sign so the digit loop can start at the next character
            i++;
        }

        // keep reading digits until we reach a non-digit or the end of the string
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            // subtract '0' to turn a character like '4' into the number 4
            int digit = s.charAt(i) - '0';

            // multiply by 10 to make room, then add the digit with its sign
            // example: -4 * 10 + 2 * -1 = -42
            value = value * 10 + digit * sign;

            // if the value goes outside the int range, return the limit it passed
            if (value > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (value < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        // the value already has its sign and fits in an int, so we can cast it
        return (int) value;
    }
}