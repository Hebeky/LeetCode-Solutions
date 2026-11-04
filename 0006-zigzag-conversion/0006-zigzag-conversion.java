class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int currentRow = 0;
        int direction = 1;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int r = 0; r < numRows; r++) {
            rows[r] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            rows[currentRow].append(s.charAt(i));

            if (currentRow == 0) {
                direction = 1;
            } else if (currentRow == numRows - 1) {
                direction = -1;
            }
            currentRow += direction;
        }

        StringBuilder result = new StringBuilder();
        for (int r = 0; r < numRows; r++) {
            result.append(rows[r]);
        }

        return result.toString();
    }
}