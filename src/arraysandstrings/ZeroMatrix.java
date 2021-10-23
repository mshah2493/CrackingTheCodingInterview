package arraysandstrings;

public class ZeroMatrix {
	public static int[][] randomMatrix(int M, int N, int min, int max) {
		int[][] matrix = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = randomIntInRange(min, max);
			}
		}
		
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 10 && matrix[i][j] > -10) {
					System.out.print(" ");
				}
				
				if (matrix[i][j] < 100 && matrix[i][j] > -100) {
					System.out.print(" ");
				}
				
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				
				System.out.print(" " + matrix[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}
	
	public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}
	
	public static void setZeros(int[][] matrix) {
		boolean setFirstColZero = false;
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i = 0; i < rows; ++i) {
            if (matrix[i][0] == 0) {
            	setFirstColZero = true;
            }
            
            for (int j = 1; j < cols; ++j) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            } 
        }
		
		nullify(matrix, rows, cols, setFirstColZero);
	}
	
	public static void nullify(int[][] matrix, int rows, int cols, boolean col) {
        for (int i = 1; i < rows; ++i) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < cols; ++j) {
                    matrix[i][j] = 0;
                }
            } 
        }
        
        for (int j = 1; j < cols; ++j) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < rows; ++i) {
                    matrix[i][j] = 0;
                }
            } 
        }
        
        if (matrix[0][0] == 0) {
            for (int j = 1; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }
        
        if (col) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
	
	public static void main(String[] args) {
		int nrows = 10;
		int ncols = 15;
		int[][] matrix = randomMatrix(nrows, ncols, -10, 10);		

		printMatrix(matrix);
		
		setZeros(matrix);
		
		System.out.println();
		
		printMatrix(matrix);
	}
}
