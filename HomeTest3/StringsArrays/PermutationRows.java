//6. Для двух строк напишите метод, определяющий, является ли одна строка перестановкой другой.
public class PermutationRows {

	public static void main(String[] args) {
		String textOne = "Исходная строка с разными словами";
		String textTwo = "Строка исходная с словами разными";
		String [] arrayWords = textOne.toLowerCase().split(" ");
		String [] arrayWordsTwo = textTwo.toLowerCase().split(" ");
		int sum = 0;					
		if (arrayWords.length==arrayWordsTwo.length){
   end :for (int i=0; i<arrayWords.length; i++){
	   		sum = 0;											//number of coincidence
			for (int j=0; j<arrayWordsTwo.length; j++){
				if (arrayWords[i].equals(arrayWordsTwo[j]))
					sum +=1;
			}
			if (sum==0)
				break end;
		}
		}
		if (sum==0)
			System.out.println("Одна строка НЕ является перестановкой другой");
		else
			System.out.println("Ура! Одна строка является перестановкой другой");
	}
}
