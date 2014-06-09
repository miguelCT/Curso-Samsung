package Patrones.DAO.model.dao.mem;

import Patrones.DAO.model.dao.ShoppingBasketDAO;
import Patrones.DAO.model.entity.ShoppingBasket;

public class MemShoppingBasketDAO extends MemGenericDAO<ShoppingBasket, Integer>  implements ShoppingBasketDAO{

	@Override
	public Integer getID(ShoppingBasket entity) {
		return entity.getId();
	}



}
