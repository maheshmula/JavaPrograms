package com.kn.forloopdecrement;

import java.util.Scanner;

public class SumOfNumbersInLoop {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number=");
int num=scan.nextInt();
int sum=0;
for (int i=1 ;i<=num ;i++) {
//for (int i=num ;i>=1;i--) {
	sum=sum+i;
}
System.out.println("Sum="+sum);
	}

}
