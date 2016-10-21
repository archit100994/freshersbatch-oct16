package oct21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputoutputStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file= new File("Account");
		
		FileOutputStream  fos= new FileOutputStream(file);
		FileInputStream fin= new FileInputStream(file);
		
		DataOutputStream dos= new DataOutputStream(fos);
		DataInputStream dis= new DataInputStream(fin);
		
		dos.writeInt(4619);
		dos.writeDouble(34999.99);
		dos.writeUTF("Archit");
		
		dos.writeInt(4694);
		dos.writeDouble(4999.99);
		dos.writeUTF("Toshi");
		
		dos.writeInt(5562);
		dos.writeDouble(399.99);
		dos.writeUTF("Pata nahi");
		
		dos.flush();
		fos.flush();
		
		int id = dis.readInt();
		Double balance= dis.readDouble();
		String name= dis.readUTF();
		
		System.out.println("Account No: "+ id + "\tBalance: "+ balance + "\tName: "+ name);
		
		id = dis.readInt();
		balance= dis.readDouble();
		name= dis.readUTF();
		
		System.out.println("Account No: "+ id + "\tBalance: "+ balance + "\tName: "+ name);
		
		id = dis.readInt();
		balance= dis.readDouble();
		name= dis.readUTF();
		
		System.out.println("Account No: "+ id + "\tBalance: "+ balance + "  \tName: "+ name);
		
		dos.close();
		dis.close();
		fin.close();
		fos.close();
		
	}

}
