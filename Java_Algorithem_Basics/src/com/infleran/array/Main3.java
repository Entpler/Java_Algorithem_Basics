package com.infleran.array;

import java.util.Scanner;

//������� -> ���蹮���� ä�� ��� ������ �־����� �� �������� ����ؼ� �� ���� ����ϱ�.
public class Main3 {

//cnt��� ���� => Ƚ��
//sum �̶�� ���� ->���� => 1�� ������ ����
//1�� ������ cnt�� ������Ű�� sum�� ���� 0�� ������ 0���� �ʱ�ȭ.

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num + 1];
		int answer = 0, cnt = 0;

		for (int i = 0; i < num; i++) {
			arr[i] = in.nextInt();

		}

		for (int i = 0; i < num; i++) {
			if (arr[i] == 1) {
				cnt++; //1�� ������ ī��Ʈ ���� �� sum�� ����
				answer += cnt;
			} else {
				cnt = 0; //0�� ������ ī��Ʈ �ʱ�ȭ.
			}
		}

		System.out.println(answer);
	}

}
