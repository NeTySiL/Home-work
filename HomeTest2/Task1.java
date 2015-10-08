//Создайте переменную типа String c любым текстом (не сильно короткое).Далее выведите на экран количество символов в данной строке.
// Далее разделите строку пополам (если ровно поделить не выходит то +-1 не страшно), в результате у вас должно быть 2-е новых переменных типа String с частями из изначальной строки. Полученные строки выведите на экран.

public class Task1 {

	public static void main(String[] args) {
		String text = "This line is an excellent example for the task";
		int variable = text.length();
		System.out.println(variable);
		//division the text
		variable /=2;
		String  part1 = text.substring(0, variable);
		String  part2 = text.substring(variable);
		System.out.println(part1);
		System.out.println(part2);

	}

}
