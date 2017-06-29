import java.util.ArrayList;
import java.util.Arrays;

public class IsCryptSolution{
	
	public static void main(String[] args){

		String[] crypt = new String[]{
			"SEND", "MORE", "MONEY"
			//"TEN", "TWO", "ONE"
			//"A", "A", "A"
		};
		char[][] solution = new char[][]{
			{'O', '0'},
			{'M', '1'},
			{'Y', '2'},
			{'E', '5'},
			{'N', '6'},
			{'D', '7'},
			//{'R', '8'},
			{'R', '9'},
			{'S', '9'}
			
			// {'O', '1'},
   //          {'T', '0'},
   //          {'W', '9'},
   //          {'E', '5'},
   //          {'N', '4'}

            //{'A', '0'}
		};

		boolean isCryptSolution = isCryptSolution(crypt, solution);
        System.out.println("----> main "+isCryptSolution);
	}
/*
	static boolean isCryptSolution(String[] crypt, char[][] solution) {
		if(crypt != null && crypt.length == 3){
			if(crypt[0].length() > 0 && crypt[0].length() <= 14 &&
				crypt[1].length() > 0 && crypt[1].length() <= 14 &&
				crypt[2].length() > 0 && crypt[2].length() <= 14){

				if(validSolution(solution)){
        			return sumMounts(crypt, solution);
        		}
    		}
    	}

        return false;
    }

    static boolean validSolution(char[][] solution){
    	if(solution != null){
    		for(int i=0; i<solution.length; i++) {
    			if(solution[i].length != 2){
    				return false;
    			}

    			char letter = solution[i][0];
    			char value = solution[i][1];

    			if(letter < 'A' && letter > 'Z' || value < '0' && value > '9'){
    				return false;
    			}
    		}

    		ArrayList<String> newalgo = new ArrayList<>();
    		for(int i=0; i<solution.length; i++) {
    			//System.out.println("----> validSolution ("+i+") "+solution[i][0]);
    			newalgo.add(solution[i][0]+"");
    		}

    		for (int i = 0; i < newalgo.size(); i++){
    			for (int j = i + 1 ; j < newalgo.size(); j++) {
    				//System.out.println("----> validSolution ("+i+")("+j+") "+newalgo.get(i)+" | "+newalgo.get(j));
    				if (newalgo.get(i).equals(newalgo.get(j))) {
    					return false;
    				}
    			}
    		}

    		newalgo = new ArrayList<>();
    		for(int i=0; i<solution.length; i++) {
    			//System.out.println("----> validSolution ("+i+") "+solution[i][1]);
    			newalgo.add(solution[i][1]+"");
    		}

    		for (int i = 0; i < newalgo.size(); i++){
    			for (int j = i + 1 ; j < newalgo.size(); j++) {
    				//System.out.println("----> validSolution ("+i+")("+j+") "+newalgo.get(i)+" | "+newalgo.get(j));
    				if (newalgo.get(i).equals(newalgo.get(j))) {
    					return false;
    				}
    			}
    		}

			System.out.println("----> validSolution true");
    		return true;
    	}

		System.out.println("----> validSolution false");
    	return false;
    }

    static boolean sumMounts(String[] crypt, char[][] solution){
    	String value1 = iterateWord(crypt[0], solution);
    	String value2 = iterateWord(crypt[1], solution);
        String value3 = iterateWord(crypt[2], solution);

		System.out.println("----> sumMounts "+value1+" "+value2+" "+value3);
        boolean v1 = validStringForEquation(value1);
        boolean v2 = validStringForEquation(value2);
        boolean v3 = validStringForEquation(value3);
        System.out.println("----> sumMounts "+(v1 && v2 && v3));
        if(v1 && v2 && v3){
        	long mount1 = Long.parseLong(value1);
       		long mount2 = Long.parseLong(value2);
      		long mount3 = Long.parseLong(value3);
    	   	if(mount1 + mount2 == mount3){
    	   		return true;
        	}
    	}

    	return false;
    }

    static boolean validStringForEquation(String value){
    	return value.charAt(0) != '0' || value.length() < 2;
    }

    static String iterateWord(String word, char[][] solution){
        String valueInString = "";
        for (int i = 0; i < word.length(); i++) {
            valueInString += getValue(word.charAt(i), solution);
        }

        return valueInString;
    }

    static String getValue(char character, char[][] solution){
        for(int i=0; i<solution.length; i++) {
            if(solution[i][0] == character){
                return solution[i][1]+"";
            }
        }

        return "";
    }
*/
	static boolean isCryptSolution(String[] crypt, char[][] solution) {
    	for(char[] arr : solution){
        	for(int i = 0; i < crypt.length; i++){
            	crypt[i]=crypt[i].replace(arr[0],arr[1]);
        	}
        	
        	System.out.println(Arrays.toString(crypt));
    	}
    
    	for(int i = 0; i < crypt.length; i++){
        	if(!crypt[i].equals("0")&&crypt[i].startsWith("0")){
            	return false;
        	}
    	}
    
    	return Long.parseLong(crypt[0])+Long.parseLong(crypt[1])==Long.parseLong(crypt[2]);
	}
}