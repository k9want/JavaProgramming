package ch7_collection;

import java.util.*;

public class Ch7_p434_01 {

	static void printVectorMax(Vector<Integer> v){
		int max=0;
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n =it.next();
			if(max<n) {
				max=n;
			}
		}
		System.out.println("가장 큰 수는  "+max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수(-1이 입력될 때까지)>> ");
		while(true) {
			int num = scanner.nextInt();
			if(num==-1) {
				printVectorMax(v);
				break;
			}
			v.add(num);
		}
		}
	}


