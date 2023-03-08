package another;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("#Current Converter");
		System.out.println("1.섭씨 -> 화씨");
		System.out.println("2.화씨 -> 섭씨");
		System.out.print("-> ");

		int selectMenu = sc.nextInt();
		double dy = 0.0;

		int input = sc.nextInt();
		
		switch (selectMenu) {
		case 1: {
			dy = input * 1.8 + 32;
			System.out.print("섭씨 " + input + "도는 화씨 " + Math.round(dy) + "도 입니다.");
			break;
		}
		case 2: {
			dy = (input - 32) * 0.55;
			System.out.print("화씨 " + input + "도는 섭씨 " + Math.round(dy) + "도 입니다.");
			break;
		}
		default: {
			System.out.print("다시 입력");
			break;
		}
		}
	}

}
//섭씨를 화씨로 F = C * 1.8 + 32
//화씨를 섭씨로 C = (F - 32) X 0.55