package quiz;

import java.util.Scanner;

public class Quiz_06 {
	public static void main(String[] args) {
		
		// userid와 userpw에 문자열을 입력받아서
		// 1) 아이디 불일치
		// 2) 아이디는 일치하지만, 패스워드 불일치
		// 3) 아이디와 패스워드 모두 일치하여 로그인 성공
		
		// 3개의 결과를 화면에 출력할 수 있는 코드를 작성하세요
		
		String id = "test";
		String pw = "123";
		
		Scanner sc = new Scanner(System.in);
		
		String userid, userpw;		
		
		System.out.print("ID : ");
		userid = sc.nextLine();
		
		System.out.print("Password : ");
		userpw = sc.nextLine();
		
		if(userid.equals(id)) {
			if(userpw.equals(pw)) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("로그인 실패 (비밀번호 불일치)");
			}
		}
		else {
			System.out.println("로그인 실패 (아이디 없음)");
		}
		
		sc.close();
	
	}
}
