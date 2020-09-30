package ch7_collection;

import java.util.*;

public class Ch7_p434_02 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		ArrayList<Character> grade = new ArrayList<Character>();
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for(int i=0; i<6; i++) {
		char n = scanner.next().charAt(0);
		grade.add(n);
		
		}
		double sum = 0.0;
		double avg;
		for(int i =0; i<grade.size(); i++) {
			switch(grade.get(i)) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				
				sum += 0;
				break;
			}
		}
		avg = sum / 6;
		System.out.println(avg);
	}

}
