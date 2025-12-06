package com.vipul.crackingthecodinginterview;

public class MatrixRotation {
	
	public static void main(String[] args) {
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
		
		int totalRotationCycles = matrixSize/2;
		
		for (int i = 0; i < totalRotationCycles; i++) {
			int start = i, end = matrixSize - i - 1;// to provide 0 index(for subtracting 1)
			int [] array = new int[end - i]; 
			int arrayIndex = 0;
			int temp = 0;
			
			// top values stored in array
			for (int j = start; j < end; j++, arrayIndex ++) {
				array[arrayIndex] = matrix[start][j];
			}
			
			// for right
			arrayIndex = 0;
			for (int j = start; j < end; j++, arrayIndex ++) {
				temp = array[arrayIndex];
				array[arrayIndex] = matrix[j][end];
				matrix[j][end] = temp;
			}
			
			// for bottom
			arrayIndex = 0;
			for (int j = start; j < end; j++, arrayIndex ++) {
				temp = array[arrayIndex];
				array[arrayIndex] = matrix[end][end - j + i];// to provide 0 index, providing offset
				matrix[end][end - j + i] = temp;
			}
			
			// for left
			arrayIndex = 0;
			for (int j = start; j < end; j++, arrayIndex ++) {
				temp = array[arrayIndex];
				array[arrayIndex] = matrix[end - j + i][start];
				matrix[end - j + i][start] = temp;
			}
			
			// for top
			arrayIndex = 0;
			for (int j = start; j < end; j++, arrayIndex ++) {
				temp = array[arrayIndex];
				array[arrayIndex] = matrix[start][j];
				matrix[start][j] = temp;
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
