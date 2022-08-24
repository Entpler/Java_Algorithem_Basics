package com.infleran.array;
//두 배열 합치기 //two pointer 사용
import java.util.ArrayList;
import java.util.Scanner;

class Main5 {

	// ArrayList로 반환 //a배열의 크기 //b배열이크기, a배열, b배열
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		
		ArrayList<Integer> answer = new ArrayList<>();

		int p1 = 0, p2 = 0; // 포인터는 0을 가르킴. //a의 p1과 b의 p2를 비교함. 작은쪽을 ArrayList에 추가. 넣은쪽의 Pointer를 증가시킴.

		while (p1 < n && p2 < m) { // p1이든 p2든 하나가 n, m으로 가면 while문 종료

			if (a[p1] < b[p2])
				answer.add(a[p1++]); // p1이 가르키는 값이 add가 되고 1증가
			else
				answer.add(b[p2++]); //들어간곳을 가르키는 쪽이 증가.
			//a, b 배열 비교해서 탐색 끝. 
		}
		while (p1 < n)
			answer.add(a[p1++]);
		while (p2 < m)
			answer.add(b[p2++]); //남은쪽을 배열에 넣어버리면 됨.

		return answer;

	}	
//두 배열을 정렬하는 문제 (시간복잡도 고려)

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
