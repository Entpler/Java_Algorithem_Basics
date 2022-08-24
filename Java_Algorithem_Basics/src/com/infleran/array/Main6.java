package com.infleran.array;

//공통원소만 ArrayList에 넣기.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main6 {

	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {

		ArrayList<Integer> answer = new ArrayList<>();

		Arrays.sort(a);// 오름차순 정렬
		Arrays.sort(b);// 오름차순 정렬

		int p1 = 0, p2 = 0;// two pointer
		while (p1 < n && p2 < m) {// 하나가 거짓이되면 두개다 거짓이 되서 stop.
			if (a[p1] == b[p2]) {// 같으면
				answer.add(a[p1++]);// a나 b중 하나 증가
				p2++;
			} // p2도 증가시켜줘야함.
			else if (a[p1] < b[p2]) {// a원소가 b원소보다 작으면 작은쪽 증가
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
