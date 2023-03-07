package laba_1;
import java.util.Scanner;
public class Labara {
	public static void printDivs(int x) {
		int div=2;
		System.out.printf("%d=1", x);
		while(div<=x)
		{
			if(x % div==0) {
				x/=div;
				System.out.printf(" * %d", div);
			}
			else
			{
				div++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Введите число: ");
int n=sc.nextInt();
printDivs(n);

sc.close();
	}

}
