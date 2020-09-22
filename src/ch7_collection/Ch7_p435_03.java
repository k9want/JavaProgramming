package ch7_collection;

import java.util.*;

public class Ch7_p435_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner =new Scanner(System.in);
	
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true) {
			
			System.out.print("나라 이름, 인구 >> ");
			String str = scanner.next();
			if(str.equals("그만")) {
				break;
			}
			int people= scanner.nextInt();
			nations.put(str, people);		
			}
		 //while 종료
		while(true) {
			System.out.print("인구 검색 >>");
			String str= scanner.next(); //str을 입력해서 
			if(str.equals("그만")) {
				break;
			}		
			if(nations.get(str)==null) {  //해당 str(key)에 맞는 값(value)이 있는지 없는지 판단 
				System.out.println(str + " 나라는 없습니다");
			}
			else {
				System.out.println(str + "의 인구는 수는 " +nations.get(str));
			}			
		}	
	}

}
