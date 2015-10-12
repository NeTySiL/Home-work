//8. В массиве из 10 чисел вычислить произведение элементов массива до первого нуля. 
public class Task_8 {

	public static void main(String[] args) {
		int mass[] = new int [10];
		System.out.println("Случайный массив:");
		for (int i=0; i<mass.length; i++){				//creat random arrays
			mass[i] = (int)(Math.random()*21-10);
			System.out.print(mass[i]+"  ");			
		}
		int multiply = 1;
		for (int x : mass){								
			if (x == 0)
				break;
			else
				multiply*=x;
		}
		System.out.println("\nПроизведение = "+multiply);
		
	}
}
