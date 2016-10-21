package oct21;

import java.io.*;

public class ReadWrite {

	public static void main(String[] args) throws Exception {
		File file= new File("abc.txt");
		FileOutputStream fos = new FileOutputStream(file);
		FileInputStream fis= new FileInputStream(file);
		StringBuilder str= new StringBuilder("");
		fos.write("Read Write file".getBytes());
		
		fos.flush();
		
		int i=0;
		while(i>=0){
			i = fis.read();
			if(i != -1)
			str.append((char)i);
		}
		
		while(i != -1); // -1 represents end of file (EOF)
		System.out.println("File contents: " + str);
		fis.close();
		fos.close();
	}
}
