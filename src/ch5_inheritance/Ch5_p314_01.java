package ch5_inheritance;



class TV{
	private int size;
	public TV(int size) {this.size = size; }
	protected int getSize() {return size; }
}


public class Ch5_p314_01 extends TV {
	
	private int color;
	
public  Ch5_p314_01(int size,int color) {	
	super(size);
	this.color=color;
	
}
	void printProperty(){
				
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch5_p314_01 myTV = new Ch5_p314_01 (32,1024);
		myTV.printProperty();
	}


}