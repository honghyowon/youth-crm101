package ch04.sec08.paratice;

import java.util.Scanner;

public class Example7Switch {
	public static void main(String[] args) {
		// 예금, 출금, 조회, 종료 기능을 제공하는 프로그램 작성
		int balance = 0;	// 잔액
		int deposit = 0;	// 요청금액
		int withdraw = 0;	// 임시저장 숫자
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			String inputNum = scanner.nextLine();

			switch (inputNum) {
			case "1": {
				System.out.print("예금액> ");
				deposit = Integer.parseInt(scanner.nextLine());
				balance = balance + deposit;
				continue;
			}
			case "2": {
				System.out.print("출금액> ");
				withdraw = Integer.parseInt(scanner.nextLine());
				balance = balance - withdraw;
				continue;
			}
			case "3": {
				System.out.println("잔고> " + balance);
				continue;
			}
			case "4": {
				System.out.println("프로그램 종료.");
				scanner.close(); // 사용이 끝나면 close.
				return;
			}

			}

		}
//		while (true) {
//
//			System.out.println("-------------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("--------------------------------");
//			System.out.print("선택> ");
//			String inputNum = scanner.nextLine();
//
//			if (inputNum == "1") {
//				System.out.println("예금액> ");
//				deposit = Integer.parseInt(scanner.nextLine());
//				balance++;
//			}
//			if (inputNum == "2") {
//				System.out.println("출금액> ");
//				withdraw = Integer.parseInt(scanner.nextLine());
//				balance = balance - withdraw;
//			}
//			if (inputNum == "3") {
//				System.out.println("잔고> " + balance);
//			}
//			if (inputNum == "4") {
//				System.out.println("프로그램 종료");
//				scanner.close(); // 사용이 끝나면 close.
//				return;
//			}
//
//		}
	}
}
