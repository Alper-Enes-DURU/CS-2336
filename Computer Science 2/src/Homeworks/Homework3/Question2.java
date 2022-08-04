/*
 * Partition of a list
 * After the partition, the elements in the list are rearranged so
 * all the elements before the pivot are less than or equal to the 
 * pivot, and the elements after the pivot are greater than the pivot. 
 * The method returns the index where the pivot is located in the new list.
 * @author Alper Duru
 */

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner keybInput = new Scanner(System.in);

		System.out.print("Enter list size: ");
		
		// Create an array with the user defined size
		int[] partitionList = new int[keybInput.nextInt()];

		System.out.print("Enter list content: ");
		
		// Assign each element of the array
		for (int j = 0; j < partitionList.length; j++)
		{
			partitionList[j] = keybInput.nextInt();
		}

		// Call the method for partition
		partition(partitionList);

		// Print the result to the user
		System.out.print("After the partition, the list is ");

		for (int k = 0; k < partitionList.length; k++)
		{
			System.out.print(partitionList[k] + " ");
		}
	}

	// Method that partitions the list using the
	// first element, called a pivot.
	public static void partition(int[] partitionList) {
		int firstValueOfThePartitionList = partitionList[0];
		int partLocation = 0;
		int lastIndexOfThePartitionList = partitionList.length - 1;

		while (partLocation < lastIndexOfThePartitionList) {
			if (firstValueOfThePartitionList > partitionList[partLocation + 1])
			{
				// Swap the elements
				partitionList[partLocation] = partitionList[partLocation + 1];
				partitionList[partLocation + 1] = firstValueOfThePartitionList;
				partLocation++;
			}
			else
			{
				// Move the element to the end of the list
				int tempValue = partitionList[lastIndexOfThePartitionList];
				partitionList[lastIndexOfThePartitionList] = partitionList[partLocation + 1];
				partitionList[partLocation + 1] = tempValue;
				lastIndexOfThePartitionList--;
			}
		}
	}
}
