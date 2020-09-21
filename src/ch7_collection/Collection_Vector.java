package ch7_collection;

import java.util.Scanner;
import java.util.Vector;

public class Collection_Vector {	
 private int i =0;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		for(int i=0; i<11; i++) {
			int val=scanner.nextInt();
			
			v.add(val);
			System.out.println(i +": "+ val );
		}
		//v.add(1);
		//int i = v.get(0);
		int size = v.size();
		int cap = v.capacity();
		
		System.out.println("Vector의 크기와 용량은 " +size+ ","+ cap);
		//기본 용량이 10이었는데 더 많은 요소를 받으면 용량이 알아서 증가한다. 
	}

}
