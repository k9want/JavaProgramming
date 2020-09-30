package ch8_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadhangul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("C:\\Users\\USER\\Desktop\\오래된 노래-스탠딩에그.txt");
			in = new InputStreamReader(fin,"MS949"); //2번째 매개변수에는 문자집합을 넣는다. 
			int c; //int형으로 리턴한다. byte , char형이 아니다. 
			
			System.out.println(in.getEncoding()); //문자집합을 출력한다.
			
			while((c= in.read()) != -1) {  //파일의 끝을 읽으며  -1을 출력하기 때문에 		
			System.out.println((char)c);				
			}
			
			in.close();
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력오류");
		}
	}

}
