package com.infleran.array;

//정수 N을 입력받으면 연속된 자연수의 합으로 N이 나올 수 있는 경우의 수 구하기 
import java.util.Scanner;

class Main7 {

	public int solution(int n, int m, int[] arr) {

		int answer = 0, sum = 0, lt = 0;
		for (int rt = 0; rt < n; rt++) {// two pointer 설정 ; lt와 rt
			sum += arr[rt]; // rt 값을 오른쪽으로 증가시킨다.
			if (sum == m) // 바로 확인을 해주어야 lt 부터 rt까지의 합이된다.//증가, 더하기, 확인
				answer++;
			while (sum >= m) {
				sum -= arr[lt++];// lt가 가르키는 값을 sum에서 빼고나서 lt를 증가시켜준다.
				if (sum == m)
					answer++;// m이 sum과 맞는지 비교
			}

		}
		return answer;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Main7 t = new Main7();

		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(t.solution(n, m, arr));

	}
}
