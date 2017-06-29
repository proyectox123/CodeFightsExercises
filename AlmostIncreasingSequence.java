import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlmostIncreasingSequence{

	public static void main(String[] args){
		//System.out.println("main "+almostIncreasingSequence(new int[]{1, 2, 3, 4, 5, 11, 10, 20}));
        //System.out.println("main "+almostIncreasingSequence(new int[]{1, 2, 3, 4, 3, 6}));
        System.out.println("main "+almostIncreasingSequence(new int[]{1, 3, 2, 1}));
	}

    static boolean almostIncreasingSequence(int[] sequence) {
int prevValueToMaxValue = Integer.MIN_VALUE;
int maxVlue = Integer.MIN_VALUE;

    int n = 0;
    for (int i = 0; i < sequence.length; i++) {

        if (sequence[i] <= prevValueToMaxValue || sequence[i] == maxVlue) {
            n++;
        }

        if (i - 1 > -1 && (sequence[i] <= sequence[i - 1])) {
            maxVlue = sequence[i - 1];
            if (i - 2 > -1)
                prevValueToMaxValue = sequence[i - 2];
            n++;
        }

    }

    if (n == 1 || n == 0) {
        return true;
    }
    return false;
} 

/*
    static boolean almostIncreasingSequence(int[] sequence) {
        int length = sequence.length;
    if(length ==1) return true;
    if(length ==2 && sequence[1] > sequence[0]) return true;
    int count = 0;
    int index = 0;
    boolean iter = true;

    while(iter){
        index = checkSequence(sequence,index);
        if(index != -1){
            count++;
            index++;
            if(index >= length-1){
                iter=false;
            }else if(index-1 !=0){
                if(sequence[index-1] <= sequence[index]){
                    iter=false;
                    count++;
                }else if(((sequence[index] <= sequence[index-2])) && ((sequence[index+1] <= sequence[index-1]))){
                    iter=false;
                    count++;                    
                }
            }
        }else{
            iter = false;
        }
    }
    if(count > 1) return false;
    return true;
    }

    static int checkSequence(int[] sequence, int index){
    for(; index < sequence.length-1; index++){
        if(sequence[index+1] <= sequence[index]){
            return index; 
        }
    }
    return -1;
}

    static int validatePair(int[] sequence, int k){
        for (int i = 0; i < sequence.length -1 ; i++){
            if (sequence[i] >= sequence[i+1]){
                return i;
            }
        }
        
        return -1;
    }
    */
}