package Patrones.DAO.model.dao.mem;

import Patrones.DAO.model.dao.CategoryDAO;
import Patrones.DAO.model.dao.ShopDAO;
import Patrones.DAO.model.dao.ShoppingBasketDAO;
import Patrones.DAO.model.dao.UserDAO;
import Patrones.DAO.model.dao.UserDetailDAO;

public class MemDAOfactory extends DAOFactory{

	private static MemDAOfactory factoria;
	
	private MemDAOfactory(){
		this.factoria= new MemDAOfactory();
	}
	
	public MemDAOfactory getFactoria(){
		return this.factoria;
	}
	@Override
	public CategoryDAO getCategoryDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDAO getUserDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetailDAO getUserDetailDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopDAO getShopDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoppingBasketDAO getShoppingBasketDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
