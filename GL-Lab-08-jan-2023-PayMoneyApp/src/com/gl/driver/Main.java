package com.gl.driver;

import java.util.Scanner;

import com.gl.services.TargetAchieves;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");

		int numberofTransaction = sc.nextInt();

		int[] transactions = new int[numberofTransaction];

		System.out.println("Enter the values of array");

		for (int i = 0; i < numberofTransaction; i++) {

			transactions[i] = sc.nextInt();
		}

		TargetAchieves ta = new TargetAchieves();

		// ta.printTransactions(transactions);

		System.out.println("enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();

		while (targetNo-- != 0) {

			System.out.println("Enter the value of target");

			int traget = sc.nextInt();

			ta.findTaretAchieves(transactions, traget);

		}

	}

}
