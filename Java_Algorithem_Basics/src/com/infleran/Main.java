package com.infleran;

import java.util.Scanner;

//Ư�����ڿ��� ���ڰ� � ���ԵǴ��� ���ڸ� ��ȯ�ϴ� ����(��ҹ��� �������)
class Main {
	public int solution(String str, char t) {

		int answer = 0;
		str = str.toUpperCase(); // ���ڿ��� �빮�ڷ� ��ȯ
		t = Character.toUpperCase(t);// ���� �ϳ��� �빮�ڷ� ��ȯ

		// 1. for�� Ǯ��
		for (int i = 0; i < str.length(); i++) { // ���ڿ��� ���̸�ŭ �˻�
			if (str.charAt(i) == t)
				answer++; // ���ڿ��� �ε����� �����ؼ�
			// Ư�����ڰ� ������ answer �� ������Ų��.

			// return answer;
		// 2. for each�� Ǯ��

			for (char x : str.toCharArray()) { // ���� �迭�� ����
				if (x == t) {
					answer++;
				}

			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main t = new Main();

		Scanner in = new Scanner(System.in);

		String str = in.next(); // ���ڿ��ϳ� �б�
		char c = in.next().charAt(0);
		// ���ڿ��� �ϳ� �а�, String�� index 0���� �д� ����
		// �������� ��.

		System.out.println(t.solution(str, c));
	}
}
