package com.infleran.array;

//���� N�� �Է¹����� ���ӵ� �ڿ����� ������ N�� ���� �� �ִ� ����� �� ���ϱ� 
import java.util.Scanner;

class Main7 {

	public int solution(int n, int m, int[] arr) {

		int answer = 0, sum = 0, lt = 0;
		for (int rt = 0; rt < n; rt++) {// two pointer ���� ; lt�� rt
			sum += arr[rt]; // rt ���� ���������� ������Ų��.
			if (sum == m) // �ٷ� Ȯ���� ���־�� lt ���� rt������ ���̵ȴ�.//����, ���ϱ�, Ȯ��
				answer++;
			while (sum >= m) {
				sum -= arr[lt++];// lt�� ����Ű�� ���� sum���� ������ lt�� ���������ش�.
				if (sum == m)
					answer++;// m�� sum�� �´��� ��
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
