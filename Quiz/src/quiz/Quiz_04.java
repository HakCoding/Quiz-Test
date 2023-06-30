package quiz;

import java.util.Scanner;

public class Quiz_04 {
	public static void main(String[] args) {

			// 1) 정수를 입력받아서 절대값을 출력하기
			// 2) 두 정수를 입력받아서 작은 값을 출력하기
			// 3) 세 정수를 입력받아서 가장 작은 값을 출력하기
			// 4) 정수의 범위가 1에서 20사이에 포함되면 true, 아니면 false 출력하기
		
			Scanner sc = new Scanner(System.in);

			// 1) 정수를 입력받아서 절대값을 출력하기
			int n1;
			System.out.print("정수 입력 : ");
			n1 = Integer.parseInt(sc.nextLine());

			if (n1 < 0) {
				n1 = -n1;
			}
			System.out.println("n1 : " + n1);
			System.out.println();

			// 2) 두 정수를 입력받아서 작은 값을 출력하기
			int n2, n3;
			System.out.print("정수1 입력 : ");
			n2 = Integer.parseInt(sc.nextLine());

			System.out.print("정수2 입력 : ");
			n3 = Integer.parseInt(sc.nextLine());

			if (n2 < n3) {
				System.out.println("작은값 : " + n2);
			} else {
				System.out.println("작은값 : " + n3);
			}
			System.out.println();

			// 3) 세 정수를 입력받아서 가장 작은 값을 출력하기
			int n4, n5, n6, min;
			System.out.print("정수3 입력 : ");
			n4 = Integer.parseInt(sc.nextLine());

			System.out.print("정수4 입력 : ");
			n5 = Integer.parseInt(sc.nextLine());

			System.out.print("정수5 입력 : ");
			n6 = Integer.parseInt(sc.nextLine());

			min = n4;
			if (min > n5) {
				min = n5;
			}
			if (min > n6) {
				min = n6;
			}
			System.out.println("가장 작은 수 : " + min);
			System.out.println();

			// 4) 정수의 범위가 1에서 20사이에 포함되면 true, 아니면 false 출력하기
			int n7;
			System.out.print("정수 입력  (1 ~ 20) : ");
			n7 = Integer.parseInt(sc.nextLine());

			boolean flag = 1 <= n7 && n7 <= 20;
			System.out.println(flag);
			
			sc.close();
		}
	}
