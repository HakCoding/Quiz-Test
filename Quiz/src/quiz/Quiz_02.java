// 놀이기구 이용 시간에 따른 이용 요금을 계산하려고 한다
// 기본 요금은 3000원 이며, 10분마다 500원의 추가요금이 발생한다
// 요금표는 다음과 같다
//  0 ~ 30	: 3000
// 31 ~ 40	: 3500
// 41 ~ 50	: 4000
// 51 ~ 60	: 4500
// ...		
// 반복문 사용 없이, if를 이용하여 시간을 분 단위로 입력받고, 요금을 계산하여 출력하세요

package quiz;

import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int time, money;
		
		System.out.print("이용시간 입력 : ");
		time = Integer.parseInt(scanner.nextLine());
		
		if(time <= 30) {
			money = 3000;
		}
		else {
			money = (((time-30)/10)*500)+3000;
			time = (time-30)%10;
			if(time != 0) {
				money += 500;
			}
		}
		System.out.println(money);		
		scanner.close();
	}
}
