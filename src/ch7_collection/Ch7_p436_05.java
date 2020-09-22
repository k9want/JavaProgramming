package ch7_collection;

import java.util.*;



public class Ch7_p436_05 {
	
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> al = new ArrayList<Student>();
	
	public class Student{
		String name;
		String major;
		String id;
		double avg;
				
		public Student(String name, String major,String id,double avg){
		 this.name=name;
		 this.major=major;
		 this.id=id;
		 this.avg=avg;
		}
		
		public void setName(String name) {
			this.name= name;
		}
		public String getName() {
			return name;
		}
		public void setMajor(String major) {
			this.major= major;
		}
		public String getMajor() {
			return major;
		}
		public void setid(String id) {
			this.id= id;
		}
		public String getid() {
			return id;
		}
		public void setavg(double avg) {
			this.avg= avg;
		}
		public double getavg() {
			return avg;
		}
		
	}
	

	
	void read() {
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		for(int i=0; i<2; i++) {
			System.out.print(">>  ");
			
			String name =scanner.next();
			String major=scanner.next();
			String id=scanner.next();
			double avg=scanner.nextDouble();
			
			
			/*
			
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String id = st.nextToken().trim();
			double avg = Double.parseDouble(st.nextToken().trim());
			*/
			
			Student student =new Student(name, major, id, avg);
			al.add(student);		
		}
	}
	//set,get�޼ҵ� ȣ�� 
	private void printAll() {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println("-------------");
			System.out.println("�̸� :"+student.getName());
			System.out.println("�а� :"+student.getMajor());
			System.out.println("�й� :"+student.getid());
			System.out.println("������� :"+student.getavg());
			System.out.println("-------------");
		}
	}
	
	/*�̰͵� ���� 
	private void printAll() {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println("-------------");
			System.out.println("�̸� :"+student.name);
			System.out.println("�а� :"+student.major);
			System.out.println("�й� :"+student.id);
			System.out.println("������� :"+student.avg);
		}
	}
	*/
	private void printavg() {

		while(true) {
		System.out.print("�л� �̸� >>");
		String str = scanner.nextLine();
		if(str.equals("�׸�")) {
			return; // break return ���� break�� ���� Ż�� , return�� �ش� �������� ���� �޼ҵ带 ���� 
		}
		
		for(int i=0; i<al.size();i++) {
			Student student =al.get(i);
			if(student.getName().equals(str)) {
				System.out.println
				("�̸� :"+student.name + " �а� :"+student.major + " �й� :"+student.id+" ������� :"+student.avg);
				break;
			}
		}
		
		}
	}
	
	
	void run(){
		read();
		printAll();
		printavg();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ch7_p436_05 ex = new Ch7_p436_05();
		ex.run();
	
	}
}
