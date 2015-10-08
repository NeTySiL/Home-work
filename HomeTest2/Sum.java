import java.util.Scanner;
//5*. Написать программу вычисления суммы чисел от 1 до n.
public class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите количество последовательных слогаемых: ");
		int number = scan.nextInt();
		int i=0, sum =0;
		while (i <= number){
			sum += i;
			i++;
		}
		System.out.println(sum);
		scan.close();	
	}
}
