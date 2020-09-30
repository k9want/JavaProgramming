package ch5_inheritance;

class Point{
	private int x,y;
	Point(){
		
	}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	
	void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
}

class ColorPoint extends Point{
	
	String color;
	public ColorPoint(){}
	
	ColorPoint(int x,int y, String color){
	super(x,y);
	this.color=color;
	}
	void setXY(int x, int y){
		move(x,y);
	}
	void setColor(String color) {
		this.color=color;
	}
	String getColor(){
		return color;
	}
	public String toString(){
		return getColor()+"색의 ("+getX()+","+getY()+")"+"의 점";
	}
}

public class Ch5_p317_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5,5,"Yellow");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str =cp.toString();
		System.out.println(str + "입니다 ");
	}

}
