package ch7_collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> dic =new HashMap<String,String>();
		//HashMap은 add()가 아닌 put()을 사용한다.
		dic.put("baby", "아기");
		dic.put("love","사랑");
		
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
		
			System.out.print("찾을 단어는? ");
			String str = scanner.next();
			if(str.equals("exit")) {
				System.out.println("끝");
				break;
			}
			
			String kor = dic.get(str);
			if(kor ==null) {
				System.out.println(kor+"는 없는 단어입니다");
			}
			else {
				System.out.println(kor);
			}
		
		
		}
		scanner.close();
	}

}
