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
		v.add(new Word("apple","���"));
		v.add(new Word("love","���"));
		v.add(new Word("communication","�ǻ����"));
		v.add(new Word("bear","��"));
		v.add(new Word("eye","��"));
		v.add(new Word("society","��ȸ"));
		
		System.out.println("��ǰ������ �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� 17���� �ܾ ��� �ֽ��ϴ�.");
		quiz();
	}
	
	
	class Problem{
		int pro[]= {-1, -1, -1, -1};
		
		public Problem(int index, int size) {
			int answernum=(int)(Math.random()*4); //0~3 ���� ��ȣ 4�� �����
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
					if(i==0) { //i ==0 �϶� i--�� �Ǹ� ������ �ȵȴ�. i=-1�� �ǹ����ϱ� �׷��Ƿ� ���� if���� �����Ѵ�.
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
			System.out.println("��ǰ��� �����մϴ�...");
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
