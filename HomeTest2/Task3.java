import java.util.Scanner;
//Написать программу, которая вычисляет частное двух чисел
public class Task3 {

	public static void main(String[] args){
		System.out.print("Что бы узнать частное двух чисел - введите их с клавиатуры\n"+"Первое число: ");
		Scanner number = new Scanner(System.in);
		int x = number.nextInt();
		System.out.print("Второе число: ");
		int y = number.nextInt();
		if (y == 0)
			System.out.println("Опомнись! На ноль делить нельзя!");
		else 
			System.out.println("Частное двух чисел = " + (double)x/y);
		number.close();
	}
}
