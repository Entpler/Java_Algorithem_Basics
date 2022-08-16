package com.infleran;

import java.util.Scanner;
//�������� �ִ��� ���ϱ�.
class Main6 {
	
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE; // answer �� ���� ���� ������ �ʱ�ȭ.

		int sum1, sum2 = 0; // sum1==������ sum2 ==������
		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];// ���� �����ǰ� �� ���� �ٲ�.
				sum2 += arr[j][i]; // ���� �����ǰ� �� ���� �ٲ�.
			}
			answer = Math.max(answer, sum1); // �� ���߿� ū���� ����.
			answer = Math.max(answer, sum2);
		}
		// �밢������
		sum1 = sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i]; // �밢�� �ΰ��� �ϳ��� ��� ���� ��ȣ�� ����.ex , 1�� 1��, 2�� 2�� 3�� 3��..
			sum2 += arr[i][n - i - 1]; // 0�� 4��. 1�� 3��/..

		}
		answer = Math.max(answer, sum1); // �� ���߿� ū���� ����. sum1, sum2 �߿� ū ���� ������ answer �ٲ�.
		answer = Math.max(answer, sum2);

		return answer;
	}

	public static void main(String[] args) {

		Main6 m = new Main6();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // n�� 5��

		int[][] arr = new int[n][n]; // 5�� 5�� �迭
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		System.out.println(m.solution(n, arr));

	}

}
