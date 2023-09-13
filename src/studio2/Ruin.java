package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input your starting amount: ");
		Double startAmount = in.nextDouble();
		System.out.println("Input your chance of winning (Input number 0-1): ");
		Double winChance = in.nextDouble();
		System.out.println("With how much money do you win: ");
		double winLimit = in.nextDouble();
		System.out.println("Input how many days you are playing: ");
		int days = in.nextInt();
		int totalSimulations = 0;
		String result = "";
		for (int countdays = 1; countdays <= days; countdays++)
		{
		while (startAmount>0 && startAmount<winLimit)
		{
			totalSimulations = 	totalSimulations+1;
			if (Math.random() <= winChance)
			{
				startAmount = startAmount+1;
			}
			else 
			{
				startAmount = startAmount-1;
		
			}
			if (startAmount==0)
			result = " LOSE";
			else
			result = " WIN";
		}
		System.out.println("Simulation " + countdays + ": "+ totalSimulations + result);
		}
	}

}
