package codoid.technicaltask.java;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] firstMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] secondMatrix = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int row1 = firstMatrix.length;
		int col1 = firstMatrix[0].length;
		int col2 = secondMatrix[0].length;

		int[][] product = new int[row1][col2];

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				for (int k = 0; k < col1; k++) {
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}

		// Print the result
		for (int[] row : product) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
