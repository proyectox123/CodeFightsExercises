public class IsLucky{

	public static void main(String[] args){
		boolean isLucky = isLucky(106601);
		System.out.println("main "+isLucky);
	}

	static boolean isLucky(int n) {
		String number = n+"";
		String firstPart = number.substring(0, (number.length())/2);
		String secondPart = number.substring((number.length())/2, number.length());

		return getMount(firstPart) == getMount(secondPart);
	}

	static int getMount(String s){
		int mount = 0;
		for(int i=0; i<s.length(); i++){
			mount += Integer.parseInt(String.valueOf(s.charAt(i)));

			System.out.println("getMount s "+s.charAt(i)+" mount "+mount);
		}

		return mount;	
	}

}