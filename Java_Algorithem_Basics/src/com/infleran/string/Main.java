package com.infleran.string;

import java.util.Scanner;

//ȸ�����ڿ�(�յڷ� �Ȱ��� ���ڿ�)(�Ӹ����)
//���ڿ��� �ԷµǸ� �ش� ���ڰ� ȸ�����ڿ��̸� yes, ȸ�����ڿ��� �ƴϸ� no�� ����ϴ� ���α׷��ۼ�
//�� ��ҹ��� �������� ����.
class Main {
	public String solution(String str) {

		String answer = "";

		// 1. ���� ���ϴ� ���

		/*
		 * str.toUpperCase(); // ��ҹ��� �������� �����Ƿ� �빮�ڷ� ��ȯ
		 * 
		 * int len = str.length(); for (int i = 0; i < len / 2; i++) { // �� ������ �ݸ� �����.
		 * if (str.charAt(i) != str.charAt(len - 1 - i)) { //�Ǿ��� ���ڰ� �� ���� ���ڿ� ����������
		 * answer = "NO"; } else { answer ="YES";
		 * 
		 * } }
		 */

		// 2. StringBuilder�̿�

		String tmp = new StringBuilder(str).reverse().toString(); // tmp ��� ���� ������
		if (str.equals(tmp)) {// ���ڿ����� ������ ��;
			answer = "YES";

		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		Main m = new Main();

		System.out.println(m.solution(str));

	}
}
