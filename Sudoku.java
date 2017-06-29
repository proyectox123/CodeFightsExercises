public class Sudoku{

	public static void main(String[] args){
		char[][] grid = new char[][]{
  			// {'.', '.', '.', '.', '2', '.', '.', '9', '.'},
  			// {'.', '.', '.', '.', '6', '.', '.', '.', '.'},
  			// {'7', '1', '.', '.', '7', '5', '.', '.', '.'},
  			// {'.', '7', '.', '.', '.', '.', '.', '.', '.'},
  			// {'.', '.', '.', '.', '8', '3', '.', '.', '.'},
  			// {'.', '.', '8', '.', '.', '7', '.', '6', '.'},
  			// {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
  			// {'.', '1', '.', '2', '.', '.', '.', '.', '.'},
  			// {'.', '2', '.', '.', '3', '.', '.', '.', '.'}
  			{'.','9','.','.','4','.','.','.','.'},
  			{'1','.','.','.','.','.','6','.','.'},
  			{'.','.','3','.','.','.','.','.','.'},
  			{'.','.','.','.','.','.','.','.','.'},
  			{'.','.','.','7','.','.','.','.','.'},
  			{'3','.','.','.','5','.','.','.','.'},
  			{'.','.','7','.','.','4','.','.','.'},
  			{'.','.','.','.','.','.','.','.','.'},
  			{'.','.','.','.','7','.','.','.','.'}
		};

        System.out.println("----> grid "+sudoku2(grid));
	}

	static boolean sudoku2(char[][] grid) {
		if(checkByRow(grid)){
			if(checkByColumn(grid)){
				if(checkByGrid3x3(grid)){
    				return true;
    			}
        	}
		}

    	return false;
	}

	static boolean isAPoint(char point){
		return point == '.';
	}

	static boolean checkByRow(char[][] grid){
		for(int row = 0; row < 9; row++){
   			for(int col = 0; col < 8; col++){
      			for(int col2 = col + 1; col2 < 9; col2++){
      				System.out.println("checkByRow grid["+row+"]["+col+"] "+grid[row][col]+" - grid["+row+"]["+col2+"] "+grid[row][col2]);
         			if(!isAPoint(grid[row][col]) && !isAPoint(grid[row][col2])){
         				if(grid[row][col]==grid[row][col2]){
            				return false;
            			}
            		}
        		}
        	}
        }

        return true;
	}

	static boolean checkByColumn(char[][] grid){
		for(int col = 0; col < 9; col++){
   			for(int row = 0; row < 8; row++){
      			for(int row2 = row + 1; row2 < 9; row2++){
      				System.out.println("checkByColumn grid["+row+"]["+col+"] "+grid[row][col]+" - grid["+row2+"]["+col+"] "+grid[row2][col]);
         			if(!isAPoint(grid[row][col]) && !isAPoint(grid[row2][col])){
         				if(grid[row][col]==grid[row2][col]){
            				return false;
            			}
            		}
    		    }
    		}
    	}

    	return true;
	}

	static boolean checkByGrid3x3(char[][] grid){
		for(int row = 0; row < 9; row += 3){
   			for(int col = 0; col < 9; col += 3){
      			// row, col is start of the 3 by 3 grid
      			for(int pos = 0; pos < 8; pos++){
         			for(int pos2 = pos + 1; pos2 < 9; pos2++){
         				System.out.println("checkByColumn grid["+(row + pos%3)+"]["+(col + pos/3)+"] "+grid[row + pos%3][col + pos/3]+" - grid["+(row + pos2%3)+"]["+(col + pos2/3)+"] "+grid[row + pos2%3][col + pos2/3]);
            			if(!isAPoint(grid[row + pos%3][col + pos/3]) && !isAPoint(grid[row + pos2%3][col + pos2/3])){
            				if(grid[row + pos%3][col + pos/3]==grid[row + pos2%3][col + pos2/3]){
               					return false;
               				}
               			}
               		}
               	}
            }
        }

		return true;
	}

	/*
boolean sudoku2(char[][] grid) {
    for (int i = 0; i < 9; i++) {

        char[] row = new char[9];
        char[] square = new char[9];
        char[] column = grid[i].clone();

        for (int j = 0; j < 9; j ++) {
            row[j] = grid[j][i];
            square[j] = grid[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
        }
        if (!(validate(column) && validate(row) && validate(square)))
            return false;
    }
    return true;
}

private boolean validate(char[] check) {
    String i = "";
    Arrays.sort(check);
    for (char number : check) {
        if(i.indexOf(number)!=-1 && number!='.')
            return false;
        if(number!='.')
            i+=number;
    }
    return true;
}
	*/
}