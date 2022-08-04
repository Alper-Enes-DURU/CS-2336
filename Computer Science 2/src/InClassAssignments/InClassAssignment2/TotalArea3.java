public class TotalArea3 {

	public static void main(String[] args) {
		
		Circle[] circleArray = new Circle[5];
		
		createCircleArray(circleArray);
						
		printCircleArray(circleArray);
		
	}
	
	public static void createCircleArray(Circle[] circleArray) {
		//Circle[] circleArray = new Circle[5];
		
		for(int i = 0; i< circleArray.length; i++) {
			circleArray[i] = new Circle(Math.random() * 100);
		}
		
		return;
	
	}
	
	public static void printCircleArray(Circle[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
		}
		
		System.out.println("-------------------------------------------------");
		
		System.out.printf("%-30s%-15s\n", "The total area of circle is", sum(circleArray));
	}
	
	public static double sum(Circle[] circleArray) {
		double sum = 0;
		
		for (int i = 0; i < circleArray.length; i++) {
			sum += circleArray[i].getArea();
		}
		
		return sum;
	}
}
