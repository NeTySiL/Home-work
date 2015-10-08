import java.util.Scanner;
//Написать программу, которая проверяет, является ли год високосным
public class Task4 {
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите год:");
		int year = scan.nextInt();
			if (year>=0){			//exclude non-existent options
				if (year%4==0 && year%100!=0)
					System.out.println("Год высокосный");
				else if (year%4==0 && year%400==0)
						System.out.println("Год высокосный");
				else
					System.out.println("Год не высокосный");
			}
			else 
				System.out.println("Вводить необходимо год нашей эры!");
			scan.close();	
	}
}
 