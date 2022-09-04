package sortinandsearching;
//�̺� �˻�
//������n���� ���ڰ� �Է����� �־����� n���� ���� ������������ �����Ѵ���  n���� ���� �Ѱ��� ���� m�� �־����� 
//�̺а˻����� m�� ���ĵ� ���¿��� �� ������ �ִ��� ���ϴ� ���α׷�
//lt = 0���� �ʱ�ȭ
//rt = n-1(���� ���� �ʱ�ȭ)
//mid = (lt+rt /2)
//arr[mid] == m ���� ã�°�.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public int sloution(int n, int m, int[]arr) {
		int answer = 0;
		
		Arrays.sort(arr); //arr ����
		int lt =0 , rt =n-1; //�迭�� ù��° ���� 0 , ������ ���� n-1(�迭�Ǳ��� :n-1) 
		while(lt<=rt) {//while �� ���ǿ��� lt�� rt ���� Ŀ���� ���ߵ��� �ؾ���.
			int mid = (lt+rt)/2; //������ �߰��� �ε��� ��ȣ
			if(arr[mid]==m) {
				answer= mid+1; //mid�� �ε��� ��ȣ�ϱ� +1�������
				break;
			}
			if(arr[mid]>m ) {
				rt= mid-1; //�߰����� ã�� ������ ũ�� rt �� �߰������� ������ �پ��
			}else if(arr[mid]<m) {
				lt =mid+1;//�߰����� ã�� ������ �۾����� lt �� �߰������� ������ Ŀ��
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
			arr[i] = in.nextInt(); //�迭�� n���� �� �־��ֱ�. �迭�� ���������� :n-1
				
		System.out.println(t.sloution(n,m,arr));
		
		
	}

	}


 