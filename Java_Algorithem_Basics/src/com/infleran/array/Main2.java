package com.infleran.array;
//뒤집은 소수 구하기.
//N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력
//예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화
import java.util.ArrayList;
import java.util.Scanner;

class Main2 {

	public boolean isPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = arr[i]; // tmp =>뒤집은 결과 //arr[i]에 저장.
			int res = 0;
			while (tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}

			if (isPrime(res))
				;
			answer.add(res);
		}

		return answer;
	}

	public static void main(String[] args) {

		Main2 m = new Main2();

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		for (int x : m.solution(n, arr)) {// Arraylist 받아서 foreach로 출력
			System.out.print(x + " ");
		}

	}

}
