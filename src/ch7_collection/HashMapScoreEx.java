package ch7_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	//Collection HahMap ���� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> scoreMap = new HashMap<String,Integer>();
		
		scoreMap.put("���繮",70);
		scoreMap.put("�ѿ���",99);
		scoreMap.put("�賲��",98);
		scoreMap.put("�輺��",97);
		scoreMap.put("���ؼ�",88);
		
		System.out.println("HashMap�� ��� ���� :"+scoreMap.size());
		
		
		Set<String> keys = scoreMap.keySet();  //��� key�� ���� Set �÷��� ����
		Iterator<String> it = keys.iterator(); //Set�� �ִ� ��� key�� ������� �˻��ϴ� Iterator ����
		
		
		while(it.hasNext()) {
			String str= it.next();
			int score = scoreMap.get(str);
			System.out.println(str +" : " +score );
		}
		
		
		
	}

}
