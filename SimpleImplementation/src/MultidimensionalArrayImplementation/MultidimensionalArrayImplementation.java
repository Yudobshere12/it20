package MultidimensionalArrayImplementation;


public class MultidimensionalArrayImplementation {
    
    public static void main(String[] args) {
        
        // Multidimensional array implementation
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Displaying the 2D array using nested loops
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }
    }
}

