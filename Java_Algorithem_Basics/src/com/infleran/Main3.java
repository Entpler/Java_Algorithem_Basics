package com.infleran;

//N명의 학생을 일렬로 세웠을 때, 자기 앞에 서 있는 학생들보다 크면 그 학생은 보이고, 
//작거나 같으면 보이지 않음. 몇명이 보이는지 count해라
//여기서 중요한점 : 이중 for문으로 풀면 시간초과.
//맨 앞에 학생은 무조건 보이므로 count;

import java.util.Scanner;

class Main3 {
	public int showtall(int N, int[] arr) {

		int n = 1; // 한명은 보임.
		int max = arr[0]; // 무조건 보이는 사람 = > 맨앞에 사람이 max 값이라고 하고
		for (int i = 1; i < N; i++) {
			if (arr[i] > max) { // arr[i]> max 보다 크면 카운트
				n++;
				max = arr[i];
			}
		}

		return n;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		Main3 m = new Main3();

		System.out.print(m.showtall(N, arr));

	}
}
