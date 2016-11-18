package caching;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product
{
	@Id
	@GeneratedValue
	@Column(name="p_id")
		private int p_id;
	
	@Column(name="name")
		private String name;
	
	@Column(name="cost")
		private int cost;
	
	public Product()
	{
		
	}
	
	public Product(String name, int cost)
	{
		this.cost=cost;
		this.name=name;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
}
