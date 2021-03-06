package com.wpms.model;

public class Comment {
	private Integer comid;               //评论ID
	private Integer proid;               //商品ID
	private Integer userid;              //用户ID
	private String proname;              //商品名称
	private String username;             //用户名
	private String comitem;              //评论内容

	public Comment(Integer userid, String username, String comitem) {
		super();
		this.userid = userid;
		this.username = username;
		this.comitem = comitem;
	}

	public Comment(Integer proid, Integer userid, String proname, String username, String comitem) {
		super();
		this.proid = proid;
		this.userid = userid;
		this.proname = proname;
		this.username = username;
		this.comitem = comitem;
	}

	public Comment(Integer comid, Integer proid, Integer userid, String username, String comitem, String proname) {
		super();
		this.comid = comid;
		this.proid = proid;
		this.userid = userid;
		this.username = username;
		this.comitem = comitem;
		this.proname = proname;
	}

	public Integer getComid() {
		return comid;
	}

	public void setComid(Integer comid) {
		this.comid = comid;
	}

	public Integer getProid() {
		return proid;
	}

	public void setProid(Integer proid) {
		this.proid = proid;
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

	public String getComitem() {
		return comitem;
	}

	public void setComitem(String comitem) {
		this.comitem = comitem;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}
	
}
