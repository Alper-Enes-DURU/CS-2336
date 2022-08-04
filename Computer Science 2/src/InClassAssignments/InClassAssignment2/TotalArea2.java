public class TotalArea2 {

	static Circle[] circleArray;
	
	public static void main(String[] args) {
		
		circleArray = createCircleArray();
						
		printCircleArray();
		
	}
	
	public static Circle[] createCircleArray() {
		circleArray = new Circle[5];
		
		for(int i = 0; i< circleArray.length; i++) {
			circleArray[i] = new Circle(Math.random() * 100);
		}
		return circleArray;
	}
	
	public static void printCircleArray() {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
		}
		
		System.out.println("-------------------------------------------------");
		
		System.out.printf("%-30s%-15s\n", "The total area of circle is", sum());
	}
	
	public static double sum() {
		double sum = 0;
		
		for (int i = 0; i < circleArray.length; i++) {
			sum += circleArray[i].getArea();
		}
		
		return sum;
	}
}
