//package practice;

import java.util.Scanner;

 class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("please enter table number:");
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		for(int j=1;j<=10;j++) {
		for(int i=1;i<=30;i++) {
			if(i==8||i==3||i==5) {
				//System.out.print("0\t");
				continue;
			}
			else {
			System.out.print(i*j+"\t");
			}
		}
		System.out.println();
		}

	}

}
