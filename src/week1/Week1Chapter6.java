package week1;

import java.util.Scanner;

public class Week1Chapter6
{
	/**
	 * Learn page 209: A static method can call....
	 * @param args
	 */
	
	
	public static void main(String[] args)
	{
		Week1Chapter6 comp = new Week1Chapter6();
		Scanner scanner = new Scanner(System.in);
		System.out.println("input 3 numbers:");
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		double number3 = scanner.nextDouble();
		
		double result = maximum(number1, number2, number3);
		
		System.out.println("Max is: " + result);
	}
	
	public static double maximum(double x, double y, double z)
	{
		double maxValue = x;
		
		if (y  > maxValue)
		{
			maxValue = y;
		}
		else if ( z > maxValue)
		{
			maxValue = z;
		}
		return maxValue;
	}
}