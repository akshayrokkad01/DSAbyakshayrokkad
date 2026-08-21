class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;// Get the number of rows
        int cols = matrix[0].length;// Get the number of columns

        int low = 0;// Starting index for binary search
        int high = rows * cols - 1;// Last index if the 2D matrix is treated like one 1D array

        // Continue binary search while there are elements to search
        while (low <= high) {

            int mid = low + (high - low) / 2; // Find the middle index

            int row = mid / cols; // Convert 1D index to row number. *// / gives us the row
            int col = mid % cols;// Convert 1D index to column number. *// % gives us the column

            // Check if the middle element is our target
            if (matrix[row][col] == target) {

                // Target found
                return true;
            }

            // If middle element is smaller than target
            else if (matrix[row][col] < target) {

                low = mid + 1; // Search in the right half
            }

            // If middle element is greater than target
            else {

                high = mid - 1; // Search in the left half
            }
        }

        return false; // Target was not found
    }
}