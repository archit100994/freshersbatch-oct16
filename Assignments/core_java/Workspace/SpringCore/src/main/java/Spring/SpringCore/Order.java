package Spring.SpringCore;

public class Order
{
	int id;
	Item item;
	
	public Order()
	{
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", item=" + item + "]";
	}

	
}
