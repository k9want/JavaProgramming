package ch7_collection;
import java.util.*;

public class Ch7_p438_08 {
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	Scanner scanner = new Scanner(System.in);

	void run() {
	System.out.println("**����Ʈ ���� ���α׷� �Դϴ� **");
	
	while(true) {
		System.out.print("�̸��� ����Ʈ �Է�>>");
		String name=scanner.next();
		if(name.equals("�׸�")) {
			return;
		}
		int point = scanner.nextInt();
		if(hm.get(name) !=null) {
			point +=hm.get(name);
		}
		hm.put(name, point);
		printall();	
		/*���⼭ �ȵǴ� ������ ???
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
