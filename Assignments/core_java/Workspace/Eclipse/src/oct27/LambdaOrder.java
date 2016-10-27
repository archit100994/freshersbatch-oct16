package oct27;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Order
{
	int price;
	String status;
	public Order(int price, String status)
	{
		this.price=price;
		this.status=status;
	}
	
	public int getPrice() 
	{
		return price;
	}
	
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Order [price=" + price + ", status=" + status + "]";
	}
}


public class LambdaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Order> ols= new ArrayList<Order>();
		ols.add(new Order(15000, "ACCEPTED"));
		ols.add(new Order(1500, "ACCEPTED"));
		ols.add(new Order(20000, "COMPLETED"));
		ols.add(new Order(12000, "COMPLETED"));
		ols.add(new Order(8000, "ACCEPTED"));
		
		Predicate<Order> priceabove = (Order o) -> o.getPrice() > 10000 ? true:false;
		List<Order> ls1= filter(ols,priceabove);
		
		for(Order od:ls1)
			System.out.println(od+"");
		
		System.out.println("**************************************");
		
		Predicate<Order> status = (Order o) -> {return o.getStatus()=="ACCEPTED";};
		List<Order> ls2= filter(ols,status);
		
		for(Order od:ls2)
			System.out.println(od+"");
	}
	
	private static List<Order> filter(List<Order> list, Predicate<Order> p1)
	{
		List<Order> list2= new ArrayList<Order>();
		for(Order od: list)
		{
			if(p1.test(od))
				list2.add(od);
		}
		return list2;
	}

}
