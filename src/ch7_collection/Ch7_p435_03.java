package ch7_collection;

import java.util.*;

public class Ch7_p435_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner =new Scanner(System.in);
	
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");
		while(true) {
			
			System.out.print("���� �̸�, �α� >> ");
			String str = scanner.next();
			if(str.equals("�׸�")) {
				break;
			}
			int people= scanner.nextInt();
			nations.put(str, people);		
			}
		 //while ����
		while(true) {
			System.out.print("�α� �˻� >>");
			String str= scanner.next(); //str�� �Է��ؼ� 
			if(str.equals("�׸�")) {
				break;
			}		
			if(nations.get(str)==null) {  //�ش� str(key)�� �´� ��(value)�� �ִ��� ������ �Ǵ� 
				System.out.println(str + " ����� �����ϴ�");
			}
			else {
				System.out.println(str + "�� �α��� ���� " +nations.get(str));
			}			
		}	
	}

}
