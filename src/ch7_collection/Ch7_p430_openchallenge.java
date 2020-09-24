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
	
	
	class Problem{
		int pro[]= {-1, -1, -1, -1};
		
		public Problem(int index, int size) {
			int answernum=(int)(Math.random()*4); //0~3 정답 번호 4개 맘대로
			pro[answernum]=index;
			for(int i=0; i<4; i++) {
				int n= (int)(Math.random()*size);
				if(pro[i]==-1) {
					pro[i]=n;
				}
				else 
					continue;
	
			for(int j=0; j<4; j++) {
				if(i !=j &&pro[j]==pro[i]) {
					if(i==0) { //i ==0 일때 i--가 되면 실행이 안된다. i=-1이 되버리니까 그러므로 따라 if으로 빼야한다.
						i=0;
					}
					else
						i--;
				}
				else 
					continue;
			}
			
		}
		
		
		
	}
	}
	void quiz(){
		
		while(true) {
		int index=(int)(Math.random()*v.size());
		String question = v.get(index).geteng();
		System.out.println(question+"?");
		
		
		Problem pb = new Problem(index, v.size());
		for(int i=0; i<4; i++) {
			System.out.print("("+ (i+1) +")"+v.get(pb.pro[i]).getkor());
		}
		
		System.out.print(" :>");
		int user = scanner.nextInt();

		if(user==-1) {
			System.out.println("명품영어를 종료합니다...");
			break;
		}
		
		else if(pb.pro[user-1]==index) {
			System.out.println("Excellent !!");
		}
		else {
			System.out.println("No. !!");
		}
		
		
		}//
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch7_p430_openchallenge ex = new Ch7_p430_openchallenge();
		ex.run();
	}

}
