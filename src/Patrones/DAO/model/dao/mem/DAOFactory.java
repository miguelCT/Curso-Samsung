package Patrones.DAO.model.dao.mem;

import Patrones.DAO.model.dao.CategoryDAO;
import Patrones.DAO.model.dao.ShopDAO;
import Patrones.DAO.model.dao.ShoppingBasketDAO;
import Patrones.DAO.model.dao.UserDAO;
import Patrones.DAO.model.dao.UserDetailDAO;

public abstract class DAOFactory {

	
	
	public abstract CategoryDAO getCategoryDAO();

	public abstract UserDAO getUserDAO();

	public abstract UserDetailDAO getUserDetailDAO();

	public abstract ShopDAO getShopDAO();

	public abstract ShoppingBasketDAO getShoppingBasketDAO();
}
