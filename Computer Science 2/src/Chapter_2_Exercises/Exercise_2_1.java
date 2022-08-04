package Chapter_2_Exercises;
import java.util.Scanner;

public class Exercise_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keybdValue = new Scanner(System.in);
		
		double miles, kilometers;
		System.out.print("Enter miles: ");
		miles = keybdValue.nextDouble();
		
		kilometers = miles * 1.6;
		System.out.printf("%.2f miles is ", miles);
		System.out.printf("%.1f kilometers", kilometers);
	}

}
