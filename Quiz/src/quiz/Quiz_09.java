package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz_09 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int answer = ran.nextInt(100) + 1;
		int user;
		int min = 1, max = 100;
		
		while(true) {
			System.out.printf("정답을 맞춰보세요 (%d ~ %d) : ", min, max);
//			user = Integer.parseInt(sc.nextLine());
			
			user = (min + max) / 2;
			System.out.println("컴퓨터가 계산한 값 : " + user);
			
			cnt += 1;
			
			if(user > answer) {
				System.out.println("DOWN !!");
				max = user - 1;
			}
			else if(user < answer) {
				System.out.println("UP !!");
				min = user + 1;
			}
			else {
				break;
			}			
		}
		System.out.printf("축하합니다 !! %d회만에 정답을 맞췄습니다 !!\n", cnt);
		sc.close();
	}
}
