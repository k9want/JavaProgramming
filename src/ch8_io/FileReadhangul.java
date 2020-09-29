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
			in = new InputStreamReader(fin,"MS949");
			int c;
			
			System.out.println(in.getEncoding());
			
			while((c= in.read()) != -1) {
				
				System.out.println((char)c);
							
			}
			
			in.close();
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력오류");
		}
	}

}
