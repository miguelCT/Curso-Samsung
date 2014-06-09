package Patrones.DAO.model.dao;

import Patrones.DAO.model.entity.User;
import Patrones.DAO.model.entity.UserDetail;

public interface UserDetailDAO extends GenericDAO<UserDetail, Integer> {
	public User findByUserId(int userID);
}
