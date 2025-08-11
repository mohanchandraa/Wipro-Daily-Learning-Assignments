package com.learn;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 10) {
                arr[i] *= 2;
            }
		}
		int sum=0;
		for(int ele:arr) {
			sum = sum + ele;
		}
		double avg = (double) sum/n;
		System.out.println(avg);
		
	}
}
