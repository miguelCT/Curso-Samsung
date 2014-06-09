package Patrones.DAO.model.dao.mem;

import Patrones.DAO.model.dao.UserDAO;
import Patrones.DAO.model.entity.User;

public class MemUserDAO extends MemGenericDAO<User, Integer>  implements UserDAO{

	@Override
	public Integer getID(User entity) {
		return entity.getId();
	}


}
