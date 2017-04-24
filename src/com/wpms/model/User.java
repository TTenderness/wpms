package com.wpms.model;

public class User {
	private Integer userid;               //�û�ID
	private String username;              //�û���
	private String userpwd;               //�û�����
	private String userrole;              //�û���ɫ
	private Double useraccount;           //�û��˻�
	private String usersex;               //�û��Ա�
	private String usermail;              //�û�����

	public User(Integer userid, String username, String userpwd, Double useraccount, String usersex, String usermail) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.useraccount = useraccount;
		this.usersex = usersex;
		this.usermail = usermail;
	}

	public User(Integer userid, String username, String userpwd, String userrole, Double useraccount, String usersex,
			String usermail) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.userrole = userrole;
		this.useraccount = useraccount;
		this.usersex = usersex;
		this.usermail = usermail;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public Double getUseraccount() {
		return useraccount;
	}

	public void setUseraccount(Double useraccount) {
		this.useraccount = useraccount;
	}

	public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUsermail() {
		return usermail;
	}

	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	
}
