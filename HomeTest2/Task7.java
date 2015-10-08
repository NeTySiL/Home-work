import java.util.*;
//Напишите программу, которая запрашивает у пользователя номер дня недели, затем выводит название дня недели 
//или сообщение об ошибке, если введены неверные данные.
public class Task7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите номер дня недели: ");
		int day = scan.nextInt();
		switch (day){
			case 1:
				System.out.println("Понедельник");
				break;
			case 2:
				System.out.println("Вторник");	
				break;
			case 3:
				System.out.println("Среда");
				break;
			case 4:
				System.out.println("Четверг");
				break;
			case 5:
				System.out.println("Пятница");
				break;
			case 6:
				System.out.println("Суббота");
				break;
			case 7:
				System.out.println("Воскресенье");	
				break;
			default:
				System.out.println("Нет такого дня недели...");
		scan.close();		
		}
	}
}
