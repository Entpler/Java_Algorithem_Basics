package com.infleran;

import java.util.Scanner;

//특정문자열에 문자가 몇개 포함되는지 숫자를 반환하는 문제(대소문자 상관없음)
class Main {
	public int solution(String str, char t) {

		int answer = 0;
		str = str.toUpperCase(); // 문자열을 대문자로 변환
		t = Character.toUpperCase(t);// 문자 하나를 대문자로 변환

		// 1. for문 풀이
		for (int i = 0; i < str.length(); i++) { // 문자열의 길이만큼 검색
			if (str.charAt(i) == t)
				answer++; // 문자열을 인덱스로 접근해서
			// 특정문자가 나오면 answer 를 증가시킨다.

			// return answer;
		// 2. for each문 풀이

			for (char x : str.toCharArray()) { // 문자 배열을 생성
				if (x == t) {
					answer++;
				}

			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main t = new Main();

		Scanner in = new Scanner(System.in);

		String str = in.next(); // 문자열하나 읽기
		char c = in.next().charAt(0);
		// 문자열을 하나 읽고, String의 index 0번에 읽는 것을
		// 가져오는 것.

		System.out.println(t.solution(str, c));
	}
}
