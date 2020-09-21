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
		
		map.put("황기태", new Student(1,"1234-5678"));
		map.put("유리운" ,new Student(2,"1324-5867"));
		
		Scanner scanner = new Scanner(System.in);
		
		
		//이름을 검색해서 id랑 tel 출력하기 
		while(true) {
		System.out.print("검색할 이름은? ");
		String str = scanner.nextLine();
		if(str.equals("exit")) {
			System.out.println("종료합니다");
			
			
			//순차검색 Iterator를 사용해서 전체 출력하기 
			Set<String> keys = map.keySet();  //map의 K값을 받아와서 keys저장하고 
			Iterator<String> it =keys.iterator(); //keys 검색하고 it에 저장하고 
			
			
			//it에 K들을 하나하나 다 검색해서 출력하고 
			while(it.hasNext()) {				
				String _str = it.next();
				Student value = map.get(_str);
				
				System.out.println(_str.toString() +" "+value.getid()+", "+value.gettel());				
			}
			break;
		}
		Student student = map.get(str); //str에 해당하는 Student 객체 생성 
		if(str==null){
			System.out.println(str+"은 없는 사람입니다");
		}
		else {
			System.out.println(student.getid()+", " +student.gettel());
		}
		}
		scanner.close();
	}

}
