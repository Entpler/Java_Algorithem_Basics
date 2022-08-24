package com.infleran.array;

//������Ҹ� ArrayList�� �ֱ�.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main6 {

	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {

		ArrayList<Integer> answer = new ArrayList<>();

		Arrays.sort(a);// �������� ����
		Arrays.sort(b);// �������� ����

		int p1 = 0, p2 = 0;// two pointer
		while (p1 < n && p2 < m) {// �ϳ��� �����̵Ǹ� �ΰ��� ������ �Ǽ� stop.
			if (a[p1] == b[p2]) {// ������
				answer.add(a[p1++]);// a�� b�� �ϳ� ����
				p2++;
			} // p2�� �������������.
			else if (a[p1] < b[p2]) {// a���Ұ� b���Һ��� ������ ������ ����
				p1++;
			} else {
				p2++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main6 T = new Main6();
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();

		}

		int m = in.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = in.nextInt();

		}

		for (int x : T.solution(n, m, a, b)) {
			System.out.println(x);
		}

	}
}
