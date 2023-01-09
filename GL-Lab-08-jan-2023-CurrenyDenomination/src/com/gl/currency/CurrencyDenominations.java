package com.gl.currency;

public class CurrencyDenominations {

	public void notesCounter(int[] notes, int amountPay) {

		int[] notesCounter = new int[notes.length];

		try {

			for (int i = 0; i < notes.length; i++) {

				if (amountPay >= notes[i]) {

					notesCounter[i] = amountPay / notes[i];

					amountPay = amountPay - (notes[i] * notesCounter[i]);

				}

			}

			if (amountPay > 0) {

				System.out.println("Amount you enter is not possible to divide into given notes");

			} else {

				System.out.println("Your payment approach in order to give min no of notes will be");

				for (int j = 0; j < notes.length; j++) {

					System.out.println(notes[j] + ":" + notesCounter[j]);

				}

			}
		} catch (ArithmeticException ex) {

			System.out.println(
					"Should avoid dividing by an integer that leads to non-terminating decimal expansion. " + ex);

		}

	}

}