package com.infleran.array;
//������ �Ҽ� ���ϱ�.
//N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ �� �� ������ ���� �Ҽ��̸� �� �Ҽ��� ���
//���� ��� 32�� �������� 23�̰�, 23�� �Ҽ��̴�. �׷��� 23�� ����Ѵ�. �� 910�� �������� 19�� ����ȭ
import java.util.ArrayList;
import java.util.Scanner;

class Main2 {

	public boolean isPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = arr[i]; // tmp =>������ ��� //arr[i]�� ����.
			int res = 0;
			while (tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}

			if (isPrime(res))
				;
			answer.add(res);
		}

		return answer;
	}

	public static void main(String[] args) {

		Main2 m = new Main2();

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		for (int x : m.solution(n, arr)) {// Arraylist �޾Ƽ� foreach�� ���
			System.out.print(x + " ");
		}

	}

}
