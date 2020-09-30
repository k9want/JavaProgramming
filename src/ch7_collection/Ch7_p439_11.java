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
		
	
			v.add(new Nation("한국","서울"));
			v.add(new Nation("미국","뉴욕"));
			v.add(new Nation("영국","런던"));
			v.add(new Nation("그리스","아테네"));
			v.add(new Nation("러시아","모스크바"));
			v.add(new Nation("일본","도쿄"));
			v.add(new Nation("중국","베이징"));
			v.add(new Nation("독일","베를린"));
			v.add(new Nation("프랑스","파리"));
			



		
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
		int num = scanner.nextInt();
		switch(num) {
		
		case 1: input();
				break;
		case 2: quiz();
				break;
		case 3: finish();
				return;
		default:
			System.out.println("잘못된 입력입니다 ");
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
			System.out.println("현재 " +n+"개 나라와 수도가 입력되어 있습니다.");
			n++;
			while(true) {
				System.out.print("나라와 수도 입력"+n+">>");
				
				String country = scanner.next();
				if(country.equals("그만"))
					break;
				String capital = scanner.next();
				
				if(contains(country)) {
					System.out.println(country+"는 이미 있습니다.");
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
				
				System.out.print(question+"의 수도는?");
				
				String user = scanner.next();
				if(answer.equals(user)) {
					System.out.println("정답!!");
				}
				else {
					System.out.println("아닙니다!!");
				}
			}
		}
		
		void finish() {
			System.out.println("게임을 종료합니다.");
		}
		
	
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch7_p439_11 ex = new Ch7_p439_11();
		ex.run();
	}

}

