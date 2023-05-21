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