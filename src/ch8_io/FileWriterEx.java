package ch8_io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		
		try {
		fout = new FileWriter("C:\\Users\\USER\\Desktop\\FileWriter.txt");
		while(true) {
			String str = scanner.nextLine();
			if(str.length() ==0)
				break;
			fout.write(str);
			fout.write("\r\n"); //�����쿡��  �ٹٲ��� \r\n �̴�
		}
			fout.close();
			
		}catch(IOException e) {
			System.out.println("����� ���� ");
		}
		scanner.close();
	}

}
