	//	다음 문제를 읽고, 요구사항에 맞는 코드를 작성하세요 (문제해결시나리오)
	//
	//	클래스에 다음 내용을 작성하여 저장할 수 있는 관리 프로그램을 작성하세요
	//
	//	클래스의 속성은 다음과 같습니다
	//	- 고유번호
	//	- 카테고리 (탄산, 이온, 커피 등)
	//	- 상품이름
	//	- 가격
	//
	//	프로그램의 기능은 다음과 같습니다
	//	- 항목 추가
	//	- 목록 출력
	//	- 항목 수정 (고유번호를 활용한 수정)
	//	- 항목 삭제 (고유번호를 활용한 삭제)

package test;

import java.util.Scanner;

class Drink {
	int uniquenum, money;
	String categorie, name;
}

public class Test_01 {
	public static void main(String[] args) {
	
		Drink[] arr = new Drink[10];
		Drink dr;
		Scanner scanner = new Scanner(System.in);

		int uniquenum = 100, money = 0;
		int menu, result, updatanum;
		String categorie = null, name = null;
		String from = "%d) [%s] %s  : %,d원 \n";
		while (true) {
			System.out.println("1. 항목 추가 ");
			System.out.println("2. 항목 출력 ");
			System.out.println("3. 항목 수정 ");
			System.out.println("4. 항목 삭제 ");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(scanner.nextLine());

			switch (menu) {

			case 1:
				System.out.print("상품 이름 입력 : ");
				name = scanner.nextLine();
				System.out.print("카테 고리 입력 : ");
				categorie = scanner.nextLine();
				System.out.print("상품 가격 입력 : ");
				money = Integer.parseInt(scanner.nextLine());

				dr = new Drink();
				dr.uniquenum = uniquenum;
				dr.name = name;
				dr.categorie = categorie;
				dr.money = money;
				uniquenum++;

				result = addmenu(arr, dr);
				System.out.println(result == 1 ? "추가 성공" : "추가 실패");
				System.out.println();

				break;

			case 2:
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						System.out.printf(from, arr[i].uniquenum, arr[i].categorie, arr[i].name, arr[i].money);
					}
				}
				break;

			case 3:
				System.out.print("수정할 상품 번호 입력 : ");
				updatanum = Integer.parseInt(scanner.nextLine());
				System.out.print("상품 이름 입력 : ");
				name = scanner.nextLine();
				System.out.print("카테 고리 입력 : ");
				categorie = scanner.nextLine();
				System.out.print("상품 가격 입력 : ");
				money = Integer.parseInt(scanner.nextLine());

				dr = new Drink();
				dr.uniquenum = updatanum;
				dr.name = name;
				dr.categorie = categorie;
				dr.money = money;

				result = updata(arr, dr);
				System.out.println(result == 1 ? "수정 성공" : "수정 실패");
				System.out.println();
				break;

			case 4:
				System.out.print("삭제할 상품 번호 입력 : ");
				updatanum = Integer.parseInt(scanner.nextLine());
				dr = new Drink();
				dr.uniquenum = updatanum;

				result = delete(arr, dr);
				System.out.println(result == 1 ? "삭제 성공" : "삭제 실패");
				System.out.println();
				break;

			case 0:
				System.out.println("프로그램을 종료합니다");
				scanner.close();
				return;

			default:
				System.out.println("다시 입력 해주세요");
				System.out.println();
				break;
			}
		}
	}

	static int addmenu(Drink[] arr, Drink dr) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = dr;
				row = 1;
				break;
			}
		}
		return row;
	}

	static int updata(Drink[] arr, Drink dr) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].uniquenum == dr.uniquenum) {
				arr[i] = dr;
				row = 1;
				break;
			}
		}
		return row;
	}

	static int delete(Drink[] arr, Drink dr) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].uniquenum == dr.uniquenum) {
				arr[i] = null;
				row = 1;
				break;
			}
		}
		return row;
	}
}
