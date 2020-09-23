package ch7_collection;
import java.util.*;
public class Ch7_p437_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Double> hm= new HashMap<String,Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("미래장학금관리시스템입니다.");
		for(int i=0; i<5; i++) {
			System.out.print("이름과 학점 >>"); 
			String name = scanner.next();
			double score =scanner.nextDouble();
			hm.put(name, score);
		}
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		System.out.print("장학생 선발 학점 기준 입력>>");
		double cut = scanner.nextDouble();
		System.out.print("장학생 명단 : ");
		
		for(int i=0; i<keys.size(); i++) {
			String str = it.next();
			double value = hm.get(str);
			if(value>=cut) {
				System.out.print(str + "  ");
			}
		}
		
		
		
		
		
	}

}
