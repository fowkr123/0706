package location;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int max = num[0];
		int idx = 0;
		int size = num.length;
		
		System.out.println("5개의 숫자를 차례대로 입력하세요 : ");
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		for(int i = 1; i < num.length; i++) {
			if(num[0] < num[i]) {
				max = num[i];
				idx = i;
			}
		}
		System.out.println("가장 큰수 위치 : " + idx);
	}
}
