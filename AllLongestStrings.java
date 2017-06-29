import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings{

	public static void main(String[] args){
		String[] inputArray =  new String[]{
			"aba", "aa", "ad", "vcd", "aba"
		};
		String[] newArray = allLongestStrings(inputArray);
		for(int i=0; i<newArray.length; i++){
			System.out.println("main ("+i+") "+(newArray[i]));
		}
	}

	static String[] allLongestStrings(String[] inputArray) {
		int maxLength = getMaxWordLength(inputArray);

		List<String> stockList = getNewList(maxLength, inputArray);

		String[] stockArr = new String[stockList.size()];
		return stockList.toArray(stockArr);
	}

	static int getMaxWordLength(String[] inputArray){
		int maxLength = 0;
		for(int i=0; i<inputArray.length; i++){
			if(inputArray[i].length() <= maxLength){
				continue;
			}

			maxLength = inputArray[i].length();
		}

		return maxLength;
	}

	static List<String> getNewList(int maxLength, String[] inputArray){
		List<String> stockList = new ArrayList<String>();
		for(int i=0; i<inputArray.length; i++){
			if(inputArray[i].length() != maxLength){
				continue;
			}

			stockList.add(inputArray[i]);
		}

		return stockList;
	}
}