package ch7_collection;
import java.util.*;

public class Ch7_p438_08 {
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	Scanner scanner = new Scanner(System.in);

	void run() {
	System.out.println("**포인트 관리 프로그램 입니다 **");
	
	while(true) {
		System.out.print("이름과 포인트 입력>>");
		String name=scanner.next();
		if(name.equals("그만")) {
			return;
		}
		int point = scanner.nextInt();
		if(hm.get(name) !=null) {
			point +=hm.get(name);
		}
		hm.put(name, point);
		printall();	
		/*여기서 안되는 이유는 ???
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();	
		while(it.hasNext()) {
			String str =it.next();
			int n = hm.get(str);
			System.out.println("("+str+"," + n+")");			
		}
		*/
			}
	}
	void printall() {
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String str=it.next();
			int n = hm.get(str);
			System.out.print("("+str+"," + n+")");
		}
		
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch7_p438_08 ex = new Ch7_p438_08();
		ex.run();	
		}
}
