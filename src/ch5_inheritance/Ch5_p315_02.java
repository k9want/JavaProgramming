package ch5_inheritance;

class TV{
	private int size;
	public TV(int size) {this.size = size; }
	protected int getSize() {return size; }
}

class ColorTV extends TV{
	int color;
	
	public ColorTV(int size,int color){
		super(size);
		this.color = color;
	}
	
	int getColor() {
		return color;
	}
	
	
	void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
}

class IPTV extends ColorTV{
	String IP;
	public IPTV(String IP,int size,int color) {
		super(size,color);
		this.IP=IP;
	
	}
	
	String getIP() {
		return IP;
	}
	
	void printProperty() {
		System.out.println("나의 IPTV는 "+getIP()+" 주소의"+getSize()+"인치 "+getColor()+"컬러");
	}
	
}



public class Ch5_p315_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();

	}

}
