package com.wpms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Integer orderid;              			 //����ID
	private Integer userid;               		     //�û�ID
	private Integer ordercount;            		     //������Ʒ����
	private Date ordertime;              	     	 //����ʱ��
	private Double ordermoney;            		     //�����ܽ��
	private List<OrderDetail> details;               //������ϸ����

	public Order(Integer orderid, Integer ordercount, Double ordermoney) {
		super();
		this.orderid = orderid;
		this.ordercount = ordercount;
		this.ordermoney = ordermoney;
	}

	public Order(Integer orderid, Integer userid, Integer ordercount, Date ordertime, Double ordermoney) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.ordercount = ordercount;
		this.ordertime = ordertime;
		this.ordermoney = ordermoney;
	}

	public Order() {
		details = new ArrayList<OrderDetail>();
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getOrdercount() {
		return ordercount;
	}

	public void setOrdercount(Integer ordercount) {
		this.ordercount = ordercount;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public Double getOrdermoney() {
		return ordermoney;
	}

	public void setOrdermoney(Double ordermoney) {
		this.ordermoney = ordermoney;
	}

	public List<OrderDetail> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetail> details) {
		this.details = details;
	}

}
