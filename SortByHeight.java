import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class SortByHeight{

	public static void main(String[] args){
		int [] array = new int[]{
			-1, 150, 190, 170, -1, -1, 160, 180
		};
		int[] sortByHeight = sortByHeight(array);
		for(int i=0; i<sortByHeight.length; i++){
			System.out.println("main ("+i+") "+sortByHeight[i]);
		}
	}

	static int[] sortByHeight(int[] a) {
		List<Integer> sortList = getSortList(a);
		List<Integer> completeList = getCompleteList(a, sortList);
		Integer[] wrapperArr = completeList.toArray(new Integer[completeList.size()]);
		return Arrays.stream(wrapperArr).mapToInt(Integer::intValue).toArray();
	}

	static List<Integer> getSortList(int[] a){
		List<Integer> sortList = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++){
			if(a[i] == -1){
				continue;
			}

			sortList.add(a[i]);
		}

		Collections.sort(sortList);
		return sortList;
	}

	static List<Integer> getCompleteList(int[] a, List<Integer> sortList){
		int j=0;
		List<Integer> completeList = new ArrayList<Integer>();		
		for(int i=0; i<a.length; i++){
			if(a[i] == -1){
				completeList.add(a[i]);
				continue;
			}

			completeList.add(sortList.get(j));
			j++;
		}

		return completeList;
	}
}