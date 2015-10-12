import java.util.Scanner;

//2. В английском тексте каждую букву заменить ее порядковым номером в алфавите. При выводе в одной строке печатать текст с 
//двумя пробелами между буквами, в следующей строке внизу под каждой буквой печатать ее номер.

public class NumberLettersAlphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите ваш текст на английским языке:");
		String text = scan.nextLine();
		
		int variable = 0;								//number of letters in alphabet
		String lowerCase= text.toLowerCase();
		char [] charArray = lowerCase.toCharArray();	//write every symbol with two indent
		for (char v: charArray){
			System.out.printf("%3c",v);
		}
		System.out.println("");							//new line
			for (int i=0; i<charArray.length; i++){
				variable = (int)charArray[i]-96;		//to determine the serial number symbol in alphabet
				if (variable>0 & variable<=26){
					System.out.printf("%3d",variable);
				}
				else 									//if symbol not Eng alphabet - write gap
					System.out.printf("%3s","  ");
			}
		scan.close();
	}
}
