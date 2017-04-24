package com.wpms.service;

import java.util.List;
import java.util.Map;

import com.wpms.model.Order;
import com.wpms.model.OrderDetail;
import com.wpms.model.User;

public interface OrderService {
	/**
	 * �����¶���
	 * @param user �û���Ϣ
	 * @param dmoney �������
	 * @param buypros ������Ʒ����
	 * 
	 */
	int addorder(User user, double dmoney, Map<String, Integer> buypros);
	/**
	 * ���ɶ�����ϸ
	 * @param order ������Ϣ
	 * @param buypros ������Ʒ����
	 */
	void setOrderDetail(Order order, Map<String, Integer> buypros);
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
	 * ��ѯ������Ʒ����
	 * @param buypros ������Ʒ��Ϣ
	 * 
	 */
	int getBuycount(Map<String, Integer> buypros);
}
