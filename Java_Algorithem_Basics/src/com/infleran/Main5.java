package com.infleran;

//�Ǻ���ġ ���� ����� ����. N �� �Է����� �� 
import java.util.Scanner;

class Main5 {
	public int[] pivo(int N) {

		int answer[] = new int[N];
		answer[0] = 1; //ù��° ��, �ι�° ���� 1 1+1 = 2
		answer[1] = 1;
		for (int i = 2; i < N; i++) { //i�� 2��°���� N��°����
			answer[i] = (answer[i-1] + answer[i-2]); // ���� ������ ���Ѱ��� i���� �Ǹ��.
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

