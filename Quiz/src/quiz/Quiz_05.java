package quiz;


import java.util.Random;
import java.util.Scanner;


public class Quiz_05 {
	public static void main(String[] args) {
		
		// ea : 1, eb : 8, ec : 3
		// 입력 : 7
		// 출력 : eb 엘리베이터가 이동합니다
		// 엘리베이터와 현재층의 거리(절대값)를 구한다
		// 거리의 최소값을 구한다
		// 거리의 최소값이 몇번째와 같은지 찾는다 (최소값을 찾았을 때 이름도 등록해준다)
		// 최소값과 일치하는 순번의 엘리베이터 이름을 출력한다
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int ea = ran.nextInt(15) + 1;
		int eb = ran.nextInt(15) + 1;
		int ec = ran.nextInt(15) + 1;
		int current;

		System.out.printf("ea : %d, eb : %d, ec : %d\n", ea, eb, ec);

		// ea : 1, eb : 8, ec : 3
		// 입력 : 7
		// 출력 : eb 엘리베이터가 이동합니다

		System.out.print("현재 층 입력 : ");
		current = Integer.parseInt(sc.nextLine());

		// 엘리베이터와 현재층의 거리(절대값)를 구한다
		int distA = current - ea;
		int distB = current - eb;
		int distC = current - ec;

		if (distA < 0) {
			distA *= -1;
		}
		if (distB < 0) {
			distB *= -1;
		}
		if (distC < 0) {
			distC *= -1;
		}

		// 거리의 최소값을 구한다
		// 거리의 최소값이 몇번째와 같은지 찾는다 (최소값을 찾았을 때 이름도 등록해준다)
		int min = distA;
		String name = "ea";

		if (min > distB) {
			min = distB;
			name = "eb";
		}
		if (min > distC) {
			min = distC;
			name = "ec";
		}
		// 최소값과 일치하는 순번의 엘리베이터 이름을 출력한다
		System.out.printf("%s 엘리베이터가 이동합니다\n", name);
		sc.close();

	}
}

