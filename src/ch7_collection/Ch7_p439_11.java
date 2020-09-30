package ch7_collection;

import java.util.*;

public class Ch7_p439_11 {	
	Vector<Nation> v = new Vector<Nation>();
	Scanner scanner = new Scanner(System.in);
	

	class Nation{
		String country, capital;
		public Nation(String country, String capital){
			// TODO Auto-generated constructor stub
			
			this.country = country;
			this.capital = capital;
			
		}
		void Nation(){
			this.country = country;
			this.capital = capital;
		}
		void setCountry(String a) {
			this.country=country;
		}
		String getCountry() {
			return country;
			
		}
		String getCapital() {
		return capital;
	}
	
	
	
	}	
	
	void run() {
		
	
			v.add(new Nation("�ѱ�","����"));
			v.add(new Nation("�̱�","����"));
			v.add(new Nation("����","����"));
			v.add(new Nation("�׸���","���׳�"));
			v.add(new Nation("���þ�","��ũ��"));
			v.add(new Nation("�Ϻ�","����"));
			v.add(new Nation("�߱�","����¡"));
			v.add(new Nation("����","������"));
			v.add(new Nation("������","�ĸ�"));
			



		
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		System.out.print("�Է�:1, ����:2, ����:3>> ");
		int num = scanner.nextInt();
		switch(num) {
		
		case 1: input();
				break;
		case 2: quiz();
				break;
		case 3: finish();
				return;
		default:
			System.out.println("�߸��� �Է��Դϴ� ");
		}
	}
		
		boolean contains(String country){
			for(int i=0; i<v.size(); i++) {
				if(v.get(i).getCountry().equals(country)) {
					return true;
				}
				
			}
			return false;
		}
		void input(){
			int n = v.size();
			System.out.println("���� " +n+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
			n++;
			while(true) {
				System.out.print("����� ���� �Է�"+n+">>");
				
				String country = scanner.next();
				if(country.equals("�׸�"))
					break;
				String capital = scanner.next();
				
				if(contains(country)) {
					System.out.println(country+"�� �̹� �ֽ��ϴ�.");
					continue;
				}
				else {
					v.add(new Nation(country,capital));
					n++;
				}
			}
		}
		
		void quiz() {
			while(true) {
				int index = (int)(Math.random()*v.size());
				
				Nation nation = v.get(index);
				String question=nation.getCapital();
				String answer = nation.getCountry();
				
				System.out.print(question+"�� ������?");
				
				String user = scanner.next();
				if(answer.equals(user)) {
					System.out.println("����!!");
				}
				else {
					System.out.println("�ƴմϴ�!!");
				}
			}
		}
		
		void finish() {
			System.out.println("������ �����մϴ�.");
		}
		
	
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch7_p439_11 ex = new Ch7_p439_11();
		ex.run();
	}

}

