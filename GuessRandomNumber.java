package com.projects;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {

	public static void main(String[] args) {
		System.out.println("Guess Random Number");
		Scanner sc=new Scanner(System.in);
		int random=Random();
		boolean isRandom=true;
		while(isRandom) {
			int attempts=0;
			
			while(attempts<3) {
				System.out.println("Enter the Number");
				int num=sc.nextInt();
				if(num==random) {
					System.out.println("Tie");
					break;
				}else if(num>random) {
					System.out.println("Greater Than");
					
				}else if(num<random) {
					System.out.println("Less Than");
					
				}
				attempts++;
			}
			
			System.out.println("Continue the Process or not ");
			System.out.println("select the two strings yes/no");
			sc.nextLine();
			String string=sc.nextLine();
			if(string.equalsIgnoreCase("yes")) {
				random=Random();
				isRandom=true;
			}else {
				isRandom=false;
			}
		}
		sc.close();
	}
	static int Random() {
		Random random=new Random();
		int r=random.nextInt(10)+1;
		return r;
	}
}
