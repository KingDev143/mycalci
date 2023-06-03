package com.jsp.calci;

import java.util.Scanner;

public class MyCalsi {

	public static void choicemethod(int c) {
		Scanner S = new Scanner(System.in);
		switch (c) {
		case 1:
			System.out.println("Addition");
			System.out.println("Enter 2 numbers -->> ");
            int a = S.nextInt();
			int b = S.nextInt();
			int c1 = a + b;
			System.out.println("Addition is -->> " + c1);
			break;

		case 2:
			System.out.println(".....Subtraction......");
			System.out.println("Enter 2 numbers -->> ");
            int a1 = S.nextInt();
			int b1 = S.nextInt();
			int c2 = a1 - b1;
			System.out.println("Subtraction is -->> " + c2);
			break;

		case 3:
			System.out.println("......Multiplication......");
			System.out.println("Enter 2 numbers -->> ");
            int a2 = S.nextInt();
			int b2 = S.nextInt();
			int c3 = a2 * b2;
			System.out.println("Multiplication is -->> " + c3);
			break;

		case 4:
			System.out.println(".......Division.......");
			System.out.println("Enter 2 numbers -->> ");
            int a3 = S.nextInt();
			int b3 = S.nextInt();
			int c4 = a3 / b3;
			System.out.println("Division is -->> " + c4);
			break;

		}
	}

	public static void main(String[] args) {

		System.out.println("-------Welcome----------");
		System.out.println("1.Add \n" + "2.Sub \n" + "3.Mul \n" + "4.Div \n");
		System.out.println("Enter Your Choice -->> ");
		Scanner S = new Scanner(System.in);
		int choice = S.nextInt();
		choicemethod(choice);

	}

}
