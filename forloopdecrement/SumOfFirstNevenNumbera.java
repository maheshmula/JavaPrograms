package com.kn.forloopdecrement;

import java.util.Scanner;

public class SumOfFirstNevenNumbera {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a Number=");
int num=scan.nextInt();
int sum=0;
for(int i=2; i<=num; i+=2) {
	sum=sum+i;
}
System.out.println("Sum of N Even Numbers = "+sum);

	}

}
