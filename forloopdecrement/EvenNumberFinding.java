package com.kn.forloopdecrement;

import java.util.Scanner;

public class EvenNumberFinding {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a Number=");
int num=scan.nextInt();
// for odd number for (int i=1; i<=num;i+=2) {
for(int i=2; i<=num;i+=2) {
	//if (i%2==0)
	
	System.out.println(i);
}
	}

}
