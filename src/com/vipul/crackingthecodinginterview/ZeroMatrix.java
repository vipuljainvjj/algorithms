package com.vipul.crackingthecodinginterview;

public class ZeroMatrix {
	
	public static void main(String[] args) {
		
		// Page 60
		// Initialize the matrix
		int matrixSize = 7;
		int[][] matrix = new int[matrixSize][matrixSize];
		int counter = 1;
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j ++) {
				matrix[i][j] = counter;
				counter ++;
			}
		}
		matrix[2][3] = 0;
		
		boolean[] rowFlag = new boolean[matrix.length];
		boolean[] columnFlag = new boolean[matrix[0].length];
		
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j ++) {
				if (matrix[i][j] == 0) {
					rowFlag[i] =  true;
					columnFlag[j] = true;
				}
			}
		}
		
		for (int i = 0; i < rowFlag.length; i++) {
			if (rowFlag[i]) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = 0;
				}
			}
			
		}
		
		for (int i = 0; i < columnFlag.length; i++) {
			if (columnFlag[i]) {
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][i] = 0;
				}
			}
		}
		
		// Output
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j ++) {
				String str = String.valueOf(matrix[i][j]);
				str = str.length() == 1 ? str + "  " : str + " ";
				System.out.print(str);
			}
			System.out.println();
		}
		
		
		
		
	}

}
