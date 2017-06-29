public class CommonCharacterCount{

	public static void main(String[] args){
		int commonCharacterCount = commonCharacterCount("aabcc", "adcaa");
		System.out.println("main "+commonCharacterCount);
	}

	static int commonCharacterCount(String s1, String s2) {
		int counter = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (!(s2.contains(s1.charAt(i) + ""))) {
				continue;
			}

			counter++;
			s2 = s2.replaceFirst(s1.charAt(i) + "", "");
		}
		
		return counter++;
	}

}