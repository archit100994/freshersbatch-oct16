package oct21;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class MultipleFiles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream f1= new FileInputStream("a4_1.txt");
		FileInputStream f2= new FileInputStream("a4_2.txt");
		FileInputStream f3= new FileInputStream("a4_3.txt");
		
		SequenceInputStream si= new SequenceInputStream(f1, f2);
		SequenceInputStream sis= new SequenceInputStream(si, f3);
		
		int i;
		
//		while(i>=0)
//		{
//			i= sis.read();
//			if(i!=1)
//				System.out.println((char)i);
//		}
//		
		while((i=sis.read())!=-1){
			System.out.print((char)i);
			}
		
		sis.close();
		f1.close();
		f2.close();
		
	}

}
