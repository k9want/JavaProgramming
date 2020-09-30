package ch5_inheritance;


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
		System.out.println("���� IPTV�� "+getIP()+" �ּ���"+getSize()+"��ġ "+getColor()+"�÷�");
	}
}
public class Ch5_p315_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();

	}

}
