package com.wpms.dao;

import java.util.List;

import com.wpms.model.Order;
import com.wpms.model.OrderDetail;

public interface OrderDao {
	/**
	 * �����¶���
	 * @param order ������Ϣ
	 * 
	 */
	int addOrder(Order order);
	/**
	 * ���ɶ�����ϸ
	 * @param detail ������ϸ��Ϣ
	 */
	void addOrderDetail(OrderDetail detail);
	/**
	 * �����û�ID��ѯ�����ж���
	 * @param uid �û�ID
	 * 
	 */
	List<Order> getAllOrder(Integer uid);
	/**
	 * �������һ������
	 * 
	 */
	Order getOrder();
	/**
	 * ���ݶ�����Ų�ѯ������ϸ
	 * @param oid �������
	 * 
	 */
	List<OrderDetail> getOrderDil(Integer oid);
	/**
	 * ��ȡ���ж���
	 *
	 */
	List<Order> getAllOrd();
	/**
	 * ���ݶ������ɾ������
	 * @param oid �������
	 * 
	 */
	int delOrder(Integer oid);
	/**
	 * ������Ʒ����
	 * @param proid ��ƷID
	 * @param count ��Ʒ����
	 */
	void updProcount(String proname, int count);
	
}
