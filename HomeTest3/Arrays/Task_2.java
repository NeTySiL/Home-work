/*2. Создайте массив с 10-ю переменными типа int. Используя оператор "for" найдите и выведите на экран наименьшее и наибольшее значение в массиве.
min value =  "значение которое у вас получилось".
max value =  "значение которое у вас получилось".*/

public class Task_2 {

	public static void main(String[] args) {
		int [] arrays = {5,8,2,6,7,4,0,9,4,9};
		int min=arrays[0], max=arrays[0];
		for (int i=0; i<arrays.length; i++){
			if (arrays[i]>max)
				max = arrays[i];		//calculate max value
			if (arrays[i]<min)
				min = arrays[i];		//calculate min value
		}
		System.out.println("min value = "+min);
		System.out.println("max value = "+max);
	}
}
