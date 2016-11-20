package core.java1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Прошу ввести довжину прямокутника");
		int width = sc.nextInt();
		System.out.println("Прошу ввести ширину прямокутника");
		int length = sc.nextInt();
		
		Rectangle s = new Rectangle(width,length);
		s.info();
		sc.close();
	}
	
}
