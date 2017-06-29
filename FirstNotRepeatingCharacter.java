public class FirstNotRepeatingCharacter{

	public static void main(String[] args){
		//char firstNotRepeatingCharacter = firstNotRepeatingCharacter("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof");
        char firstNotRepeatingCharacter = firstNotRepeatingCharacter("bcccccccb");
        System.out.println("----> main "+firstNotRepeatingCharacter);
	}

	static char firstNotRepeatingCharacter(String s){
        if(s.length() == 0){
            return '_';
        }
    
        char firstCharacter = s.charAt(0);
        String newString = new String(s.substring(1));
        char[] value = validate(firstCharacter, newString);
        
        if(value[0] == '_' && value[1] != '_' && newString.length() > 1){
            return firstNotRepeatingCharacter(newString.replace(value[1]+"", ""));
        }


        return value[0];
    }

    static char[] validate(char firstCharacter, String value){
        for(int i = 0; i < value.length(); i++){
            if(value.charAt(i) == firstCharacter){
                return new char[]{'_', firstCharacter};
            }
        }

        return new char[]{firstCharacter, '_'};
    }

    /*
char firstNotRepeatingCharacter(String s) {
    char[] c=s.toCharArray();
for(int i=0;i<s.length();i++){
    if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
        return c[i];
}
    return '_';
}

    */
}