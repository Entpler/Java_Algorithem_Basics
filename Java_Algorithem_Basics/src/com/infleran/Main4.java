package com.infleran;

import java.util.Scanner;

public class Main4 {
//가위바위보 문제 1:가위 2:바위 3: 보 N번의 게임을하여 A가 이기면 A를 출력하고, B가 이기면 B를 출

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		// 1. 랜덤 함수를 이용해서 풀이 (1,2,3 A, B가 랜덤으로 냈을때) => 내 풀이. 하지만 배열을 이용해서 푸는 문제였음..
		String winner = "";

		/*
		 * for (int i = 0; i < N; i++) { 
		 * int A = (int) (Math.random() * 3) + 1; // A, B 1,2,3랜덤으로 N번출력 
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
		
		
		// 2. 배열을 이용해서 풀이

		int[] A = new int[N]; // N번만큼 담을 배열
		int[] B = new int[N];// N번만큼 담을 배열

		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt(); // A를 넣을 배열

		}

		for (int i = 0; i < N; i++) {
			B[i] = in.nextInt(); // B를 넣을 배열

		}

		for (int i = 0; i < N; i++) {
			if (A[i] == B[i]) {
				winner += "D";
			} else if ((A[i] == 1 && B[i] == 3) || (A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2)) {
				winner += "A"; // A가 이기는 경우의 수
			} else {
				winner += "B"; // 그 외에는 B가 이김.
			}

		}
		System.out.println(winner);

	}

}
