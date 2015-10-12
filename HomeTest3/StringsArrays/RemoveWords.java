//4. Из текста удалить все слова заданной длины, начинающиеся на согласную букву.

import java.util.Scanner;

public class RemoveWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите текст:");
		String text = scan.nextLine().toLowerCase();
		System.out.print("Введите длинну слов-которые вы хотите удалить:");
		int k = scan.nextInt();
		int wordLength = 0;
		
		String [] words = text.split(" ");
		 for (int i=0; i<words.length; i++){
			 wordLength = k;
			char [] array = words[i].toCharArray();																   //every word convert in char arrays
			if (array[0]!='a' | array[0]!='e' | array[0]!='i' | array[0]!='o' | array[0]!='u' | array[0]!='y'){    //every word begins not vowel
				if (words[i].endsWith(",") || words[i].endsWith(".") || words[i].endsWith("!") || words[i].endsWith("?") || words[i].endsWith(":"))
					wordLength -=1;
				if (array.length==wordLength)				//delete word
					continue ;
			}	
			for (char w: array)
			System.out.print(w);
			System.out.print(" ");	
		}
		scan.close();
	}
}
