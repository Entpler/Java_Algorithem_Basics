package sortinandsearching;
//이분 검색
//임의의n개의 숫자가 입력으로 주어지면 n개의 수를 오름차순으로 정렬한다음  n개의 수중 한개의 수인 m이 주어지면 
//이분검색으로 m이 정렬된 상태에서 몇 번쨰에 있는지 구하는 프로그램
//lt = 0으로 초기화
//rt = n-1(끝값 으로 초기화)
//mid = (lt+rt /2)
//arr[mid] == m 인지 찾는것.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public int sloution(int n, int m, int[]arr) {
		int answer = 0;
		
		Arrays.sort(arr); //arr 정렬
		int lt =0 , rt =n-1; //배열의 첫번째 순서 0 , 마지막 순서 n-1(배열의길이 :n-1) 
		while(lt<=rt) {//while 문 조건에서 lt가 rt 보다 커지면 멈추도록 해야함.
			int mid = (lt+rt)/2; //베열의 중간값 인덱스 번호
			if(arr[mid]==m) {
				answer= mid+1; //mid는 인덱스 번호니까 +1해줘야함
				break;
			}
			if(arr[mid]>m ) {
				rt= mid-1; //중간값이 찾는 값보다 크면 rt 가 중간값보다 범위가 줄어듬
			}else if(arr[mid]<m) {
				lt =mid+1;//중간값이 찾는 값보다 작아지면 lt 가 중간값보다 범위가 커짐
			}
				
	
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		Main t = new Main();

		Scanner in = new Scanner(System.in);

		int n  = in.nextInt();
		int m = in. nextInt();
		int[]arr = new int[n];
		for(int i= 0; i<n; i++) 
			arr[i] = in.nextInt(); //배열에 n개의 값 넣어주기. 배열의 마지막길이 :n-1
				
		System.out.println(t.sloution(n,m,arr));
		
		
	}

	}


 