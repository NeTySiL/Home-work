import java.util.*;
//Написать программу, которая вычисляет оптимальный вес для пользователя, сравнивает его с реальным и выдает рекомендацию 
//о необходимости поправиться или похудеть. Оптимальный вес вычисляется по формуле: Рост (см) — 100
public class Task5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите пожалуйста Ваши данные:\n"+"Рост в сантиметрах: ");
		int growth = scan.nextInt();
		System.out.print("Ваш вес: ");
		int weight = scan.nextInt();
		int optimal = growth - 100;        //calculated normal weight
		if (growth>0 && weight>0)		   //exclude non-existent options
		{
			if (weight-optimal>0)
				System.out.println("Хватит есть! Тебе необходимо похудеть на "+(weight-optimal)+" кг");
			else if (weight-optimal<0)
				System.out.println("Тебе необходимо поправиться на "+Math.abs(weight-optimal)+" кг");
			else
				System.out.println("Поздравляем! Ваш вес соответствует Вашему росту!");
		}
		else 
			System.out.println("Данные не коорректны");
		scan.close();
	}
}
