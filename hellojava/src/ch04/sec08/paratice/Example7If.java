package ch04.sec08.paratice;

import java.util.Scanner;

public class Example7If {
	public static void main(String[] args) {
		// 예금, 출금, 조회, 종료 기능을 제공하는 프로그램 작성
		int balance = 0;	// 잔액
		int request = 0;	// 요청금액
		String temp = "";	// 임시 저장 숫자
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			
			// 메뉴 선택 입력
			temp = sc.nextLine();
			
			// 예금
			if("1".equals(temp)) {
				System.out.print("예금액> ");
				request = Integer.parseInt(sc.nextLine());
				balance += request;	//잔액 변수에 요청값 누적
			}else if("2".equals(temp)) {
				// 출금
				System.out.print("출금액> ");
				request = Integer.parseInt(sc.nextLine());

				// 잔액이 부족한 경우도 출력해야함
				if(balance < request) {
					// 잔액이 부족한 경우
					System.out.println("잔액이 부족합니다.");
				}else {
					// 잔액이 충분한 경우
					balance -= request;	//잔액 변수에 요청값 차감
				}
				
			}else if("3".equals(temp)) {
				// 잔고 출력
				System.out.println("잔액>" + balance);
				
			}else if("4".equals(temp)) {
				// 종료
				break;
			}
			
		}
	}
}
