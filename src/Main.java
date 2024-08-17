import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner in = new Scanner(System.in);
		Matrix matriz = new Matrix();
		
		createMatrix(in, matriz);
		createMatrix(in, matriz);
		
		if(!matriz.canMultiply())
			System.out.println("Impossible to multiply the two matrices");
		else
		printFinalMatrix(matriz);
		
}
	
	private static void createMatrix(Scanner in, Matrix matriz) {
		int L1 = in.nextInt();
		int C1 = in.nextInt();
		in.nextLine();
		int[][] matrix = new int[L1][C1];
		for(int i = 0; i < L1; i++) {
			for(int n = 0; n < C1; n++) {
				int a = in.nextInt();
				matrix[i][n] = a;
			}
			in.nextLine();
		}
		matriz.addMatrix(matrix,L1,C1);
		
	}
	private static void printFinalMatrix(Matrix matrix) {
		
		int[][] finalMatrix = matrix.getMultiplicationMatrix();
		
		for(int i = 0; i < matrix.getFinalMatrixRow(); i++) {
			for(int j = 0; j < matrix.getFinalMatrixCols(); j++) {
				if(j == matrix.getFinalMatrixCols() - 1)
					System.out.print(finalMatrix[i][j]);
				else
				System.out.print(finalMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
}