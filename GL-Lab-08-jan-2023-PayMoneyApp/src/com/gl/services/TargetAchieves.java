package com.gl.services;

public class TargetAchieves {
	
	
	public void printTransactions(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		
	}
	
	public void findTaretAchieves(int[] arr, int targetValue) {
		int flag = 0;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			
			sum += arr[i];
			
			if(sum >= targetValue) {
				
				System.out.println("Target achieved after "+ (i + 1) + " transactions");
				
				 flag = 1;
				 break;
				
			}  
			
		}
		
		if(flag == 0) {
			
			System.out.println("Given target is not achieved");
			
		}
		
	}
	
	

}
