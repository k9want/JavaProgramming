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
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int input = scanner.nextInt();
			if(input == 0) {
				System.out.println("종료합니다");
				break;
			}
			else {	
				avg +=input;
				rain.add(input);
				index++;			
			printVector(rain);
			System.out.println("\n현재 평균 :" + avg/index);
		
			}
			}
		}	
	}


