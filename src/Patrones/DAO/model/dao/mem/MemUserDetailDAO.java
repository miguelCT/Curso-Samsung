package Patrones.DAO.model.dao.mem;

import Patrones.DAO.model.dao.UserDetailDAO;
import Patrones.DAO.model.entity.User;
import Patrones.DAO.model.entity.UserDetail;

public class MemUserDetailDAO extends MemGenericDAO<UserDetail, Integer>  implements UserDetailDAO{

	@Override
	public User findByUserId(int userID) {
		return null;
	}

	@Override
	public Integer getID(UserDetail entity) {
		return entity.getId();
	}

	

	

}
