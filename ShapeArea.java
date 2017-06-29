public class ShapeArea{

	public static void main(String[] args){
		int shapeArea = shapeArea(4);
		System.out.println("main 1 "+shapeArea(1));//1
		System.out.println("main 2 "+shapeArea(2));//5
		System.out.println("main 3 "+shapeArea(3));//13
		System.out.println("main 4 "+shapeArea(4));//25
		System.out.println("main 5 "+shapeArea(5));//41
	}

	static int shapeArea(int n) {
    	return (n*n) + (n * (n - 2) + 1);
	}

}