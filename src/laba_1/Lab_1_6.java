package laba_1;

import java.util.Scanner;

public class Lab_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in); 
		 System.out.print("Виберите задачу: ");
		 int ext = sc.nextInt();
		 
		 System.out.print("Введите N: ");
		 
		 switch (ext) {
		 
			case 1:
		  	float n = sc.nextInt(); 
		  	float i = 1; 
		  	float a = 0; 
		  do { 
			  a = a + (1 / i); 
			  i++; 
		  		}
		  while (i <= n); 
		  System.out.print(a); 
		  break;
		  
			case 2:
			  	float N = sc.nextInt(); 
			  	float I = 1; 
			  	float A = 0; 
			  	 while (I <= N) {
			  		  A = A + (1 / I); 
					  I++;   
			  	 }System.out.print(A); 
		  break;
		 }
		 sc.close();
	}

}
