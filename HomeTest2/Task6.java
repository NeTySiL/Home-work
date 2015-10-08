import java.util.*;
//Написать программу, которая после введенного с клавиатуры числа (в диапазоне от 1 до 999), обозначающего денежную единицу, 
//дописывает слово "рубль" в правильной форме. Например, 12 рублей, 21 рубль и т. д
public class Task6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите количество денег: ");
		int money = scan.nextInt();
		if (money<=0)				//exclude non-existent options
			System.out.println("Введена не корректная сумма");
		else {
			if (money<=20 && money>=5)
				System.out.println("У Вас "+money+" рублей");
			else if ((money-1)%10 == 0 || money==1)
				System.out.println("У Вас "+money+" рубль");
			else if (money<5 || (money-2)%10==0 || (money-3)%10==0 || (money-4)%10==0)
				System.out.println("У Вас "+money+" рубля");
			else 
				System.out.println("У Вас "+money+" рублей");
		scan.close();	
		}		
	}
}