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
		System.out.println("도시,경도,위도를 입력하세요.");
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String city =scanner.next();
			int lat=scanner.nextInt();
			int lon=scanner.nextInt();
			hm.put(city, new Location(city,lat,lon));
		}
		
		Set<String> citys = hm.keySet(); //Set<>으로 HashMap의 키 저장하는 거!!!!
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
		System.out.print("도시 이름 >>");
		String str = scanner.next();
		if(str.equals("그만")) 
			return;
		
		if(hm.get(str)==null) {
			System.out.println(str+"는 없습니다");
		}
		else {
			//System.out.println(hm.get(str));  
			//결과 ch7_collection.Ch7_p437_06$Location@7ca48474
					
			//중요한 부분(오래생각한 부분)
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
