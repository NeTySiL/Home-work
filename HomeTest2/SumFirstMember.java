import java.util.*;
//2*. Написать программу, которая вычисляет сумму первых n членов ряда: 1 + 1/2 + 1/3 + 1/4 +…. 
//Количество суммируемых членов ряда задается во время работы программы
public class SumFirstMember {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите количество членов ряда: ");
		int quantity = scan.nextInt();
		double i=1;
		double sum =0;
		while(i<=quantity){
			sum = sum + 1/i;
			i++;
		}
		System.out.println(sum);
		scan.close();
	}
}
