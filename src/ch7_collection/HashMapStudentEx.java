package ch7_collection;

import java.util.*;

class Student{
	int id;
	String tel;
	
	Student(int id,String tel){
		this.id=id;
		this.tel=tel;
		}
	
	public int getid(){
		return id;
	}
	public String gettel() {
		return tel;
	}
	
	
}


public class HashMapStudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String ,Student> map = new HashMap<String,Student>();
		
		map.put("Ȳ����", new Student(1,"1234-5678"));
		map.put("������" ,new Student(2,"1324-5867"));
		
		Scanner scanner = new Scanner(System.in);
		
		
		//�̸��� �˻��ؼ� id�� tel ����ϱ� 
		while(true) {
		System.out.print("�˻��� �̸���? ");
		String str = scanner.nextLine();
		if(str.equals("exit")) {
			System.out.println("�����մϴ�");
			
			
			//�����˻� Iterator�� ����ؼ� ��ü ����ϱ� 
			Set<String> keys = map.keySet();  //map�� K���� �޾ƿͼ� keys�����ϰ� 
			Iterator<String> it =keys.iterator(); //keys �˻��ϰ� it�� �����ϰ� 
			
			
			//it�� K���� �ϳ��ϳ� �� �˻��ؼ� ����ϰ� 
			while(it.hasNext()) {				
				String _str = it.next();
				Student value = map.get(_str);
				
				System.out.println(_str.toString() +" "+value.getid()+", "+value.gettel());				
			}
			break;
		}
		Student student = map.get(str); //str�� �ش��ϴ� Student ��ü ���� 
		if(str==null){
			System.out.println(str+"�� ���� ����Դϴ�");
		}
		else {
			System.out.println(student.getid()+", " +student.gettel());
		}
		}
		scanner.close();
	}

}
