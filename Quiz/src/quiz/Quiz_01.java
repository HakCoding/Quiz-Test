/*
 * 	세 과목의 점수를 정수형태로 입력받고, 이름은 문자열로 입력받으세요
 * 	그런 다음, 점수의 합계와 평균을 구합니다
 * 	이때, 평균은 실수형태로 소수점 둘째자리까지 출력할 수 있도록 준비하세요
 * 
 * 	모든 준비가 끝나면 이름과 합계와 평균만 출력합니다
 * 
 * 	추가내용) boolean 타입의 변수를 선언하여, 평균이 60점 이상인지 아닌지 판별하여
 * 	결과를 출력하세요
 * 	합격여부 : true
 */

package quiz;

import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		
				Scanner scanner = new Scanner(System.in);
				String name;
				int kor, eng, mat, total;
				double avg;
				boolean pass;				
			
				System.out.print("이름 입력 : ");
				name = scanner.nextLine();
				
				System.out.print("국어 점수 입력 : ");
				kor = Integer.parseInt(scanner.nextLine());
				
				System.out.print("영어 점수 입력 : ");
				eng = Integer.parseInt(scanner.nextLine());
				
				System.out.print("수학 점수 입력 : ");
				mat = Integer.parseInt(scanner.nextLine());
				
				total = kor + eng + mat;
				avg = total / 3.0;
				pass = avg >= 60;				
				
				System.out.printf("%s의 합계 : %d, 평균 : %.2f\n", name, total, avg);
				System.out.println("합격 여부 : " + pass);
							
				scanner.close();
	}
}
