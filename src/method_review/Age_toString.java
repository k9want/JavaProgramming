package method_review;

import java.util.Scanner;

//���̸� �Է¹ް� toString �޼ҵ带 �������ϴ� Ŭ���� ���� toString() �޼ҵ� �����ϱ� 

public class Age_toString {
	
	private int Age;
	
	public void setAge(int inputAge){
		Age = inputAge;
	}
	
	public String toString(){
		return "���̴� : "+Age;
		
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
