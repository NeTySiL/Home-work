//5. В массиве из 15 чисел найти наименьший элемент и его индекс в массиве. 
public class Task_5 {

	public static void main(String[] args) {
		int [] arr = new int [15];
		System.out.println("Случайный массив:");
		for (int i=0; i<arr.length; i++){
			arr [i] = (int)(Math.random()*11);		//create a random array
			System.out.print(arr[i]+" ");
		}
		int minValue = arr[0];
		int indexNumber =0;
		for (int i=0; i<arr.length; i++){			//search min value
			if (arr[i]<minValue){			
				minValue = arr[i];
				indexNumber = i;
			}
		}		
		System.out.println("\nНаименьший элемент равен "+minValue+" и его индекс в массиве = "+indexNumber);	
		
	}
}
