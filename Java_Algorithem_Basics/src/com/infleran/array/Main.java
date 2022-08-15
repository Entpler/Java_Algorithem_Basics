package com.infleran.array;

import java.util.Scanner;

//소수(에라토스네스의 체) => 소수 구하는 방법// =? 소수가 되는 수의 배수를 지우면 남은것은 소수가됨.
//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램.

class Main {
	public int primenumber(int N) {

		int answer = 0;
		int[] ch = new int[N + 1]; // N까지 보라고 했으니까 N+1 로 길이를 넣어주어야함.
		for (int i = 2; i <= N; i++) {// 0과 1은 제외 후 2부터 시작.
			if (ch[i] == 0) { // 배열은 지금 0으로 모두 초기화 되어있는 상태.
				answer++; // 2는 소수이므로 count해주고 2일때 2의 배수들을 1로 바꿔줌
							// 계속 반복하다보면 인덱스의 값이 0인 친구들만 남게 된다.
				for (int j = i; j <= N; j = j + i) {
					ch[j] = 1;
				}
			}

		}

		return answer;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		Main m = new Main();
		System.out.println(m.primenumber(N));

	}

}
