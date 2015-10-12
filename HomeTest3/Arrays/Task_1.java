//1. Создайте массив содержащий 10 переменных типа float (заполнить любыми своими числами). Далее используя оператор "for" вывести все 
//значения на экран в виде: "значение" | "значение 2" | "значение 3" |  и тд.После этого подсчитайте среднее арифметическое значение всех
//переменных и результат выведите на экран в виде: average value =  "значение которое у вас получилось".

public class Task_1 {

	public static void main(String[] args) {
		float [] arrays ={2,4,6,8,1,7,6,3,9,1};
		float sum = 0;
		for (int i=0; i<arrays.length;i++){
			System.out.print(arrays[i]+" | ");
			sum += arrays[i];				//calculate the sum
		}
		float average = sum/arrays.length;
		System.out.println("\naverage value = "+average);
	}	
}
