package com.infleran.array;
//�� �迭 ��ġ�� //two pointer ���
import java.util.ArrayList;
import java.util.Scanner;

class Main5 {

	// ArrayList�� ��ȯ //a�迭�� ũ�� //b�迭��ũ��, a�迭, b�迭
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		
		ArrayList<Integer> answer = new ArrayList<>();

		int p1 = 0, p2 = 0; // �����ʹ� 0�� ����Ŵ. //a�� p1�� b�� p2�� ����. �������� ArrayList�� �߰�. �������� Pointer�� ������Ŵ.

		while (p1 < n && p2 < m) { // p1�̵� p2�� �ϳ��� n, m���� ���� while�� ����

			if (a[p1] < b[p2])
				answer.add(a[p1++]); // p1�� ����Ű�� ���� add�� �ǰ� 1����
			else
				answer.add(b[p2++]); //������ ����Ű�� ���� ����.
			//a, b �迭 ���ؼ� Ž�� ��. 
		}
		while (p1 < n)
			answer.add(a[p1++]);
		while (p2 < m)
			answer.add(b[p2++]); //�������� �迭�� �־������ ��.

		return answer;

	}	
//�� �迭�� �����ϴ� ���� (�ð����⵵ ���)

	public static void main(String[] args) {

		Main5 T = new Main5();
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

			System.out.print(x + " ");

		}

	}
}
