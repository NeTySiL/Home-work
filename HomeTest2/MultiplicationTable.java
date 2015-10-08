//4*. Написать программу, которая выводит таблицу квадратов первых десяти целых положительных чисел от 0 до 10
public class MultiplicationTable {

	public static void main(String[] args) {
		int value=0;
		System.out.println("Таблица умножения");
		for (int i=0; i<=10; i++){		//Prints lines
			for (int j=0; j<=10; j++){  //Prints column
				value = i*j;
				System.out.print(value+" ");				
			}
			System.out.println("");
		}
	}
}
