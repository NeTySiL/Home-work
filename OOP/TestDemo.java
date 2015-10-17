import java.util.*;

public class TestDemo {
	static Abiturient [] list = listAbiturients();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		printListAllAbiturients();						//вывод на экран список всех абитуриентов
		System.out.println("\nВыберите действие которое хотите выполнить:");
		System.out.println("Введите цифру 1 - список студентов имеющих неудовлетворительные оценки");
		System.out.println("Введите цифру 2 - список студентов у которых балл выше заданного");
		System.out.println("Введите цифру 3 - выббрать заданное число n абитуриентов, имеющих самый высокий балл");
		String n = scan.next();
		switch (n){
			case "1":
				badRatings();
				break;
			case "2":
				System.out.print("Введите значение бала: ");
				int grade = scan.nextInt();
				sortingAbiturientsRating(grade);
				break;
			case "3":
				System.out.print("Количество абитуриентов с максимальным баллом: ");
				int w = scan.nextInt();
				listMaxRating(w);
				break;
			default:
				System.out.println("Введен неверный символ команды");
		}
		scan.close();
	}
		//Метод возвращает массив объектов
	private static Abiturient [] listAbiturients() {
		Abiturient [] listAbiturients = new Abiturient[8];
		listAbiturients [0] = new Abiturient(2751, "Dahnevich", "Valentina", "Alexandrovna", "Minsk", 336203650, 5);
		listAbiturients [1] = new Abiturient(2354, "Gavrilevich", "Mihail", "Ipolitovich", "Gomel", 296489234, 2);
		listAbiturients [2] = new Abiturient(4353, "Kononchenko", "Elena", "Sergeevna", "Lida", 294507853, 4);
		listAbiturients [3] = new Abiturient(1552, "Mishenko", "Sergey", "Olegovich", "Soligorsk", 336707089, 4);
		listAbiturients [4] = new Abiturient(7455, "Gus", "Artem", "Nikolaevich", "Minsk", 294560987, 3);
		listAbiturients [5] = new Abiturient(2456, "Popov", "Inakentiy", "Jakovlevich", "Brest", 259805050, 5);
		listAbiturients [6] = new Abiturient(3226, "Vetrov", "Stepan", "Vladimirovich", "Minsk", 292353567, 3);
		listAbiturients [7] = new Abiturient(1087, "Demeshko", "Danil", "Antonovich", "Pskov", 331604220, 4);
		return listAbiturients;
	}
		//сортирует по баллу и выводит n абитуриентов с max баллом
	public static void listMaxRating(int n){
		Arrays.sort(list);
		tableHeader();
		for (int i=list.length-1; i>list.length-1-n; i--){
			printAbiturient(i);
		}
	}
		//вывод на экран одного абитуриента
	public static void printAbiturient(int k){
		System.out.printf("%-8s%-15s%-12s%-15s%-12s%-12s%-6s%n", list[k].getId(), list[k].getSurname(), list[k].getName(), list[k].getPatronymic(), list[k].getAddress(), list[k].getPhone(), list[k].getRating());
	}
		//вывод на экран шапку таблицы
	public static void tableHeader() {
		System.out.printf("%-8s%-15s%-12s%-15s%-12s%-12s%-6s%n", "Id", "Surname", "Name", "Patronymic", "Address", "Phone", "Rating");
		System.out.println("--------------------------------------------------------------------------------");
	}
		//вывод на экран список всех абитуриентов
	public static void printListAllAbiturients() {
		System.out.println("\tСписок всех абитуриентов\n");
		tableHeader();
		for (int i=0; i<list.length; i++){
			printAbiturient(i);
		}
	}
		//вывод на экран абитуриентов с баллом выше установленного
	public static void sortingAbiturientsRating(int grade){
		System.out.println("\n\tСписок абитуриентов с оценками выше "+"\""+grade+"\"");
		tableHeader();
		for (int i=0; i<list.length; i++){
			if (list[i].getRating()>grade)
				printAbiturient(i);
		}	
	}
		//вывод на экран двоишников
	public static void badRatings() {
		System.out.println("\n\tНеудовлетворительные оценки получили:");
		tableHeader();
		for (int i=0; i<list.length; i++){
			if (list[i].getRating()<3)
				printAbiturient(i);
		}
	}
}
