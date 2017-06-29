public class FirstDuplicate{

	public static void main(String[] args){
		int firstDuplicate = firstDuplicate(new int[]{10, 6, 8, 4, 9, 1, 7, 2, 5, 3});
		System.out.println("FirstDuplicate main "+firstDuplicate);
	}

	static int firstDuplicate(int[] a) {
    	for (int i = 0; i < a.length; i++) {
            int index = Math.abs(a[i]) - 1;
            if (a[index] < 0) {
                return Math.abs(a[i]);
            }
    
            a[index] = -1 * a[index];
        }
  
        return -1;
    }

    /*
int firstDuplicate(int[] a) {
    for(int i=0;i<a.length;i++)
        if(a[Math.abs(a[i])-1]<0)
            return Math.abs(a[i]);
        else{
            a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
        }
    return -1;
}

    */
}