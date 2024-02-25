public class MatrixMultiply {
	//define first and second matrix
	public static void main(String[] args) {
		int[][] matrix1 = {
			{3,5,8},
			{5,7,2},
			{9,2,3}
		};

		int[][] matrix2 = {
			{5,7,2},
			{3,2,5},
			{4,2,5}
		};
		//perform matrix multiplication
		int[][] result = multiplyMatrices(matrix1, matrix2);

		//display result
		System.out.println("Result: ");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
			}
		}

	//method for multiplying two matrices
	public static int[][] multiplyMatrices(int[][]matrix1, int[][] matrix2) {
		//determine dimensions of matrix
		int rows1 = matrix1.length;
		int cols1 = matrix1[0].length;
		int cols2 = matrix2[0].length;
		//initialise result
		int[][] result = new int[rows1][cols2];

		//loops to perform multiplication
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < cols1; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		//return the result
		return result;
	}
}
