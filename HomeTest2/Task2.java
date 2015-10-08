import java.util.Scanner;
//Написать программу, которая сравнивает два введенных с клавиатуры числа
public class Task2 {

	public static void main(String[] args){
		System.out.print("Для сравнения двух чисел - введите их с клавиатуры\n"+"Первое число: ");
		Scanner number = new Scanner(System.in);
		int x = number.nextInt();
		System.out.print("Второе число: ");
		int y = number.nextInt();
		if (x > y)
			System.out.println("Число "+x+" больше чем "+y);
		else if (x < y)
			System.out.println("Число "+y+" больше чем "+x);
		else
			System.out.println("Число "+x+" и "+y+" равны!");
		number.close();
	}
}
