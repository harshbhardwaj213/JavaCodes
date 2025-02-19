public class Q14_TransposeMatrix {

    public static void transposeSquare(int[][] matrix){
        int n = matrix.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void transposeNonSquare(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposed = new int[columns][rows];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                transposed[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n=arr.length;
        System.out.println("Original Matrix is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix is: ");
        transposeSquare(arr);


        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Original Matrix:");
        //Enhanced Loop
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("\nTransposed Matrix:");
        transposeNonSquare(matrix);
    }
}
