//6. В массиве из 10 чисел подсчитать количество отрицательных элементов массива.

public class Task_6 {

	public static void main(String[] args) {
		int mass[] = new int [10];
		System.out.println("Случайный массив:");
		for (int i=0; i<mass.length; i++){				//creat arrays
			mass[i] = (int)(Math.random()*21-10);
			System.out.print(mass[i]+"  ");			
		}
		int quantity = 0;					
		for (int x : mass){				//count the number of negative elements
			if (x<0)
				quantity++;
		}
		System.out.println("\nВ массиве "+quantity+" отрицательных элементов.");
	}
}
