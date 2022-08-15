package com.infleran.array;

import java.util.Scanner;

//�Ҽ�(�����佺�׽��� ü) => �Ҽ� ���ϴ� ���// =? �Ҽ��� �Ǵ� ���� ����� ����� �������� �Ҽ�����.
//�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷�.

class Main {
	public int primenumber(int N) {

		int answer = 0;
		int[] ch = new int[N + 1]; // N���� ����� �����ϱ� N+1 �� ���̸� �־��־����.
		for (int i = 2; i <= N; i++) {// 0�� 1�� ���� �� 2���� ����.
			if (ch[i] == 0) { // �迭�� ���� 0���� ��� �ʱ�ȭ �Ǿ��ִ� ����.
				answer++; // 2�� �Ҽ��̹Ƿ� count���ְ� 2�϶� 2�� ������� 1�� �ٲ���
							// ��� �ݺ��ϴٺ��� �ε����� ���� 0�� ģ���鸸 ���� �ȴ�.
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
