//9. В массиве из 10 чисел переставить все нули в конец массива, не меняя порядок не нулевых элементов. 
public class Task_9 {

	public static void main(String[] args) {
		int arrays[] = new int [10];
		System.out.println("Случайный исходный массив:");
		for (int i=0; i<arrays.length; i++){				//creat random arrays
			arrays[i] = (int)(Math.random()*21-10);
			System.out.print(arrays[i]+" ");			
		}
		for (int i=arrays.length-1; i>0; i--){				
			for (int j=0; j<i; j++){						//compare each element 	
				if (arrays[j]==0){							//we found a zero value
					int x = arrays[j];						//change followed
					arrays[j] = arrays[j+1];
					arrays[j+1] = x;
				}
			}
		}
		System.out.println("\nИзменённый массив:");
		for (int i=0; i<arrays.length; i++){
		System.out.print(arrays[i]+" ");
		}
	}
}
