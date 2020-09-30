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
//이걸 몰랐다니..... printf()가  바이트로 ㄴ저장되어있는 것을 어떻게 출력하는지 확인했다. 허허