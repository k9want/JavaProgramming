package ch7_collection;

import java.util.*;
public class Ch7_p437_06 {
	
	class Location{
		String city;
		int lat;
		int lon;
		
		Location(String city,int lat,int lon){
			this.city=city;
			this.lat=lat;
			this.lon=lon;
		}
		void setCity(String city) {
			this.city=city;
		}
		String getCity(){
			return city;
		}
		void setLat() {
			this.lat=lat;
		}
		int getLat() {
			return lat;
		}
		
		void setLon() {
			this.lon=lon;
		}
		int getLon() {
			return lon;
		}
		
	}
	
	HashMap<String,Location> hm =new HashMap<String,Location>();
	Scanner scanner = new Scanner(System.in);
	
	void run() {
		System.out.println("����,�浵,������ �Է��ϼ���.");
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String city =scanner.next();
			int lat=scanner.nextInt();
			int lon=scanner.nextInt();
			hm.put(city, new Location(city,lat,lon));
		}
		
		Set<String> citys = hm.keySet(); //Set<>���� HashMap�� Ű �����ϴ� ��!!!!
		Iterator<String> it = citys.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			Location location =hm.get(str);
			System.out.println(location.getCity()+"  "+location.getLat()+ "  "+location.getLon());
		}
		
		System.out.println("------------------------");
		
		}
	
	void searchcity() {
		while(true) {
		System.out.print("���� �̸� >>");
		String str = scanner.next();
		if(str.equals("�׸�")) 
			return;
		
		if(hm.get(str)==null) {
			System.out.println(str+"�� �����ϴ�");
		}
		else {
			//System.out.println(hm.get(str));  
			//��� ch7_collection.Ch7_p437_06$Location@7ca48474
					
			//�߿��� �κ�(���������� �κ�)
			System.out.println(hm.get(str).city +"  "+hm.get(str).lat+ "  "+hm.get(str).lon);	
		}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch7_p437_06 ex =new Ch7_p437_06();
		ex.run();
		ex.searchcity();
		
		
		
	}

}
