package ch7_collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> dic =new HashMap<String,String>();
		//HashMap�� add()�� �ƴ� put()�� ����Ѵ�.
		dic.put("baby", "�Ʊ�");
		dic.put("love","���");
		
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
		
			System.out.print("ã�� �ܾ��? ");
			String str = scanner.next();
			if(str.equals("exit")) {
				System.out.println("��");
				break;
			}
			
			String kor = dic.get(str);
			if(kor ==null) {
				System.out.println(kor+"�� ���� �ܾ��Դϴ�");
			}
			else {
				System.out.println(kor);
			}
		
		
		}
		scanner.close();
	}

}
