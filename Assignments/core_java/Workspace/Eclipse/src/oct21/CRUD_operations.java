package oct21;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class AccountCRUD
{
	private int number;
	private transient String name;
	private double balance;
	private long startingLocation;
	private long endingLocation;
	
	public AccountCRUD(int number, String name, double balance) {
		super();
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public long getStartingLocation() {
		return startingLocation;
	}

	public void setStartingLocation(long startingLocation) {
		this.startingLocation = startingLocation;
	}

	public long getEndingLocation() {
		return endingLocation;
	}

	public void setEndingLocation(long endingLocation) {
		this.endingLocation = endingLocation;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public void createAccount(RandomAccessFile raf) throws IOException{
		this.setStartingLocation(raf.getFilePointer());
		raf.writeInt(this.number);
		raf.writeUTF(this.name);
		raf.writeDouble(this.balance);
		this.setEndingLocation(raf.getFilePointer());
	}

	public void retrieveAccount(RandomAccessFile raf) throws IOException{
		raf.seek(this.getStartingLocation());
		System.out.println(raf.readInt() +" - "+ raf.readUTF()+" - "+ raf.readDouble());
	}

	public void updateAccount(RandomAccessFile raf, AccountCRUD a) throws IOException{
		raf.seek(this.getStartingLocation());
		raf.writeInt(a.number);
		raf.writeUTF(a.name);
		raf.writeDouble(a.balance);
	}

	public void deleteAccount(RandomAccessFile raf) throws IOException{
		raf.seek(this.getStartingLocation());
		raf.writeInt(0);
		raf.writeUTF("");
		raf.writeDouble(0.0);
	}
}






public class CRUD_operations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		AccountCRUD accounts[] = new AccountCRUD[3];
		accounts[0] = new AccountCRUD(1, "Shrey", 1000);
		accounts[1] = new AccountCRUD(2, "Shreya", 2000);
		accounts[2] = new AccountCRUD(3, "Shreyas", 3000);
		
		
		File file = new File("A6.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		
		accounts[0].createAccount(raf);
		accounts[1].createAccount(raf);
		accounts[2].createAccount(raf);
		accounts[1].retrieveAccount(raf);
		accounts[1].updateAccount(raf, new AccountCRUD(4, "Archit", 10000));
		accounts[1].retrieveAccount(raf);
		accounts[1].deleteAccount(raf);
		accounts[1].retrieveAccount(raf);
		raf.close();
				
				
		
		
	}

}
