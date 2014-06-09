package Patrones.DAO.model.dao.mem;

import Patrones.DAO.model.dao.ShopDAO;
import Patrones.DAO.model.entity.Shop;

public class MemShopDAO extends MemGenericDAO<Shop, Integer>  implements ShopDAO {

	@Override
	public Integer getID(Shop entity) {
		return entity.getId();
	}



}
