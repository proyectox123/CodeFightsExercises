public class RotateImage {

	public static void main(String[] args){
		int[][] rotateImage = rotateImage(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        for(int i = 0; i < rotateImage.length; i++) {
	        for(int j = 0; j < rotateImage[i].length; j++) {
    	        System.out.println("----> ["+i+"]["+j+"] "+rotateImage[i][j]);
        	}
    	}
	}

	static int[][] rotateImage(int[][] a) {
		final int M = a.length;
    	final int N = a[0].length;
    	int[][] rotateImage = new int[N][M];
    	
    	for (int i = 0; i < M; i++) {
        	for (int j = 0; j < N; j++) {
            	rotateImage[j][M-1-i] = a[i][j];
        	}
    	}

    	return rotateImage;
	}
}