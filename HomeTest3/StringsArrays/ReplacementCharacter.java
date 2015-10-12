//1. В каждом слове текста k-ю букву заменить заданным символом c клавиатуры. Если k больше длины слова, корректировку не выполнять.
import java.util.Scanner;

public class ReplacementCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите ваш текст:");
		String text = scan.nextLine();
		System.out.print("Введите номер буквы, которую вы хотите заменить в каждом слове: ");
		int k = scan.nextInt()-1;
		System.out.print("На какой символ будет произведена замена; введите символ: ");
		char symbol = scan.next().charAt(0);
		
		int wordLength = 0;
		String [] words = text.split(" ");				//split into words
		for(int i=0; i<words.length; i++){				
			char [] charArrays = words[i].toCharArray();	//every word convert in char arrays
			wordLength = charArrays.length;
			if (words[i].endsWith(",") || words[i].endsWith(".") || words[i].endsWith("!") || words[i].endsWith("?") || words[i].endsWith(":"))
				wordLength -= 1;							//elimination change last symbol if word ending separating character
			if (wordLength > k)
				charArrays [k] = symbol;				//change symbol
			for (char v : charArrays)					
			    System.out.print(v);
		System.out.print(" ");
		}
		scan.close();
	}
}
