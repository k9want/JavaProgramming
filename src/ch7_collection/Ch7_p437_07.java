package ch7_collection;
import java.util.*;
public class Ch7_p437_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Double> hm= new HashMap<String,Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		for(int i=0; i<5; i++) {
			System.out.print("�̸��� ���� >>"); 
			String name = scanner.next();
			double score =scanner.nextDouble();
			hm.put(name, score);
		}
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		System.out.print("���л� ���� ���� ���� �Է�>>");
		double cut = scanner.nextDouble();
		System.out.print("���л� ��� : ");
		
		for(int i=0; i<keys.size(); i++) {
			String str = it.next();
			double value = hm.get(str);
			if(value>=cut) {
				System.out.print(str + "  ");
			}
		}
		
		
		
		
		
	}

}
