package Patrones.DAO.model.entity;

import java.util.Date;
import java.util.Set;

public class ShoppingBasket {
	private int id;
	private Date date;
	private Set<Shop> shops;

	public ShoppingBasket(int id, Date date, Set<Shop> shops) {
		this.id = id;
		this.date = date;
		this.shops = shops;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<Shop> getShops() {
		return shops;
	}

	public void setShops(Set<Shop> shops) {
		this.shops = shops;
	}

}
