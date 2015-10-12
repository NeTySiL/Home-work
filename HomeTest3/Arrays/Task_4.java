//4. В массиве из 15 чисел найти наибольший элемент и его индекс в массиве

public class Task_4 {

	public static void main(String[] args) {
		int [] arrays = new int [15];
		System.out.println("Случайный массив имеет вид:");
		for (int i=0; i<arrays.length; i++){
			arrays [i] = (int)(Math.random()*101);		//create a random array
			System.out.print(arrays[i]+" ");
		}
		int maxValue = arrays[0];
		int indexNumber =0;
		for (int i=0; i<arrays.length; i++){			//search max value
			if (arrays[i]>maxValue){			
				maxValue = arrays[i];
				indexNumber = i;
			}
		}		
		System.out.println("\nНаибольший элемент равен "+maxValue+" и его индекс в массиве = "+indexNumber);	
	}
}
