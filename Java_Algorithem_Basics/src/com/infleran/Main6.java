package com.infleran;

import java.util.Scanner;
//격자판의 최대합 구하기.
class Main6 {
	
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE; // answer 를 가장 작은 값으로 초기화.

		int sum1, sum2 = 0; // sum1==행의합 sum2 ==열의합
		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];// 행이 고정되고 열 값이 바뀜.
				sum2 += arr[j][i]; // 열이 고정되고 행 값이 바뀜.
			}
			answer = Math.max(answer, sum1); // 두 값중에 큰값을 구함.
			answer = Math.max(answer, sum2);
		}
		// 대각선의합
		sum1 = sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i]; // 대각선 두개중 하나는 행과 열의 번호가 같음.ex , 1행 1열, 2행 2열 3행 3열..
			sum2 += arr[i][n - i - 1]; // 0행 4열. 1행 3열/..

		}
		answer = Math.max(answer, sum1); // 두 값중에 큰값을 구함. sum1, sum2 중에 큰 값이 있으면 answer 바꿈.
		answer = Math.max(answer, sum2);

		return answer;
	}

	public static void main(String[] args) {

		Main6 m = new Main6();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // n이 5면

		int[][] arr = new int[n][n]; // 5행 5열 배열
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		System.out.println(m.solution(n, arr));

	}

}
