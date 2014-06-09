package Patrones.DAO.model.entity;

public class User {
	private int id;
	private String name;
	private String password;
	private int level;
	private UserDetail userDetail;

	public User(int id, String name, String password, int level,
			UserDetail userDetail) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.level = level;
		this.userDetail = userDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}
