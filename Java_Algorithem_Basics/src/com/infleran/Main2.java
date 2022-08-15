package com.infleran;

// N개의 정수를 입력받아, 자신의 앞 수보다 큰 수만 출력하는 프로그램을 작성 (단 첫번째 수는 무조건 출력한다) 
import java.util.ArrayList;
import java.util.Scanner;

class Main2 {
	public ArrayList<Integer> solution(int n, int[] arr) {// 반환값 : ArrayList<Integer>

		ArrayList<Integer> answer = new ArrayList<>(); // ArrayList 선언
		answer.add(arr[0]); // ArrayList에 arr[0] 추가 => 첫번째 수는 무조건 출력

		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i-1]) { // 앞의수가 뒤에수보다 크면
				answer.add(arr[i]); // 그 수를 배열에 추가한다.
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		Main2 t = new Main2();
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[n]; // n개의 길이의 배열 생성

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt(); // 배열에 값 넣어주는 for문
		}

		for (int x : t.solution(n, arr)) {
			System.out.println(x + " "); // 배열을 출력하는 for문
		}

	}

}
