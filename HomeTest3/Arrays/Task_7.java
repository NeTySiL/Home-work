//7. В массиве из 10 чисел вычислить сумму элементов массива до первого нуля. 
public class Task_7 {

	public static void main(String[] args) {
		int mass[] = new int [10];
		System.out.println("Случайный массив:");
		for (int i=0; i<mass.length; i++){				//creat random arrays
			mass[i] = (int)(Math.random()*21-10);
			System.out.print(mass[i]+"  ");			
		}
		int sum = 0;
		for (int x : mass){								
			if (x == 0)
				break;
			else
				sum+=x;
		}
		System.out.println("\nСумма = "+sum);
	}
}
