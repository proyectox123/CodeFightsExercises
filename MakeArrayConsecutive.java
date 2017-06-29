import java.util.ArrayList;
import java.util.Arrays;

public class MakeArrayConsecutive{

	public static void main(String[] args){
		//System.out.println("main 1 "+makeArrayConsecutive2(new int[]{0, 3}));
		System.out.println("main "+makeArrayConsecutive2(new int[]{6, 2, 3, 8}));
	}

	static int makeArrayConsecutive2(int[] statues) {
    	return (getMaxValue(statues)  - getMinValue(statues)) - (statues.length - 1);
	}

	static int getMaxValue(int[] array) {
    	int maxValue = array[0];
    	for (int i = 1; i < array.length; i++) {
        	if (array[i] > maxValue) {
	            maxValue = array[i];
    	    }
    	}
    
    	return maxValue;
	}

	static int getMinValue(int[] array) {
    	int minValue = array[0];
    	for (int i = 1; i < array.length; i++) {
        	if (array[i] < minValue) {
            	minValue = array[i];
        	}
    	}
    
    	return minValue;
	}

}