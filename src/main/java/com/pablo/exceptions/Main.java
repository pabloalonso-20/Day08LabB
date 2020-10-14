package com.pablo.exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Integer> myList = new ArrayList<Integer>();
		myList.add(4); //myList[0]
		myList.add(3);	//myList[1]
		myList.add(2);	//myList[2]
		
		
		//try-catch
		try {
			System.out.println(myList.get(3));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Out of bounds");
		}
		
		//generic exception
		
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("Exception caught");
		}
		
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Input any positive integer: ");
			int input = scanner.nextInt();
			
			if(input<1) {
				throw new Exception();
			}
			else {
				System.out.println("Positive number, nice");
			}
		}
		catch(Exception e) {
			System.out.println("Negative Exception- That number is Negative!!!");
			
		}
		
		
		

	}

}
