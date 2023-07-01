package quiz;

import java.util.*;

public class Quiz_08 {
	public static void main(String[] args) {
		// 정수형 배열 arr1을 생성하고 12, 91, 52, 34, 76, 29, 82 를 넣어주세요
				int[] arr1 = { 12, 91, 52, 34, 76, 29, 82 };
				
				// arr1의 홀수번째 index에 들어간 숫자의 합을 구하여 출력하세요
				int total = 0;
				for(int i = 0; i < arr1.length; i++) {
					if(i % 2 != 0) {
						total += arr1[i];
					}
				}
				System.out.println("홀수번째 숫자의 합 : " + total);
				
				// arr1의 짝수번째 index에 들어간 숫자에 10을 더하세요
				for(int i = 0; i < arr1.length; i++) {
					if(i % 2 == 0) {
						arr1[i] += 10;
					}
				}
				
				// arr1과 길이가 같은 정수형 배열 arr2를 새로 생성하세요
				int[] arr2 = new int[arr1.length];
				
				// arr1에 담긴 값들을 역순으로 arr2에 담아주세요
				// arr2[0] = arr1[6]
				// arr2[1] = arr1[5]
				for(int i = 0; i < arr2.length; i++) {
					int j = arr2.length - i - 1;
//					System.out.printf("arr2[%d] = arr1[%d]\n", i, j);
					arr2[i] = arr1[j];
				}
				
				// arr1과 arr2를 각각 한줄에 출력하세요
				System.out.print("arr1 : [");
				for(int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i]);
					System.out.print(i == arr1.length - 1 ? "]\n" : ", ");
				}
				
				System.out.println("arr2 : " + Arrays.toString(arr2));
	}
}
