public class AdjacentElementsProduct{

	public static void main(String[] args){
		int adjacentElementsProduct = adjacentElementsProduct(new int[]{3, 6, -2, -5, 7, 3});
		System.out.println("main "+adjacentElementsProduct);
	}

	static int adjacentElementsProduct(int[] inputArray) {
		int maxProduct = -1000;
		int j = 0;
		for(int i=0; i<inputArray.length; i++){
			j = i+1;
			if(j < inputArray.length){
				int product = inputArray[i] * inputArray[j];
				if(product > maxProduct){
					maxProduct = product;
				}
			}
		}

		return maxProduct;
	}
}