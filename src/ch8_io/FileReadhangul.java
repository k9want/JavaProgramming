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
			fin = new FileInputStream("C:\\Users\\USER\\Desktop\\������ �뷡-���ĵ�����.txt");
			in = new InputStreamReader(fin,"MS949"); //2��° �Ű��������� ���������� �ִ´�. 
			int c; //int������ �����Ѵ�. byte , char���� �ƴϴ�. 
			
			System.out.println(in.getEncoding()); //���������� ����Ѵ�.
			
			while((c= in.read()) != -1) {  //������ ���� ������  -1�� ����ϱ� ������ 		
			System.out.println((char)c);				
			}
			
			in.close();
			fin.close();
		}catch(IOException e) {
			System.out.println("����¿���");
		}
	}

}
