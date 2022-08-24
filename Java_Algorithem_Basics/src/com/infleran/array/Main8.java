package com.infleran.array;
//���ӵ� �ڿ����� ��(two pointer)
import java.util.Scanner;

class Main8 {
	public int solution(int N) {
		int lt = 0;
		int rt = 0;
		int sum = 0;
		int answer = 0;
		int arr[] = new int[N / 2 + 1];  //�ڿ��� N�� �־����� ������ N/2 +1 ������ ��ƾ��Ѵ�.

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
