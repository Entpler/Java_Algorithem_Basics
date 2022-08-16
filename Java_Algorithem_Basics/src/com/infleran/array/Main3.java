package com.infleran.array;

import java.util.Scanner;

//점수계산 -> 시험문제의 채점 결과 점수가 주어졌을 때 가산점을 고려해서 총 점수 계산하기.
public class Main3 {

//cnt라는 변수 => 횟수
//sum 이라는 변수 ->누적 => 1을 만나면 누적
//1을 만나면 cnt를 증가시키고 sum에 누적 0을 만나면 0으로 초기화.

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num + 1];
		int answer = 0, cnt = 0;

		for (int i = 0; i < num; i++) {
			arr[i] = in.nextInt();

		}

		for (int i = 0; i < num; i++) {
			if (arr[i] == 1) {
				cnt++; //1을 만나면 카운트 증가 후 sum에 누적
				answer += cnt;
			} else {
				cnt = 0; //0을 만나면 카운트 초기화.
			}
		}

		System.out.println(answer);
	}

}
