package objectpackage;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setModelname("Rolls - Royce Ghost");
		car1.setPrice(42000);
		car1.setDisplacement(7036);
		
		//toString을 호출해서 출력
		//System.out.println(car1);
		
		Car car2 = new Car();
		car2.setModelname("Rolls - Royce Ghost");
		car2.setPrice(52000);
		car2.setDisplacement(9036);
		
		//toString을 호출해서 출력

		System.out.println(car1 == car2);
		System.out.println(car1.equals(car2));
	}

}
