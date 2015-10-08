//6*. Напишите программу, которая выводит на экран значения функции у = 2х^-5х-8 в диапазоне от -4 до 4.Шаг изменения аргумента 0,5.
public class Quadratic {

	public static void main(String[] args) {
		double y = 0;
		for (double i=-4; i<=4; i+=0.5) {
			y = 2*i*i-5*i-8;
			System.out.print(y + "  ");
		}
	}
}
