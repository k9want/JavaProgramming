package ch7_collection;

import java.util.*;

public class Ch7_p435 {
	static int avg=0;
	static int index=0;
	static void printVector(Vector<Integer> v){
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {
			int n =it.next();
		System.out.print(n + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> rain = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
			int input = scanner.nextInt();
			if(input == 0) {
				System.out.println("�����մϴ�");
				break;
			}
			else {	
				avg +=input;
				rain.add(input);
				index++;			
			printVector(rain);
			System.out.println("\n���� ��� :" + avg/index);
		
			}
			}
		}	
	}


