//11*. В данной квадратной целочисленной матрице разместить столбцы так, чтобы элементы на главной диагонали были расположены по возрастанию.
import java.util.Scanner;

public class Task_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите размерность матрицы: ");
		int n = scan.nextInt();
		int [][] matrix = new int [n][n];
		System.out.println("Матрица случайных чисел имеет вид: ");
		for (int i=0; i<matrix.length; i++){				//creat random arrays
			for (int j=0; j<matrix[i].length; j++){				
			matrix[i][j] = (int)(Math.random()*21-10);
			System.out.printf("%4d", matrix[i][j]);
			}
			System.out.println("");
		}													//calculation the main diagonal
		int elementDiagonal = 0;
		for (int k=0; k+1<n; k++){
			if (matrix[k][k]>matrix[k+1][k+1])
				
		
			scan.close();
	}
}
