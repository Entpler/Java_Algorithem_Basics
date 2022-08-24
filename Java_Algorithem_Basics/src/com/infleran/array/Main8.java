package com.infleran.array;
//연속된 자연수의 합(two pointer)
import java.util.Scanner;

class Main8 {
	public int solution(int N) {
		int lt = 0;
		int rt = 0;
		int sum = 0;
		int answer = 0;
		int arr[] = new int[N / 2 + 1];  //자연수 N이 주어지면 범위를 N/2 +1 까지로 잡아야한다.

		for (int i = 0; i < N / 2 + 1; i++) {
			arr[i] = i + 1;
		}

		for (rt = 0; rt < (N / 2) + 1; rt++) {
			sum += arr[rt];
			if (sum == N) {
				answer++;
			}
			while (sum >= N) {
				sum -= arr[lt++];
				if (sum == N) {
					answer++;
				}

			}
		}
		return answer;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Main8 t = new Main8();

		int N = in.nextInt();

		System.out.println(t.solution(N));

	}

}
