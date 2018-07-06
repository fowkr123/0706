package exceptionhandling;

public class Main3 {

	public static void main(String[] args) {
		// java.lang.Thread 라는 클래스에는 sleep이라는 메소드가
		// 있는데 이 메소드는 매개변수로 대입된 시간만큼 실행을 중지 시키는 역할을 합니다.
		// 이 메소드를 이용해서 1~10까지를 1초씩 쉬면서 출력
		/*
		 * for(int i = 1; i < 11; i++) { //System.out.println(i + 1); try {
		 * Thread.sleep(1000); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } }
		 */

		// image0.png, image1.png, image2.png
		// =>위 3개의 문자열 1초마다 번갈아가면서 무한 반복해서 출력하는 로직을 작성

		/*
		 * int idx = 0; //for(int i = 0; i < 10;){ //while(true) { for(;;) {
		 * //System.out.println(i + 1); System.out.println("lmage" + (idx % 10 + 1) +
		 * "png"); idx = idx + 1; try { Thread.sleep(1000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */

		// 김기태, 이종범, 최향남, 이대진을 번갈아 가면서 출력
		String[] ar = { "김기태", "이종범", "최향남", "이대진" };
		int idx = 0;
		int size = ar.length;
		try {
			for (;;) {
				System.out.println(ar[idx % size]);
				
					Thread.sleep(1000);
				
				idx = idx + 1;
			}
		}  catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
