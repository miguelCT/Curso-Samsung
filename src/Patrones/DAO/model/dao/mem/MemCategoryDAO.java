package Patrones.DAO.model.dao.mem;

import Patrones.DAO.model.dao.CategoryDAO;
import Patrones.DAO.model.entity.Category;
import Patrones.DAO.model.entity.User;

public class MemCategoryDAO extends MemGenericDAO<Category, Integer>  implements CategoryDAO {

	@Override
	public Integer getID(Category entity) {
		return entity.getId();
	}




	


	

}
