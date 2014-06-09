package Patrones.DAO.model.entity;

public class Shop {
	private int id;
	private int amout;
	private String description;
	private ShoppingBasket shoppingBasket;

	public Shop(int id, int amout, String description,
			ShoppingBasket shoppingBasket) {
		super();
		this.id = id;
		this.amout = amout;
		this.description = description;
		this.shoppingBasket = shoppingBasket;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmout() {
		return amout;
	}

	public void setAmout(int amout) {
		this.amout = amout;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ShoppingBasket getShoppingBasket() {
		return shoppingBasket;
	}

	public void setShoppingBasket(ShoppingBasket shoppingBasket) {
		this.shoppingBasket = shoppingBasket;
	}

}
