package com.wpms.dao;

import java.util.List;

import com.wpms.model.Comment;

public interface CommentDao {
	/**
	 * ������ƷID��ѯ����
	 * @param proid ��ƷID
	 * 
	 */
	List<Comment> getCom(Integer proid);
	/**
	 * ��������
	 * @param comment ������Ϣ
	 * 
	 */
	int addCom(Comment comment);
	/**
	 * ��ȡ�������� 
	 * 
	 */
	List<Comment> getAllCom();
	/**
	 * ��������IDɾ������
	 * @param comid ����ID
	 * 
	 */
	int delCom(Integer comid);
	/**
	 * ��ѯ�û��Ƿ�����Ʒ
	 * @param proid ��ƷID
	 * @param userid �û�ID
	 *
	 */
	boolean checkbuy(Integer userid, String proname);

}
