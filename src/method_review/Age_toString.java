package method_review;

import java.util.Scanner;

//나이를 입력받고 toString 메소드를 재정의하는 클래스 만들어서 toString() 메소드 연습하기 

public class Age_toString {
	
	private int Age;
	
	public void setAge(int inputAge){
		Age = inputAge;
	}
	
	public String toString(){
		return "나이는 : "+Age;
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age_toString person1 = new Age_toString();
		Scanner scanner = new Scanner(System.in);
		int inputAge = scanner.nextInt();
		person1.setAge(inputAge);
		System.out.println(person1.toString());
	}

}
