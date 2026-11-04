class Solution {
    public String convert(String s, int numRows) {
        //if there's only one row or enough rows for every character, nothing changes
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        //keep track of which row receives the next character
        int currentRow = 0;
        //1 moves down through the rows, -1 moves up
        int direction = 1;

        //create an array to hold the different rows
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int r = 0; r < numRows; r++) {
            //create an empty builder for each row
            rows[r] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            //add the character to its current row
            rows[currentRow].append(s.charAt(i));

            //at the top, start moving down
            if (currentRow == 0) {
                direction = 1;
            } else if (currentRow == numRows - 1) {
                //at the bottom, start moving up
                direction = -1;
            }

            //move to the row that will receive the next character
            currentRow += direction;
        }

        //join the rows from top to bottom
        StringBuilder result = new StringBuilder();
        for (int r = 0; r < numRows; r++) {
            result.append(rows[r]);
        }

        //convert the builder into a string and return it
        return result.toString();
    }
}