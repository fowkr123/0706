package exceptionhandling;

public class Main2 {

	public static void main(String[] args) {
		//문자열 배열 생성
		String [] ar = {"Morning", "Afternoon", "Evening"};
		
		try {
			//배열의 데이터를 순화하면ㅇ서 출력
			int size = ar.length;
		
			//size까지 진행해서 예외가 발생
			for(int i = 0; i < size; i++) {
				System.out.println(ar[i]);
				if(i > 1) {
					throw new NumberFormatException("강제로 예외 발생");
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//예외 내용 출력
			System.out.println(e.getMessage());
			//예외 내용을 추적
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			//예외 내용 출력
			System.out.println(e.getMessage());
			//예외 내용을 추적
			e.printStackTrace();
		}
		//위에 예외처리한 것들을 제외하고 알지못하는 오류들을 예외처리해준다. (Exception이 상위클래스이기 때문)
		catch(Exception e) {
			//예외 내용 출력
			System.out.println(e.getMessage());
			//예외 내용을 추적
			e.printStackTrace();
		}
	}
}
