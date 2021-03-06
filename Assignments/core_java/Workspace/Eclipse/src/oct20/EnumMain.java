package oct20;

enum Status
{
	New(0), Rejected(1), Accepted(2), Completed(3);
	
	private int val;
	
	Status(int value)
	{
		this.val=value;
	}
	
	int getValue()
	{
		return this.val;
	}
}


class Order
{
	int id;
	String name;
	int quantity;
	int price;
	
	Status s;
	
	public Order(int ID, String name, int quantity, int price, Status s)
	{
		this.id=ID;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
		
		this.s= s;
	}
	
	public String toString()
	{
		return ("Id= "+ id + "\n Name= "+ name + "\n quantity= "+ quantity + "\n Price= "+ price + "\n Status= "+ s.getValue());
	}
}

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o= new Order(10, "Archit", 2, 50, Status.New);
		System.out.println(o);

	}

}
