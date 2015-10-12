//3. Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.

import java.util.Scanner;

public class DelateSymbol {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your text please:");
		String text = scan.nextLine().toLowerCase();
		
		int numberUnicode = 0;
		char [] arraySymbol = text.toCharArray();
		for (int i=0; i<arraySymbol.length; i++){
			numberUnicode = (int)arraySymbol[i];
			if (numberUnicode>=97 & numberUnicode<=122 | numberUnicode==32)    //range unicode of English alphabet + unicode symbol " "
				System.out.print(arraySymbol[i]);
		}
		scan.close();
	}
}
