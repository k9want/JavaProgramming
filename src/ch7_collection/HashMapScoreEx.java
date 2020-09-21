package ch7_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	//Collection HahMap 연습 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> scoreMap = new HashMap<String,Integer>();
		
		scoreMap.put("이재문",70);
		scoreMap.put("한원선",99);
		scoreMap.put("김남윤",98);
		scoreMap.put("김성동",97);
		scoreMap.put("이준석",88);
		
		System.out.println("HashMap의 요소 개수 :"+scoreMap.size());
		
		
		Set<String> keys = scoreMap.keySet();  //모든 key를 가진 Set 컬렉션 리턴
		Iterator<String> it = keys.iterator(); //Set에 있는 모든 key를 순서대로 검색하는 Iterator 리턴
		
		
		while(it.hasNext()) {
			String str= it.next();
			int score = scoreMap.get(str);
			System.out.println(str +" : " +score );
		}
		
		
		
	}

}
