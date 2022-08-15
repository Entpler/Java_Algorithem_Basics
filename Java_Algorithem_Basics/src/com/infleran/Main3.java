package com.infleran;

//N���� �л��� �Ϸķ� ������ ��, �ڱ� �տ� �� �ִ� �л��麸�� ũ�� �� �л��� ���̰�, 
//�۰ų� ������ ������ ����. ����� ���̴��� count�ض�
//���⼭ �߿����� : ���� for������ Ǯ�� �ð��ʰ�.
//�� �տ� �л��� ������ ���̹Ƿ� count;

import java.util.Scanner;

class Main3 {
	public int showtall(int N, int[] arr) {

		int n = 1; // �Ѹ��� ����.
		int max = arr[0]; // ������ ���̴� ��� = > �Ǿտ� ����� max ���̶�� �ϰ�
		for (int i = 1; i < N; i++) {
			if (arr[i] > max) { // arr[i]> max ���� ũ�� ī��Ʈ
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
