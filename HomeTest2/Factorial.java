import java.util.Scanner;
//3*. Написать программу, которая вычисляет факториал введенного с клавиатуры числа.
public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите число: ");
		int quantity = scan.nextInt();
		int i=1;
		long factorial = 1l;
		if (quantity>0){		//exclude non-existent options
			while(i<=quantity){
				factorial = factorial * i;
				i++;
			}
			System.out.println(factorial);
		}	
		else
			System.out.println("Вводить нужно положительно число отличное от 0");
		scan.close();
	}
}
