package ch7_collection;

import java.util.*;

public class CollectionsEx {
	
	static void printLinkedList(LinkedList<String> list){
	Iterator<String> it = list.iterator();
	while(it.hasNext()) {
		String str = it.next();
		
		if(it.hasNext()) {
			System.out.print(str+"->");
		}
		else {
		System.out.print(str+"\n");
		}
		
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		Iterator<String> its = list.iterator();
		while(its.hasNext()) {
			String str = its.next();
			
			if(its.hasNext()) {
				System.out.print(str+"->");
			}
			else {
			System.out.print(str+"\n");
			}
			
		}
		
		Collections.sort(list);
		printLinkedList(list);
		
		Collections.reverse(list);
		printLinkedList(list);
		
		int index = Collections.binarySearch(list, "c")+1;
		System.out.println("c´Â "+ index + "¹ø¤Š");
		
	}

}
