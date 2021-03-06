package mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Stock")
public class Stock 
{
	@Id
	@GeneratedValue
	@Column(name="id")
		private long stock_id;
	
	@Column(name="name")
		private String name;
	
	@Column(name="price")
		private int price;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Market_id")
	private Market market;
	
	public Stock() 
	{
		
	}
	
	public Stock(String name, int price)
	{
		this.price=price;
		this.name=name;
	}
	
	public void setMarket(Market market) {
		this.market = market;
	}

	public long getId() {
		return stock_id;
	}

	public void setId(long id) {
		this.stock_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [id=" + stock_id + ", name=" + name + ", price=" + price + "]";
	}

	
}
