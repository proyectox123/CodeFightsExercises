public class MatrixElementsSum{

	public static void main(String[] args){
		int[][] matrix = new int[][]{
			//{0, 1, 1, 2},
			//{0, 5, 0, 0}, 
			//{2, 0, 3, 3}

			{1,1,1,0}, 
 			{0,5,0,1}, 
 			{2,1,3,10}
		};
        System.out.println("main "+matrixElementsSum(matrix));
	}

	static int matrixElementsSum(int[][] matrix) {
		int sum = 0;
		int row = matrix.length;
		System.out.println("matrixElementsSum row "+row);
		for(int i=0; i<row; i++){
			for(int j=0; j<matrix[i].length; j++){
				System.out.println("matrixElementsSum ("+i+")("+j+") "+matrix[i][j]);
				if(matrix[i][j] < 0){
					continue;
				}

				if(matrix[i][j] == 0){//It's haunted
					if(row > (i+1)){
						if(matrix[i+1][j] != 0){
							matrix[i+1][j] = 0;
						}
					}

					continue;
				}

				sum += matrix[i][j];
			}
		}

		return sum;
	}
}