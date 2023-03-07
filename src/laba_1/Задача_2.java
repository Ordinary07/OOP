package laba_1;
import java.util.Scanner;
public class Задача_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите количество чисел: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 100; i >= n; i-=10)
		{
		System.out.print(i);
		System.out.print(" ");
		}
		sc.close();
	}

}
