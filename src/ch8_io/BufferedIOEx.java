package ch8_io;

import java.io.*;
import java.util.*;

public class BufferedIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		try { 
			fin = new FileReader("C:\\Users\\USER\\Desktop\\FileWriter.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while((c = fin.read()) != -1){
				out.write(c);
			}
			
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();  //에러 메시지의 발생 근원지를 찾아서 단계별로 에러를 출력하는 메소드.
		}
	}

}
