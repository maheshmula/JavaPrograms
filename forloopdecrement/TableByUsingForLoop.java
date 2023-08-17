package com.kn.forloopdecrement;

import java.util.Scanner;

public class TableByUsingForLoop {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter your number=");
int num=scan.nextInt();
for (int i=1; i<=10;i++) {
//for (int i=10; i>=1;i--) {
	System.out.println(num + "*" + i + "=" + i*num);
}
	}

}
