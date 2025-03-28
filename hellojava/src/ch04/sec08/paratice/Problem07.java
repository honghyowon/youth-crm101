package ch04.sec08.paratice;

import java.util.Scanner;

public class Problem07 {
	// 주말 숙제
	// Math.random? 써서 미리 난수 출력시켜두고,
	// nextLine으로 통일하고, int로 변환하기
	// 숙제 결과는 jongukjeong@gmail.com 보낼때 이름 정확히 표시 하고 소스는 개인 깃허브 링크를 보내주세요
	public static void main(String[] args) {

		System.out.println("==============================");
		System.out.println("       [숫자맞추기게임 시작]       ");
		System.out.println("==============================");

		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = (int) (Math.random() * 100 + 1);
//			System.out.println(num);

			while (true) {
				System.out.print(">> ");

				int input = Integer.parseInt(sc.nextLine());

				if (num > input) {
					System.out.println("더 높게");
				} else if (num < input) {
					System.out.println("더 낮게");
				} else {
					System.out.println("맞았습니다.");
					System.out.print("게임을 종료하시겠습니까?(y/n) >>");

					String choice = sc.nextLine();
					if ("y".equals(choice)) {
						System.out.println("==============================");
						System.out.println("       [숫자맞추기게임 종료]       ");
						System.out.println("==============================");
						sc.close();
						return;
					} else if ("n".equals(choice)) {
						break;
					}
				}
			}

		}

	}
}
