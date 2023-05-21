package quiz;

import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int year, month, day, age, currentYear = 2023;
		String adult, result;
		
		System.out.print("생년월일 6자리 입력 : ");
		input = Integer.parseInt(sc.nextLine());
		
		day = input % 100;	
		input = input / 100;
		
		month = input % 100;
		year = input / 100;
		
		if(year <= 23) {
			year = year + 2000;
		}
		else {
			year += 1900;
		}
		age = currentYear - year + 1;
		
		if(age >= 20) {
			adult = "성인";
		}
		else {
			adult = "미성년자";
		}
		
		result = "%d년 %d월 %d일 출생, %d세, %s입니다\n";
		result = String.format(result, year, month, day, age, adult);
		System.out.println(result);		
		sc.close();
	}
}