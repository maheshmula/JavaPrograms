package com.kn.forloopdecrement;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter your Number = ");
int num=scan.nextInt();
int sum=0;
for (int i=1; i<=num; i+=2) {
	sum=sum+i;
}
System.out.println("Sum of N Odd Number = "+sum);
	}

}
