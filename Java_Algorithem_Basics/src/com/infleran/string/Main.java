package com.infleran.string;

import java.util.Scanner;

//회문문자열(앞뒤로 똑같은 문자열)(팰린드롬)
//문자열이 입력되면 해당 문자가 회문문자열이면 yes, 회문문자열이 아니면 no를 출력하는 프로그램작성
//단 대소문자 구분하지 않음.
class Main {
	public String solution(String str) {

		String answer = "";

		// 1. 직접 비교하는 방법

		/*
		 * str.toUpperCase(); // 대소문자 구분하지 않으므로 대문자로 변환
		 * 
		 * int len = str.length(); for (int i = 0; i < len / 2; i++) { // 그 길이의 반만 돌면됨.
		 * if (str.charAt(i) != str.charAt(len - 1 - i)) { //맨앞의 문자가 맨 뒤의 문자와 같지않으면
		 * answer = "NO"; } else { answer ="YES";
		 * 
		 * } }
		 */

		// 2. StringBuilder이용

		String tmp = new StringBuilder(str).reverse().toString(); // tmp 라는 문자 뒤집기
		if (str.equals(tmp)) {// 문자열끼리 같은지 비교;
			answer = "YES";

		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		Main m = new Main();

		System.out.println(m.solution(str));

	}
}
