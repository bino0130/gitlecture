package another;

import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("#Current Converter");
		System.out.println("1.달러 -> 원");
		System.out.println("2.원 -> 달러");
		System.out.println("3.엔화 -> 원화");
		System.out.println("4.원화 -> 엔화");
		System.out.print("-> ");

		int selectMenu = sc.nextInt();
		int dollarRate = 1322;

		double yenRate = 9.59;
		double dy;

		int input = sc.nextInt();

		switch (selectMenu) {
		case 1: {
			dy = input / dollarRate;
			System.out.print(input + "원은 대략 " + Math.round(dy) + "달러 입니다.");
			break;
		}
		case 2: {
			dy = input * dollarRate;
			System.out.print(input + "달러는 대략 " + Math.round(dy) + "원 입니다");
			break;
		}
		case 3: {
			dy = input * yenRate;
			System.out.print(input + "엔은 대략 " + Math.round(dy) + "원 입니다");
			break;
		}
		case 4: {
			dy = input / yenRate;
			System.out.print(input + "원은 대략 " + Math.round(dy) + "엔 입니다");
			break;
		}
		default: {
			System.out.print("다시 입력");
			break;
		}
		}

	}
}