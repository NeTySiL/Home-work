import java.util.*;
//Калькулятор
public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double answer = 0;
		int auxiliaryVariable = 0;
		System.out.println("\tВас приветствует калькулятор!\nВведите два числа(дробная часть отделяется запятой): ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		System.out.println("Нажатием клавиши выберите действие:");
		System.out.println("\t1  Сложение");
		System.out.println("\t2  Вычитание");
		System.out.println("\t3  Умноение");
		System.out.println("\t4  Деление");
		System.out.println("\tq  Для выхода");
		String action = scan.next();       //variable selection action
		switch (action){
		case "1":
			answer = x+y;
			break;
		case "2":
			answer = x-y;
			break;
		case "3":
			answer = x*y;
			break;
		case "4":
			if (y==0) {						//eliminated division by 0
				auxiliaryVariable=1;
				break;
			}	
			answer = x/y;
			break;
		case "q":
			auxiliaryVariable = -1;			//exit
			break;	
		default :							//case, if you pressed the wrong button
			auxiliaryVariable = 2;
		}
		if (auxiliaryVariable==0)
		System.out.println("Ответ: "+answer);
		else if (auxiliaryVariable==1)
			System.out.println("На ноль делить нельзя!");
		else if (auxiliaryVariable>1)
			System.out.println("Ошибка. Небыло выбрано действие");
		else  
			System.out.println("Всего хорошего!");
		scan.close();
	}
}
