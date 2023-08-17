package com.kn.forloopdecrement;

import java.util.Scanner;

public class ForlLoopDecrement {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter Number=");
int num=scan.nextInt();
for(int i=num ;i>=1; i--) {
	System.out.print(i+" ");
}
	}

}
