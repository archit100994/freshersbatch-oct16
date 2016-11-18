package mapping;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Market")
public class Market
{
	@Id
	@GeneratedValue
	@Column(name="id")
		private long id;
	
	@Column(name="name")
		private String name;
	
	@OneToMany(mappedBy="market", cascade={CascadeType.ALL})
	private Set<Stock> stock;
	
	public Market()
	{
		
	}
	
	public Market(String name)
	{
		this.name=name;
	}
	
	public void setStock(Set<Stock> stock) {
		this.stock = stock;
	}
	
	public Set<Stock> getStock() {
		return stock;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + " Stock= [ " + stock +  "]" + "]";
	}
	
	
}
