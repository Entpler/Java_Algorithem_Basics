package com.infleran;

// N���� ������ �Է¹޾�, �ڽ��� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ� (�� ù��° ���� ������ ����Ѵ�) 
import java.util.ArrayList;
import java.util.Scanner;

class Main2 {
	public ArrayList<Integer> solution(int n, int[] arr) {// ��ȯ�� : ArrayList<Integer>

		ArrayList<Integer> answer = new ArrayList<>(); // ArrayList ����
		answer.add(arr[0]); // ArrayList�� arr[0] �߰� => ù��° ���� ������ ���

		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i-1]) { // ���Ǽ��� �ڿ������� ũ��
				answer.add(arr[i]); // �� ���� �迭�� �߰��Ѵ�.
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		Main2 t = new Main2();
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[n]; // n���� ������ �迭 ����

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt(); // �迭�� �� �־��ִ� for��
		}

		for (int x : t.solution(n, arr)) {
			System.out.println(x + " "); // �迭�� ����ϴ� for��
		}

	}

}
