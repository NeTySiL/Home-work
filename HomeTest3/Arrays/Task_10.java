//10*. Даны натуральное число n, действительная матрица А размером n x n. 
//Получить последовательность элементов главной и побочной диагонали. 
import java.util.Scanner;

public class Task_10 {

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
		System.out.print("Главная диагональ:");
		for (int k=0; k<n; k++){
			elementDiagonal = matrix[k][k];
			System.out.print(elementDiagonal+" ");
		}													////calculation the secondary diagonal
		int value = n-1;
		System.out.print("\nПобочная диагональ:");
		for (int k=0; k<n; k++){
			elementDiagonal = matrix[k][value];
			System.out.print(elementDiagonal+" ");
			value--;
		}
		scan.close();
	}
}
