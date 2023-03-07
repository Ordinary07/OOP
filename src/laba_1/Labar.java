package laba_1;

import java.util.Scanner;

public class Labar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Введите размер фигуры: ");
		int n=sc.nextInt();
		int i=1;
		while(i <=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=i) {
				System.out.printf("%d",j);
				j++;
			}
			j=2;
			while(j<=i) {
				System.out.printf("%d",j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		i=n-1;
		while(i >=1) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=i) {
				System.out.printf("%d",j);
				j++;
			}
			j=2;
			while(j<=i) {
				System.out.printf("%d",j);
				j++;
			}
			System.out.println();
		i--;
		}
		 
		sc.close();
	}
		
}


