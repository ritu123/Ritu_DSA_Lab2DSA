package com.gl.main;

import java.util.Scanner;
import com.gl.currency.CurrencyDenominations;
import com.gl.mergesort.MergeSort;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations");

		int sizeCurrency = sc.nextInt();

		System.out.println("Enter the currency denominations value");

		int[] notes = new int[sizeCurrency];

		for (int i = 0; i < notes.length; i++) {
			notes[i] = sc.nextInt();
		}

		System.out.println("Enter the amount that you want to pay");

		int amountPay = sc.nextInt();

		MergeSort ms = new MergeSort();

		int low = 0;
		int high = notes.length - 1;

		ms.mergeSort(notes, low, high);

		// ms.printArr(notes);

		CurrencyDenominations currency = new CurrencyDenominations();

		currency.notesCounter(notes, amountPay);

	}

}
