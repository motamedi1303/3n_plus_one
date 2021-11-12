package com.motamedi.problem_3n_plus_one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {


	public static void main(String[] args) {
		List<NumberRange> numberRangeList = new ArrayList<NumberRange>();
		
		try (final Scanner in = new Scanner(System.in);) {
			System.out.println("Please enter i and j (for stop inputting, enter Letters):");
			while (in.hasNextInt()) {
				int i = in.nextInt();
				int j = in.nextInt();
				NumberRange numberRange = new NumberRange(i, j);
				numberRangeList.add(numberRange);
			}
			
			for (NumberRange numberRange : numberRangeList) {
				long resp = Problem3nPlusOne.maxCycleLength(numberRange.getI(), numberRange.getJ());
				System.out.println(numberRange.getI() + " " + numberRange.getJ() + " " + resp);
			}
		}
		catch (Exception e) {
			System.out.println("Invalid Input");		
		}

	}

}
