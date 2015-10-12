//5. Реализуйте алгоритм, определяющий, все ли символы в строке встречаются один раз.
public class SymbolOnce {

	public static void main(String[] args) {
		String text = "Сюда вы можете ввести любой текст";
		String [] words = text.split(" ");
		int x = 0;
		end :for (int i=0; i<words.length; i++){
			 char [] arr = words[i].toCharArray();
			 
			 for (int j=0; j<arr.length; j++){				
				 int indexOf = text.indexOf(arr[j]);
				 int lastIndex = text.lastIndexOf(arr[j]);
				 if (indexOf!=lastIndex){					//We compare the position of a character with the beginning and end string
					 x +=1 ;								//if they are not equal , so, symbol repeated
					 break end;
				 }
			 }	 
		}
		if (x==0)
			System.out.println("В строке нет повторяющихся символов!");
		else
			System.out.println("В строке есть повторяющиеся символы!");
	}
}
