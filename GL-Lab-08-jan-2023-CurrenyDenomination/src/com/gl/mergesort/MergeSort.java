package com.gl.mergesort;

public class MergeSort {

	public void mergeSort(int[] arr, int low, int high) {

		if (low < high) {
			// find the middle point
			int mid = (low + high) / 2;
			// Sort first and second halves
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			// merge the sorted halves
			merge(arr, low, mid, high);
		}

	}

	public void merge(int[] arr, int low, int mid, int high) {
		int i, j, k;
		i = low;
		j = mid + 1;
		k = low;
		int[] tempArr = new int[high + 1];
		while (i <= mid && j <= high) {
			if (arr[i] > arr[j])
				tempArr[k++] = arr[i++];
			else
				tempArr[k++] = arr[j++];
		}
		for (; i <= mid; i++)
			tempArr[k++] = arr[i];
		for (; j <= high; j++)
			tempArr[k++] = arr[j];
		for (i = low; i <= high; i++)
			arr[i] = tempArr[i];

	}

	public void printArr(int[] arr) {

		System.out.println("Sorted Array");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i]);

		}

		System.out.println();

	}

}
