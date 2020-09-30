package ch8_io;

public class PrintfByteoutput {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			byte b[]= new byte [6];
			int num[]= {1,2,4 ,5,6,7};
			int c;
			int n=0;
			for(int i=0; i<num.length; i++) {
			b[i]=(byte)num[i];
			System.out.println(b[i] + "  " + num[i] );
			}	
		

	}
}