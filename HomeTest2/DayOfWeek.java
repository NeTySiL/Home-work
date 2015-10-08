import java.util.*;
//1*. Напишите программу, которая по дате определяет день недели, на который эта дата приходится
public class DayOfWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите год: ");
		int y = scan.nextInt();
		System.out.print("Введите месяц: ");
		int m = scan.nextInt();
		System.out.print("Введите число: ");
		int date = scan.nextInt();
		int month=0, century=0, year = 0;
		int dayOfWeek = 0;
		if (y<0 || y>2015 || m<=0 || m>12 || date<=0 || date>31) 	//exclude non-existent options
			System.out.println("Дата введена не верно");
		else {
			century = y/100;	//quantity century	
			year = y%100;		//year of century
			if (m>2 && m<=12)	//change month for compliance with ancient Rome
				month = m - 2;
			else {
				month = m + 10;
				year = year-1;  
				}
			int a = (13*month - 1)/5;   //auxiliary variable
			int b = year/4;				//auxiliary variable
			int c = century/4;			//auxiliary variable
			dayOfWeek = (date+year-2*century+777+a+b+c)%7;	 //formula for calculation
			switch (dayOfWeek){		                    //define day of week
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
			case 0:
				System.out.println("Воскресенье");	
				break;
			}
		}
		scan.close();
	}

}
