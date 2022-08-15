package com.infleran;

//피보나치 수열 만드는 문제. N 을 입력했을 때 
import java.util.Scanner;

class Main5 {
	public int[] pivo(int N) {

		int answer[] = new int[N];
		answer[0] = 1; //첫번째 항, 두번째 항은 1 1+1 = 2
		answer[1] = 1;
		for (int i = 2; i < N; i++) { //i는 2번째부터 N번째까지
			answer[i] = (answer[i-1] + answer[i-2]); // 앞의 두항을 더한것이 i항이 되면됨.
		}

		return answer;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		Main5 m = new Main5();
		
			for(int x : m.pivo(N)) 
			System.out.print(x + " ");


		}

	}

