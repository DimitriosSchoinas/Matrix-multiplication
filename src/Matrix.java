
public class Matrix {

	private static final int DEF_NUMBER = 0;

	private int numberOfMatrix;
	private int[][] matrix1;
	private int[][] matrix2;
	private int L1;
	private int C1;
	private int L2;
	private int C2;

	public Matrix() {
		numberOfMatrix = DEF_NUMBER;
	}

	public void addMatrix(int[][] matrix, int L1, int C1) {
		if (numberOfMatrix == 0) {
			matrix1 = matrix;
			this.L1 = L1;
			this.C1 = C1;
			numberOfMatrix++;
		} else {
			matrix2 = matrix;
			L2 = L1;
			C2 = C1;
		}

	}
	public boolean canMultiply() {
		
		if(C1 == L2)
			return true;
		else
			return false;
	}
	
	public int[][] getMultiplicationMatrix(){
		int[][] finalMatrix = new int[L1][C2];
		
		for(int i = 0; i < L1; i++) {
			for(int j = 0; j < C2; j++) {
				finalMatrix[i][j] = multiplicationValue(i, j);
			}
		}
		
		return finalMatrix;
	}
	
	public int multiplicationValue(int row , int col) {
		
		int soma = 0;
		
		for(int i = 0; i < C1; i++) {
			soma += matrix1[row][i] * matrix2[i][col];
		}
		
		return soma;
	}
	public int getFinalMatrixRow() {
		return L1;
	}
	public int getFinalMatrixCols() {
		return C2;
	}
}
