package ch7_collection;

import java.util.*;
public class Ch7_p430_openchallenge {
	Scanner scanner = new Scanner(System.in);
	Vector<Word> v = new Vector<Word>();
	

	class Word {
		String eng;
		String kor;
		
		public Word(String eng,String kor) {
			this.eng= eng;
			this.kor=kor;
		}
		
		String geteng() {
			return eng; 
		}
		String getkor() {
			return kor;
		}
		
	}
	
	void run(){
		v.add(new Word("apple","사과"));
		v.add(new Word("love","사랑"));
		v.add(new Word("communication","의사소통"));
		v.add(new Word("bear","곰"));
		v.add(new Word("eye","눈"));
		v.add(new Word("society","사회"));
		
		
		System.out.println("명품영어의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 17개의 단어가 들어 있습니다.");
		quiz();
		
	}
	void quiz() {
		
		while(true) {
		int index=(int)(Math.random()*v.size());
		String question = v.get(index).eng;
		String answer = v.get(index).kor;
		System.out.println(question+"?");
		System.out.println(answer);

		
		for(int i=1; i<5; i++) {
			int num=(int)(Math.random()*v.size());
			System.out.print("("+i+")"+v.get(num).kor);
			
		}
		System.out.print(" :>");
		int user = scanner.nextInt();
		if(user==-1) {
			System.out.println("명품영어를 종료합니다...");
			break;
		}
		
		if(v.get(user).kor.equals(v.get(index).kor)) {
			System.out.println("Excellent !!");
		}
		else {
			System.out.println("No. !!");
		}
		
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch7_p430_openchallenge ex = new Ch7_p430_openchallenge();
		ex.run();
	}

}
