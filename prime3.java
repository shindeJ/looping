package loopassignment;

import java.util.Scanner;

public class prime3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int flag=0;
	for(int i=2;i<=n;i++)	{
		if(n%i==0) {
			flag++;
		}
	}
	if(flag==1)
	{
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
System.out.println();
	int f=0;
	for(int i=2;i<=100;i++) {
		f=0;
		for(int j=2;j<=i;j++) {
			if(i%j==0)
				f++;
		}
		if(f==1) {
			System.out.println(i+"");
		}
		/*
		 * */
	}
	}
}
