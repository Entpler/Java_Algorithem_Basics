package com.infleran;

import java.util.Scanner;

public class Main4 {
//���������� ���� 1:���� 2:���� 3: �� N���� �������Ͽ� A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ��

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		// 1. ���� �Լ��� �̿��ؼ� Ǯ�� (1,2,3 A, B�� �������� ������) => �� Ǯ��. ������ �迭�� �̿��ؼ� Ǫ�� ��������..
		String winner = "";

		/*
		 * for (int i = 0; i < N; i++) { 
		 * int A = (int) (Math.random() * 3) + 1; // A, B 1,2,3�������� N����� 
		 * int B = (int) (Math.random() * 3) + 1;
		 *  
		 * if (A > B) {
		 * winner = "A";
		 *  
		 * }else if (B > A) { 
		 * winner = "B"; 
		 * 
		 * } else { 
		 * winner = "D"; 
		 * 	} 
		 * 
		 * A++; B++;
		 * 
		 * System.out.println(winner); 
		 * }
		 */
		
		
		// 2. �迭�� �̿��ؼ� Ǯ��

		int[] A = new int[N]; // N����ŭ ���� �迭
		int[] B = new int[N];// N����ŭ ���� �迭

		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt(); // A�� ���� �迭

		}

		for (int i = 0; i < N; i++) {
			B[i] = in.nextInt(); // B�� ���� �迭

		}

		for (int i = 0; i < N; i++) {
			if (A[i] == B[i]) {
				winner += "D";
			} else if ((A[i] == 1 && B[i] == 3) || (A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2)) {
				winner += "A"; // A�� �̱�� ����� ��
			} else {
				winner += "B"; // �� �ܿ��� B�� �̱�.
			}

		}
		System.out.println(winner);

	}

}
