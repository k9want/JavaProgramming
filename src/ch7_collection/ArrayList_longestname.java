package ch7_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_longestname {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ArrayList_name = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하시요");
			String str = scanner.nextLine();
			ArrayList_name.add(str);
		}
		
		for(int i=0; i<4; i++) {
			
			String name= ArrayList_name.get(i);
			System.out.print(name+" ");
			
		}
		
		int longnameIndex =0;
		for(int i=1; i<ArrayList_name.size(); i++) {
			
			if(ArrayList_name.get(longnameIndex).length() < ArrayList_name.get(i).length()) {
				longnameIndex=i;
			}	
		}
		System.out.println("가장 긴 이름은 : " + ArrayList_name.get(longnameIndex));
	}

}
