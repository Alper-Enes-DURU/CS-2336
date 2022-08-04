/*
 * Geometry: two rectangles
 * A simple program that calculates whether one of the
 * rectangle is inside or overlaps the another rectangle.
 * @author Alper Duru
 */
package Homeworks.Homework1;
import java.util.Scanner;
import java.lang.Math;

public class Question5_3_28 {

	public static void main(String[] args) {
		Scanner keybd = new Scanner(System.in);
		
		double x1, y1, w1, h1;
		double x2, y2, w2, h2;

		// Assign each value for rectangle 1
		System.out.print("Enter r1\'s center x-, y-coordinates, width, and height: ");
		x1 = keybd.nextDouble();
		y1 = keybd.nextDouble();
		w1 = keybd.nextDouble();
		h1 = keybd.nextDouble();
		
		// Assign each value for rectangle 2
		System.out.print("Enter r2\'s center x-, y-coordinates, width, and height: ");
		x2 = keybd.nextDouble();
		y2 = keybd.nextDouble();
		w2 = keybd.nextDouble();
		h2 = keybd.nextDouble();
		
		/* 
		 * If the distance between the X-coordinates is less than or equal to
		 * the difference of widths divided in half and the distance between 
		 * the Y-coordinates is less than or equal to the difference of heights divided in half.
		 */
		if ((Math.abs(x1 - x2) <= Math.abs(w1 - w2)/2)
			 && Math.abs(y1 - y2) <= Math.abs(h1 - h2)/2)
		{
			System.out.println("r2 is inside r1");
		}
		/*
		 * If the distance between the X-coordinates is less than or equal to 
		 * the sum of widths divided in half and the distance between the 
		 * Y-coordinates is less than or equal to the sum of heights divided in half.
		 */
		else if((Math.abs(x1 - x2) <= (w1 + w2)/ 2)
				&& Math.abs(y1 - y2) <= (h1 + h2)/ 2)
		{
			System.out.println("r2 overlaps r1");
		}
		else
		{
			System.out.println("r2 does not overlap r1");
		}
	}
}