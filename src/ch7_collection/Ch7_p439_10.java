package ch7_collection;

import java.util.*;
public class Ch7_p439_10 {
	

	public abstract class Shape{
		Shape next;
		Shape(){next = null;}
		void setNext(Shape obj) {next =obj;}
		Shape getNext() {return next;}
		abstract void draw();
		
	}
	
	class Line extends Shape{
		void draw(){
			System.out.println("Line");
		}
	}
	
	class Rect extends Shape{
		void draw(){
			System.out.println("Rect");
		}
	}
	
	class Circle extends Shape{
		void draw(){
			System.out.println("Circle");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Shape> v =new Vector<Shape>();
		
	}

}
