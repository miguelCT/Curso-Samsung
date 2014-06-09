package Patrones.DAO.model.entity;

public class UserDetail {
	private int id;
	private String detail;
	private User user;

	public UserDetail(int id, String detail, User user) {
		this.id = id;
		this.detail = detail;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
