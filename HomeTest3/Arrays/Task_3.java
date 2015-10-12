/*3. Объявить и инициализировать массив состоящий из 15 элементов:
а) списком инициализации
б) вводом с клавиатуры
в) случайным образом.*/
import java.util.*;

public class Task_3 {

	public static void main(String[] args) {
		int [] arrays = new int [15];      //initialization by the list
		arrays [0] = 5;
		arrays [1] = 10;
		arrays [2] = 7;
		arrays [3] = 4;
		arrays [4] = 2;
		arrays [5] = 0;
		arrays [6] = 8;
		arrays [7] = -5;
		arrays [8] = 13;
		arrays [9] = 5;
		arrays [10] = -3;
		arrays [11] = 7;
		arrays [12] = 11;
		arrays [13] = 1;
		arrays [14] = 4;
		System.out.println("Массив заданный списком:");
		for (int i=0; i<15; i++){
			System.out.print(arrays[i]+" ");
		}	
		
		int keyboard[] = new int [15] ;           //input with keyboard
		Scanner scan = new Scanner(System.in);
		System.out.println("\nЗадайте с клавиатуры значения массива:");
		for (int i=0; i<15; i++) {
			keyboard [i] = scan.nextInt();
		}
		System.out.println("Массив заданный вводом с клавиатуры:");
		for (int i=0; i<15; i++){
			System.out.print(keyboard[i]+" ");
		}
		
		
		int [] random = new int [15];		     //random initialization
		for (int i=0; i<15; i++) {
			random [i] = (int)(Math.random()*20+1);
		}
		System.out.println("\nМассив заданный случайным образом:");
		for (int i=0; i<15; i++){
			System.out.print(random[i]+" ");
		}
		scan.close();
	}
}
