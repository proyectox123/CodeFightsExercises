import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class ReverseParentheses{

	public static void main(String[] args){
		String reverseParentheses = reverseParentheses("a(bcdefghijkl(mno)p)q");
        System.out.println("----> main "+reverseParentheses);
	}

	static String reverseParentheses(String s) {
		int j = s.length();
		int openPar = -1;
		int closePar = -1;
		char[] c = s.toCharArray();
		
		for(int i=0; i<c.length; i++){
			//System.out.println("----> reverseParentheses ("+i+") "+c[i]);
			if(c[i] == '('){
				System.out.println("----> reverseParentheses ("+i+") open ");
			}

			if(c[i] == ')'){
				System.out.println("----> reverseParentheses ("+i+") close ");
			}
		}

		return s;
	}
}
