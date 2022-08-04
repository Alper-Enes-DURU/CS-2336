import java.util.Scanner;
public class Ex_2_24
{
	public static void main(String[] args) {
		
		int i = 1;
        while (i < 10)
            if (i % 2 == 1)
                System.out.println(i++);
        
	    Scanner keybd = new Scanner(System.in);
		
		double distance;
		System.out.print("Enter the driving distance: ");
		distance = keybd.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = keybd.nextDouble();
        
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = keybd.nextDouble();
        
        double cost = (distance / milesPerGallon) * pricePerGallon;
        System.out.printf("Cost to travel to UTD %.2f", cost);
	}
}